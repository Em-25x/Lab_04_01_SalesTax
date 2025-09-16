//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        //Given the price of a purchase the program computes and outputs a 5% sales tax.
        // Be sure to use output statements that clearly display the price and the computed sales tax.
        // (No conditions here, the sales tax is always the same rate.)

        double priceOfPurchase = 199.87;
        final double SALES_TAX = .05;
        double finalPrice = 0;
        finalPrice = priceOfPurchase * (SALES_TAX + 1);

        System.out.println("The final price of a purchase of " + priceOfPurchase + " at " + SALES_TAX + "% sales tax is $" +finalPrice);
    }
}