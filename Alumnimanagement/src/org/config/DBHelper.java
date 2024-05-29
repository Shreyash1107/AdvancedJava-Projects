package org.config;
import java.sql.*;
public class DBHelper 
{
	protected DBConfig db = DBConfig.getInstance();
	protected Connection conn = db.getconnection();
	protected PreparedStatement pstmt = db.getStatement();
	protected ResultSet rs = db.getresultset();
}
