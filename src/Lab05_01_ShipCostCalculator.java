public class Lab05_01_ShipCostCalculator {
    public static void main(String[] args){
        double priceOfItem = 70;
        final int MINIMUM_FOR_FREE_SHIPPING = 100;
        double shippingCost;
        double totalCost;
        if(priceOfItem < MINIMUM_FOR_FREE_SHIPPING)
        {
            shippingCost = priceOfItem * 0.02;
        }
        else
        {
            shippingCost = 0;
        }
        totalCost = priceOfItem + shippingCost;
        System.out.println("Your total is " + totalCost + " and your shipping cost is " + shippingCost);
    }
}
