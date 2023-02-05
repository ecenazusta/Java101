package beginning;
import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double price, kdvPrice, totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price: ");
        price = input.nextDouble();
        kdvPrice = price * (price <= 1000 ? 0.18 : 0.08);
        totalPrice = price + kdvPrice;
        System.out.println("KDV cost: " + kdvPrice);
        System.out.println("Total cost with KDV: " + totalPrice);

    }
}

