import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Single or Double");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number;
        number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("This is a double number");
        }
        else{
            System.out.println("This is a single number");
        }
    }
}