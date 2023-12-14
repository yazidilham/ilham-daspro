import java.util.Scanner;

/**
 * PurchasePrice02
 */
public class PurchasePrice02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price, quantity;
        double discount=0.1, TotalPrice, purchasePrice, totalDiscount;
        System.out.println("Input Price:");
        price=input.nextInt();
        System.out.println("Input quantity: ");
        quantity=input.nextInt();

        TotalPrice=price*quantity;
        totalDiscount=TotalPrice*discount;
        purchasePrice=TotalPrice-totalDiscount;

        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: "+purchasePrice);
    }
}