import java.util.Scanner;

public class IT26101296Lab7Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            System.out.print("Enter total amount: ");
            double totalAmount = scanner.nextDouble();

            System.out.print("Enter payment mode (C/c for Cash, O/o for Other): ");
            char paymentMode = scanner.next().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                double discount = totalAmount * 0.05;
                double finalAmount = totalAmount - discount;

                System.out.println("Discount : " + discount);
                System.out.println("Amount to be paid : " + finalAmount);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                System.out.println("Discount : 0.0");
                System.out.println("Amount to be paid : " + totalAmount);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

    }
}