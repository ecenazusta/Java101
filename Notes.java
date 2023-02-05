package beginning;

import java.util.Scanner;
public class Notes {
    public static void main(String[] args) {
        int math, physics, chem, turkish, history, music; //Create variables
        Scanner input1 = new Scanner(System.in); //Define scanner

        System.out.print("Math grade: ");
        math = input1.nextInt();

        System.out.print("Physics grade: ");
        physics = input1.nextInt();

        System.out.print("Chemistry grade: ");
        chem = input1.nextInt();

        System.out.print("Turkish grade: ");
        turkish = input1.nextInt();

        System.out.print("History grade: ");
        history = input1.nextInt();

        System.out.print("Music grade: ");
        music = input1.nextInt();

        double result = (math + physics + turkish + chem + history + music)/6;
        System.out.println("Your average grade is: " + result);
        System.out.print(result >= 60 ? "You have successfully completed the class." : "You failed to complete the class.");

    }
}
