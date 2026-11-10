package Lab1.Bai2;

public class Employee {
    private String id;
    private String name;
    private double baseSalary;
    
    
    public Employee() {
    }

    public Employee(String id, String name, double baseSalary) {
        setId(id);
        setName(name);
        setBaseSalary(baseSalary);
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
        
    public double getBaseSalary() {
        return baseSalary;
    }
   
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("Luong khong hop le");
        this.baseSalary = baseSalary;
    }

    public double income() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Base salary: %.0f | Income: %.0f", id, name, baseSalary, income());
    }
}
