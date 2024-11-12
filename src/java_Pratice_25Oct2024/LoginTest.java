package java_Pratice_25Oct2024;

public class LoginTest {

    // Method to simulate the login functionality
    public static boolean loginTest(String username, String password) {
        // Correct username and password for validation (for example purpose)
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Check if the username and password match
        return username.equals(correctUsername) && password.equals(correctPassword);
    }

    public static void main(String[] args) {
        // Step 1: Define a 2D Array with usernames and passwords for testing
        String[][] testData = {
                {"admin", "password123"},   // Correct data
                {"admin", "wrongpassword"}, // Incorrect password
                {"user", "password123"}     // Incorrect username
        };

        // Step 2: Loop through each username and password combination
        for (int i = 0; i < testData.length; i++) {
            String username = testData[i][0];
            String password = testData[i][1];

            System.out.println("Testing with Username: " + username + ", Password: " + password);

            // Call the loginTest method with each combination
            if (loginTest(username, password)) {
                System.out.println("Result: Login Successful");
            } else {
                System.out.println("Result: Login Failed");
            }
            System.out.println(); // For better readability
        }
    }
}
