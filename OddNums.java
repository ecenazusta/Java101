package beginning;
import java.util.Scanner;
public class OddNums {
    public static void main(String[] args) {
        int number, total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:");
        number = inp.nextInt();
        while (number % 2 != 1) {
            {if (number % 4 == 0)
                total += number;}
            System.out.print("Enter a number:");
            number = inp.nextInt();
        }
        System.out.print("Sum of the numbers divided by four: " + total);
    }
}
