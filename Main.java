import Library.Bank_Client;
import Library.Shop_Client;

public class Main {
    public static void main(String[] args) {
        Bank_Client client = new Bank_Client(" Алибобоев " , 1200000 , 342024545,2015 , 1 ,9);
        client.put(50000);
        client.get(20000);
        client.Person_Display();
        client.percent();
        client.put(client.bonus());
        System.out.println(" сумма вклада: " + client.getSumma_bank());
        Shop_Client client1 = new Shop_Client();
        client1.New_Buy();
        client1.setSumma_buy(client1.getSumma_buy() - client1.bonus());
        System.out.println("к оплате: " + client1.getSumma_buy());
        client1.New_Buy();
        client1.setSumma_buy(client1.getSumma_buy() - client1.bonus());
        System.out.println("к оплате: " + client1.getSumma_buy());
        
    }
}