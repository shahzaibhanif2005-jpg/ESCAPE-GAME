import java.util.Scanner;
public class FirstLoop {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the loop number\n");
       // System.out.println("the loop number is :");
        int loopNumber = input.nextInt();
        System.out.println("the loop number is :" + loopNumber);

        for (int i = 1; i <= loopNumber ; i++){
            System.out.println(i);
        }
        input.close(); // Good practice to close the scanner
    }
}
    

