package Day1_ProgrammingElements;

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        double total = unitPrice * quantity;
        System.out.printf("The total purchase price is INR %.2f if the quantity %d and the unit price is INR %.2f\n",
                total, quantity, unitPrice);
        scanner.close();
    }
}