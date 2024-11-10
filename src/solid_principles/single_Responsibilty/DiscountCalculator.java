package solid_principles.single_Responsibilty;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, int price) {
        if (customerType=="regular") return 0.1*price;
       else if (customerType=="premium") return 0.2*price;
       else if (customerType=="vip") return 0.3*price;

       // not a good practice for adding vip member here
       else return 0;
    }


}


interface DiscountStrategy {
    double calculateDiscount(int price);
}


class RegularCustomer implements DiscountStrategy {
    @Override
    public double calculateDiscount(int price) {
        return 0.1*price;
    }
}

class PremiumCustomer implements DiscountStrategy {
    @Override
    public double calculateDiscount(int price) {
        return 0.2*price;
    }
}


class VIPCustomer implements DiscountStrategy {
    @Override
    public double calculateDiscount(int price) {
        return 0.3*price;
    }
}


class GoldCustomer implements DiscountStrategy {
    @Override
    public double calculateDiscount(int price) {
        return 0.4*price;
    }
}


class FlexibleDiscountCalulatror {
    private DiscountStrategy discountStrategy;

    public FlexibleDiscountCalulatror(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double calculateDiscount(int price) {
     return    discountStrategy.calculateDiscount(price);

    }

}


class Main {
    public static void main(String[] args) {
        FlexibleDiscountCalulatror vip1 = new FlexibleDiscountCalulatror(new VIPCustomer());
       double ans =  vip1.calculateDiscount(204);
        System.out.println(ans);
    }
}
