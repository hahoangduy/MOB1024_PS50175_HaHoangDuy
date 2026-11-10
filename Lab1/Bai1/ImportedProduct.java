package Lab1.Bai1;

public class ImportedProduct extends Product{
    private double importTaxRate;
    private double shippingFee;
    
    public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        setImportTaxRate(importTaxRate);
        setShippingFee(shippingFee);
    }

    public double getImportTaxRate() {
        return importTaxRate;
    }

    public void setImportTaxRate(double importTaxRate) {
        if (importTaxRate < 0 || importTaxRate > 1) throw new IllegalArgumentException("Thue xuat nhap khau khong hop le");
        this.importTaxRate = importTaxRate;
    }

    public double getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(double shippingFee) {
        if (shippingFee < 0) throw new IllegalArgumentException("Phi giao hang khong hop le");
        this.shippingFee = shippingFee;
    }

    @Override
    public double finalPrice() {
        return getBasePrice() + (getBasePrice() * importTaxRate) + shippingFee;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Import tax rate: %.1f | Shipping fee: %.0f", importTaxRate, shippingFee);
    }

    
}
