package org.restApi.InquireRestApi.SQLUtility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBConnector {

    Properties prop = new Properties();

    public DBConnector() throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream("db-config.properties");
        prop.load(stream);
    }

    public Connection  getDBConnection() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Connection conn = DriverManager.getConnection(prop.getProperty("host"),prop.getProperty("username"),prop.getProperty("password"));
        return conn;
    }


}
