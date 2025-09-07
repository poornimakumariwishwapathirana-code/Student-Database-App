import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionToDatabase {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information", "root", "200256%^Poor");

            System.out.println("Connection Successful.");

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
