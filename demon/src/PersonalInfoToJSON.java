import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject; // JSON-Simple library

public class PersonalInfoToJSON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a JSON object
        JSONObject userData = new JSONObject();

        // Asking user for details
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        userData.put("email", email);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();
        userData.put("name", name);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        userData.put("age", age);

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        userData.put("phone", phone);

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();
        userData.put("address", address);

        // Writing data to a JSON file
        try (FileWriter file = new FileWriter("userdata.json")) {
            file.write(userData.toJSONString());
            file.flush();
            System.out.println("Data saved to userdata.json successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}