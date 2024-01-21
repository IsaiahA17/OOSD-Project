import java . sql .Connection;
import java . sql .DriverManager;
import java . sql .PreparedStatement;
import java . sql .SQLException;
import java.util.Scanner;

public class InsertTest {
public static void main(String [] args) {
// database URL
final String DATABASE_URL = "jdbc:mysql:localhost/testbd";
Scanner sc = new Scanner(System.in);
Connection connection = null ;
PreparedStatement pstat = null ;
String firstname = "John";
String lastname = "Walsh";
int id = 0;
int i =0;

try {
    // establish connection to database
connection = DriverManager.getConnection(DATABASE_URL, "root", null);
// create Prepared Statement for inserting data into table
pstat = connection.prepareStatement("INSERT INTO customertest (CustomerName, customer_id, customer_address, customer_order) VALUES (?,?,?,?)");
pstat . setString (1, firstname);
pstat . setInt(2, id);
pstat . setString (3, lastname);
pstat . setString (4, firstname);
// insert data into table
i = pstat .executeUpdate();
System.out. println ( i + "record successfully added to the table .");
}

catch(SQLException sqlException){
    sqlException . printStackTrace () ;
    }
    finally {
    try {
    pstat . close () ;
    connection. close () ;
    }
    catch (Exception exception){
    exception . printStackTrace () ;
    }
    }
    } // end main
    } // end class
    

