import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information","root","200256%^Poor");

            //Read user input
            System.out.println("Enter the name you want to delete: ");
            String name = scanner.next();

            String delete = "DELETE FROM students WHERE name=?";

            PreparedStatement preparedStatement = connection.prepareStatement(delete);
            preparedStatement.setString(1,name);

            int deleted = preparedStatement.executeUpdate();
            System.out.println(deleted+" record(s) deleted.");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
