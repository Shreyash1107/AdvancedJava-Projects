package org.config;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
public class DBConfig 
{
    private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;
    private static DBConfig db = null;
	// public static void main(String[] args) {
	// 	new  DBConfig();
	// }
    private DBConfig()
    {
        try
        {
            Properties p = new Properties();
            p.load(PathHelper.fin);
            String driverclassname = p.getProperty("driver.classname");
			String username = p.getProperty("db.username");
			String password = p.getProperty("db.password");
			String url = p.getProperty("db.url");
			Class.forName(driverclassname);
			conn = DriverManager.getConnection(url,username,password);
            if(conn!=null)
            {
                System.out.println("Database Connected Successfully.....");
            }
            else
            {
                System.out.println("Database has not been Connected......");
            }
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
    }
    public static DBConfig getInstance()
    {
        if(db==null)
        {
            db = new DBConfig();
        }
        return db;
    }
    public Connection getconnection()
    {
        return conn;
    }
    public PreparedStatement getStatement()
    {
        return pstmt;
    }
    public ResultSet getresultset()
    {
        return rs;
    }
}
