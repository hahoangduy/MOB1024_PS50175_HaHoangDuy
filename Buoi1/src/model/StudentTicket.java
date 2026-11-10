package model;
public class StudentTicket extends Ticket{
    private int discountPercent;

    public StudentTicket(String id, String moive, double basePrice, int discountPercent) {
        super(id, moive, basePrice);
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    @Override
    public double finalPrice() {
        return getBasePrice() * (100 - discountPercent) / 100;
    }
}
