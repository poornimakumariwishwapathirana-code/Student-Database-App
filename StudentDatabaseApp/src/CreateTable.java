import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateTable {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information","root","200256%^Poor");

            String sql = "CREATE TABLE IF NOT EXISTS students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50)," +
                    "age INT," +
                    "email VARCHAR(100))";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute(sql);


            System.out.println("Table created successfully");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
