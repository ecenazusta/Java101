package beginning;

import java.util.Scanner;

public class CalculatorSwitchCase {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = inp.nextInt();
        System.out.print("Enter second number: ");
        num2 = inp.nextInt();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Your choice: ");
        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.print(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.print(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.print(num1 + "x" + num2 + "=" + (num1 * num2));
                break;
            case 4:
                if (num2 != 0 ) {
                    System.out.print(num1 + ":" + num2 + "=" + (num1 / num2));
                } else {
                    System.out.print("You cannot divide a number by 0.");
                }
                break;
            default:
                System.out.print("Invalid choice. Please try again.");
                }
        }

    }

