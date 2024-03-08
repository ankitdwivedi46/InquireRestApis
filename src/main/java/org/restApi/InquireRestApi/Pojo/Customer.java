package org.restApi.InquireRestApi.Pojo;

import lombok.Data;
import org.restApi.InquireRestApi.SQLUtility.DBConnector;
import org.restApi.InquireRestApi.Utilities.BaseClass;

import javax.swing.text.Utilities;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Data
public class Customer {

    private String customer_id,
            store_id,
            first_name,
            last_name,
            email,
            address_id,
            active;

    public List<Customer> queryCustomerByCustId(String customerId) throws SQLException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        DBConnector dbConnector = new DBConnector();
        List<Customer> customerList = new ArrayList<>();
        String querySql = "SELECT * FROM CUSTOMER WHERE CUSTOMER_ID='"+customerId+"'";
        Statement st = dbConnector.getDBConnection().createStatement();
        ResultSet resultSet = st.executeQuery(querySql);
        BaseClass baseClass = new BaseClass();
        baseClass.getPojoList(resultSet).forEach(item -> {
            Customer q = baseClass.convertMapToBean(item, Customer.class);
            customerList.add(q);
        });
        return customerList;
    }


}
