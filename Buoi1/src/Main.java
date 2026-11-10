import java.util.ArrayList;

import model.StudentTicket;
import model.Ticket;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> list = new ArrayList<>();

        list.add(new Ticket("T01", "A", 150000));
        list.add(new StudentTicket("T02", "B", 200000, 30));
        list.add(new Ticket("T03", "C", 350000));
        list.add(new StudentTicket("T04", "D", 100000, 10));
        list.add(new Ticket("T05", "E", 400000));

        for (Ticket ticket : list) {
            System.out.println(ticket.toString());
        }
    }
}
