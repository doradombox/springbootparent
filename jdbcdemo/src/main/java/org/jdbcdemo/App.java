package org.jdbcdemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
public class App {
    
    
    public static void main(String[] args) throws Exception {
        DataSource dataSource = null;
        dataSource.getConnection();
        //getConnection();
        
        //update("update user set name = '2' where id = 15");
        ClassLoader classLoader = App.class.getClassLoader();
        URL url = classLoader.getResource("jdbc.properties");
        InputStream inStream = url.openStream();
        Properties properties = new Properties();
        properties.load(inStream);
        String jdbcUrl = properties.getProperty("d");
        String userName = properties.getProperty("jdbc.username","name");
        System.out.println(String.format("jdbcUrl:%s,userName:%s", jdbcUrl,userName));
        
        System.out.println();
    }

    public static Connection getConnection() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        
        Properties properties = new Properties();
        ClassLoader classLoader = App.class.getClassLoader();
        
        Connection connection = null;
        InputStream inputStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(inputStream);
        String user = properties.getProperty("jdbc.username");
        String jdbcUrl = properties.getProperty("jdbc.url");
        String password = properties.getProperty("jdbc.password");
        String driver = properties.getProperty("jdbc.driver");
        Driver driver1 = (Driver) Class.forName(driver).newInstance();
        Properties info = new Properties();
        info.put("user", user);
        info.put("password", password);
        try {
            connection = driver1.connect(jdbcUrl, info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    
    
    public static void update(String sql) throws Exception {
        Connection conn = null;
        Statement statement = null;
        conn = getConnection();
        statement = conn.createStatement();
        boolean b =  statement.execute(sql);
    }
}
