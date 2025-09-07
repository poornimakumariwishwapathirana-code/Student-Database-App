import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information","root","200256%^Poor");

            System.out.println("Enter the name of the student, you want to update details: ");
            String oldName = scanner.nextLine();

            System.out.println("What is the new name? ");
            String newName = scanner.nextLine();

            String update = "UPDATE students SET name=? WHERE name=?";

            PreparedStatement preparedStatement = connection.prepareStatement(update);

            preparedStatement.setString(1,newName);

            preparedStatement.setString(2,oldName);


            int updated = preparedStatement.executeUpdate();
            System.out.println(updated+" record(s) updated.");

            preparedStatement.close();
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            scanner.close();
        }
    }
}
