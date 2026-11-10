package model;

public class VipTicket extends Ticket{
    private double surchargeRate;
    private double comboFee;

    public VipTicket(String id, String moive, double basePrice, double surchargeRate, double comboFee) {
        super(id, moive, basePrice);
        setSurchargeRate(surchargeRate);
        setComboFee(comboFee);
    }

    public double getSurchargeRate() {
        return surchargeRate;
    }

    public void setSurchargeRate(double surchargeRate) {
        if (surchargeRate < 0 || surchargeRate > 1) throw new IllegalArgumentException("Phi phu thu khong hop le");
        this.surchargeRate = surchargeRate;
    }

    public double getComboFee() {
        return comboFee;
    }

    public void setComboFee(double comboFee) {
        if (comboFee < 0) throw new IllegalArgumentException("Phi combo khong hop le");
        this.comboFee = comboFee;
    }

    @Override
    public double finalPrice() {
        return getBasePrice() + (getBasePrice() * surchargeRate) + comboFee;
    }
}
