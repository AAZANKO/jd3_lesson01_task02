package by.htp.zanko;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class MarvelTicketCostTest {

    @Test
    public void checkMarvelTicketCost(){

        Customer customer1 = new Customer("Старк",  25);
        Customer customer2 = new Customer("Халк", 50);
        Customer customer3 = new Customer("Тор", 25);
        Customer customer4 = new Customer("Локи", 100);
        Customer customer5 = new Customer("Капрал", 50);

        List<Customer> customers = new LinkedList<>();

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        MarvelTicketCost marvelTicketCost = new MarvelTicketCost();

        boolean monyBank = marvelTicketCost.getMonyBank(customers);

        System.out.println(monyBank);

    }

}