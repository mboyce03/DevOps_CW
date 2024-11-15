import java.util.Scanner;

class Dec2Hex {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("Error: No input argument provided.");
            return; // Exit the program gracefully
        }

        try {
            // Attempt to parse the input argument as an integer
            int arg1 = Integer.parseInt(args[0]);
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num = arg1;
            String hexadecimal = "";

            System.out.println("Converting the Decimal Value " + num + " to Hex...");
            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal Value: " + hexadecimal);
        } catch (NumberFormatException e) {
            // Handle non-integer input gracefully
            System.out.println("Error: Input is not a valid integer. Please provide a valid decimal number.");
        }
    }
}
