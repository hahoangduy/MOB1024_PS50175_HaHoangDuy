package model;
public class Ticket {
    private String id;
    private String movie;
    private double basePrice;
    
    public Ticket(String id, String moive, double basePrice) {
        setId(id);
        setMovie(moive);
        setBasePrice(basePrice);
    }

    public String getId() {
        return id;
    }
     
    public void setId(String id) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("ID khong hop le");
        this.id = id;
    }

    public String getMovie() {
        return movie;
    }
    
    public void setMovie(String moive) {
        if (moive == null || moive.isEmpty()) throw new IllegalArgumentException("Movie khong hop le");
        this.movie = moive;
    }
        
    public double getBasePrice() {
        return basePrice;
    }
   
    public void setBasePrice(double basePrice) {
        if (basePrice < 0) throw new IllegalArgumentException("Gia khong hop le");
        this.basePrice = basePrice;
    }

    public double finalPrice() {
        return basePrice;
    }

    public void print() {
        System.out.printf("ID: %s | Movie: %s | Base price: %.0f | Final base price: %.0f", id, movie, basePrice, finalPrice());
    }
    
}
