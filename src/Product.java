public class Product {
private final String code;
private final String name;
private final double Prize;
private double DiscountPrize;

    public Product(String c, String n, double p){
        this.code = c;
        this.name = n;
        this.Prize = p;
        this.DiscountPrize = p;
    }
    public Product(){
        this.code = "";
        this.name = "";
        this.Prize = 0;
        this.DiscountPrize = 0;

    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrize() {
        return Prize;
    }

    public double getDiscountPrize() {
        return DiscountPrize;
    }

    public void setDiscountPrize(double discountPrize) {
        DiscountPrize = discountPrize;
    }
}
