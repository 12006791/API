import java.util.ArrayList;
public class Bfhl {
    public static void main(String[] args) {
        ArrayList<String> data = new ArrayList<String>();
        data.add("a");
        data.add("1");
        data.add("334");
        data.add("4");
        data.add("R");
        boolean isSuccess = true;
        String userId = "john_doe_17091999";
        String emailId = "john@xyz.com";
        String collegeRollNumber = "ABCD123";
        ArrayList<String> evenNumbers = new ArrayList<String>();
        ArrayList<String> oddNumbers = new ArrayList<String>();
        ArrayList<String> alphabets = new ArrayList<String>();
        // Iterate through the list and separate even numbers, odd numbers, and alphabets
        for (String item : data) {
            if (item.matches("[0-9]+")) {
                // Check if number is even or odd
                int number = Integer.parseInt(item);
                if (number % 2 == 0) {
                    evenNumbers.add(item);
                } else {
                    oddNumbers.add(item);
                }
            } else if (item.matches("[a-zA-Z]+")) {
                alphabets.add(item.toUpperCase());
            }
        }
        // Create response object
        Response response = new Response(isSuccess, userId, emailId, collegeRollNumber, evenNumbers, oddNumbers, alphabets);
        // Print response object
        System.out.println(response.toString());
    }
}