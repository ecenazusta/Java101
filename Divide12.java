package beginning;
import java.util.Scanner;
public class Divide12 {
    public static void main(String[] args) {
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = inp.nextInt();
        int total = 0, member = 0, i = 0;
        while ( i != num){
            i++;
            if (i % 12 == 0) {
                total += i;
                member++;
            }
        }
        System.out.print("Average is: " + total/member);
    }
}
