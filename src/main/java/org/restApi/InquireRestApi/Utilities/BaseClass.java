package org.restApi.InquireRestApi.Utilities;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseClass {

    public List<Map<String,String>> getPojoList(ResultSet resultSet) throws SQLException, IOException {
        List<Map<String , String >> resultList = new ArrayList<>();
        while(resultSet.next()){
            ResultSetMetaData rsmd = resultSet.getMetaData();
            Map<String, String> map = new HashMap();
            for(int i = 1; i <= rsmd.getColumnCount(); i++){
                String columnName = rsmd.getColumnName(i);
                String data = resultSet.getString(i);
                map.put(columnName,data != null ? data : null);
            }
            resultList.add(map);
        }
        return resultList;
    }

    public <T> T convertMapToBean(Map<String,String> map, Class<T> valueType){
        ObjectMapper mapper = new ObjectMapper();
        mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        if(null == map){
            throw new ClassCastException("Input map is null");
        }
        return mapper.convertValue(map,valueType);
    }



}
