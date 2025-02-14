import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.print("Enter your rn: ");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll no is: " + rollno);
        input.close();  // Closing the scanner
    }
}
