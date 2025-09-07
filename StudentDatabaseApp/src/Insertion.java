import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information","root","200256%^Poor");

            //Read user input

            System.out.println("Enter student name: ");
            String name = scanner.nextLine();

            System.out.println("Enter student age: ");
            int age = scanner.nextInt();

            System.out.println("Enter student email: ");
            String email = scanner.next();


            String sql = "INSERT INTO students (name, age, email) VALUES (?,?,?)";


            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, email);

            int rows = preparedStatement.executeUpdate();

            System.out.println(" "+rows+" successfully added.");

            preparedStatement.close();
            connection.close();


        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }
    }
}
