package Lab1.Bai1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product("SP01", "Gao", 100000));
        list.add(new ImportedProduct("SP02", "My cay Han Quoc", 50000, 0.2, 20000));
        list.add(new Product("SP03", "Ao khoác", 150000));
        list.add(new ImportedProduct("SP04", "Pizza Y", 300000, 0.5, 100000));
        list.add(new Product("SP05", "Quan Jean", 50000));

        for (Product p : list) {
            System.out.println(p.toString());
        }
        
        Product pMaxFinalPrice = new Product();
        for (Product p : list) {
            if (p.finalPrice() > pMaxFinalPrice.finalPrice()) {
                pMaxFinalPrice = p;
            }
        }
        System.out.println("San pham co gia cuoi cung cao nhat: ");
        System.out.println(pMaxFinalPrice.toString());
    }
}
