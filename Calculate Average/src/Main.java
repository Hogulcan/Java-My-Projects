import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x,y,z;
        x = input.nextInt();
        System.out.println("Enter Y: ");
        y = input.nextInt();
        System.out.println("Enter Z: ");
        z = input.nextInt();
        int calculate = (x + y + z) / 3;
        System.out.println("Average: " + calculate);
    }
}