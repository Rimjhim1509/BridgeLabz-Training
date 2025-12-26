import java.util.Scanner;

public class CoffeeCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String coffeeType;

        while (true) {
            System.out.print("Enter coffee type (Espresso/Latte/Cappuccino) or 'exit': ");
            coffeeType = sc.next();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed.");
                break;
            }

            int price = 0;

            switch (coffeeType) {
                case "Espresso":
                    price = 100;
                    break;
                case "Latte":
                    price = 120;
                    break;
                case "Cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int total = price * quantity;
            double gst = total * 0.05;
            double finalBill = total + gst;

            System.out.println("Total Bill (including GST): ₹" + finalBill);
        }
    }
}
