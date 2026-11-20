import java.util.Scanner;

public class NewInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;


        
        System.out.println("the sum of " +a+ " and " +b+ " is "+ sum);
        
        input.close(); // Good practice to close the scanner
    }
}