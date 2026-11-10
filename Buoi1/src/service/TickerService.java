package service;
import java.util.List;

import model.StudentTicket;
import model.Ticket;
import model.VipTicket;

public class TickerService {
    public static List<Ticket> createSampleTickets() {
        List<Ticket> tickets = new List<Ticket>();
        
        tickets.add(new Ticket("T01","Mai",90.000));
        tickets.add(new VipTicket("V01","Dune",110.000, 0.2, 30.000));
        tickets.add(new StudentTicket("S01","Mai",90.000, 20));
        tickets.add(new Ticket("T02","Exhuma",100.000));
        tickets.add(new VipTicket("V02","Inside Out 2",90.000, 0.1, 25.000));

        return tickets;
    }

    public static void printAll(List<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            System.out.println(ticket.print());
        }
    }
}
