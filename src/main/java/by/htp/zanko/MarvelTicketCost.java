package by.htp.zanko;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
public class MarvelTicketCost {

    public boolean getMonyBank(List<Customer> list){

        boolean change = false;
        final int TICKET = 25;
        int bank = 0;

        for (Customer cust: list) {

            if(cust.getBill() == TICKET){
                bank = bank + TICKET;
            }else if(cust.getBill() > TICKET){
                bank = bank + TICKET;
                bank = bank - (cust.getBill() - TICKET);
                if(bank < 0){
                    change = false;
                    break;
                }else {
                    change = true;
                }
            }
            System.out.println(cust.getName()+" "+cust.getBill());
        }
        return change;
    }
}
