package QA.Blackbox;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBservices {
    public static String A;
public static void main(String...s) throws ClassNotFoundException, SQLException {
    System.out.println("Starting the program");
    Connection con=null;
    Class.forName("com.mysql.jdbc.Driver");
    String url="jdbc:mysql://localhost:3306/automation";
    System.out.println(url);
    con= DriverManager.getConnection(url, "root","");

System.out.println(con);

    Statement st=con.createStatement();
    String sql=util.readPropertyFileDB().getProperty("query2");

    //st.setFetchSize(2);
    ResultSet rs=st.executeQuery(sql);
    //int totalNumberOfColumns=rs.getMetaData().getColumnCount();
    while(rs.next())
       A=rs.getString(1);
    System.out.println(A);





}

}
