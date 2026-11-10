package Lab1.Bai2;

public class FullTimeEmployee extends Employee{
    private double bonus;
    private double penalty;

    public FullTimeEmployee(String id, String name, double baseSalary, double bonus, double penalty) {
        super(id, name, baseSalary);
        setBonus(bonus);
        setPenalty(penalty);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) throw new IllegalArgumentException("Tien thuong khong hop le");
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        if (penalty < 0) throw new IllegalArgumentException("Tien phat khong hop le");
        this.penalty = penalty;
    }

    @Override
    public double income() {
        return getBaseSalary() + bonus - penalty;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Bonus: %.0f | Penalty: %.0f", bonus, penalty);
    }
}
