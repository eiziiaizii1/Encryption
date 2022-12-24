package encrypt;

import java.util.Scanner;

public class Encrypt {

    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        Scanner inputInteger = new Scanner(System.in);
        
        System.out.println("Enter the input: ");
        String userInput = inputString.nextLine();
        System.out.println("Enter the value of p for encryption:");
        int p = inputInteger.nextInt();
        char x;

        for (int i = 0; i < userInput.length(); i++) {
            x = userInput.charAt(i);
            if (65 <= x && x <= 90) {
                if (x + p % 26 <= 90) {
                    System.out.print((char) (x + p % 26));
                } else {
                    x = (char) (userInput.charAt(i) - 26);
                    System.out.print((char) (x + p % 26));
                }
            } else {
                System.out.print(userInput.charAt(i));
            }
        }
    }
}
