package Library;
import java.util.Scanner;

public class Shop_Client implements Ibonus {
    private double summa_shop; // сумма покупок
    private double summa_buy; // сумма текущей покупки

    //Свойство
    public double getSumma_buy(){
        return summa_buy;
    }
    //Cвойство
    public void setSumma_buy(double summa_buy) {
          this.summa_buy = summa_buy;
    }
    //Конструктор
    public Shop_Client() {
        summa_shop = 0;
        summa_buy = 0;
    }
    // реализация метода интерфейса Ibonus
    // Если сумма покупок больше 30000, но меньше
    //40000, то скидка на покупку составляет 2%.
    // Если сумма покупок > 40000, то скидка - 5%.
    public double bonus() {
        double add_bonus = 0.0;
        if (summa_shop > 40000)
            add_bonus = summa_buy * 0.05;
        else if (summa_shop > 30000)
            add_bonus = summa_buy * 0.02;
        return add_bonus;
    }
    public void New_Buy(){ // Оплата покупки
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите сумму покупки");
            summa_buy = scanner.nextDouble();
        
        summa_shop += summa_buy;
    }
}



