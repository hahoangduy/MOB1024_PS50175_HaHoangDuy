package Lab1.Bai1;

public class Product {
    private String id;
    private String name;
    private double basePrice;
    
    
    public Product() {
    }

    public Product(String id, String name, double basePrice) {
        setId(id);
        setName(name);
        setBasePrice(basePrice);
    }

    public String getId() {
        return id;
    }
     
    public void setId(String id) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("ID khong hop le");
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Ten khong hop le");
        this.name = name;
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

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Base price: %.0f | Final price: %.0f", id, name, basePrice, finalPrice());
    }
}
