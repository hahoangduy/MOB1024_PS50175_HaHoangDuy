package Lab1.Bai2;

public class PartTimeEmployee extends Employee{
    private int workingHours;
    private int hourlyRate;
    
    public PartTimeEmployee(String id, String name, double baseSalary, int workingHours, int hourlyRate) {
        super(id, name, baseSalary);
        setWorkingHours(workingHours);
        setHourlyRate(hourlyRate);
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        if (workingHours < 0) throw new IllegalArgumentException("Gio lam viec khong hop le");
        this.workingHours = workingHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) throw new IllegalArgumentException("Tien luong theo gio khong hop le");
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double income() {
        return workingHours * hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Working hours: %d | Hourly rate: %d", workingHours, hourlyRate);
    }
}
