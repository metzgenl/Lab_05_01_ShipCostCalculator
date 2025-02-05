//Import Scanner
import java.util.Scanner;

public class ShipCostCalculator {
    double itemPrice = 0;
    double shippingCost = 0;
    double shippingTax = 0.02;
    double totalPrice = 0;
    String incorrectInput = "";

    public void getShippingCost(){
        //Declare Scanner
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the item price: $");

        //Check for valid input from user
        if (in.hasNextDouble()){
            itemPrice = in.nextDouble();
            in.nextLine();

            // Calculate the Shipping Price and Total Price
            if (itemPrice >= 100){
                totalPrice = itemPrice;
            }
            else{
                shippingCost = itemPrice * shippingTax;
                totalPrice = itemPrice + shippingCost;
            }
            System.out.println("The shipping cost for the item is $" + shippingCost + " and the total price is $" + totalPrice + ".");
        }
        else{
            incorrectInput = in.nextLine();
            System.out.println("\n" + incorrectInput + " is not a valid number. Run the program again and enter a valid amount!");
        }


    }
}
