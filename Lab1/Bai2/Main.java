package Lab1.Bai2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee("NV01", "A", 2000000));
        list.add(new FullTimeEmployee("NV02", "B", 1000000, 100000, 50000));
        list.add(new PartTimeEmployee("NV03", "C", 4000000, 30, 50000));
        list.add(new FullTimeEmployee("NV04", "D", 3000000, 400000, 150000));
        list.add(new PartTimeEmployee("NV05", "E", 5000000, 40, 60000));
        
        for (Employee e : list) {
            System.out.println(e.toString());
        }

        Employee eMaxIncome = new Employee();
        for (Employee e : list) {
            if (e.income() > eMaxIncome.income()) eMaxIncome = e;
        }

        System.out.println("Nhan vien co luong cao nhat la: ");
        System.out.println(eMaxIncome.toString());
    }
}
