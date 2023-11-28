package Library;
import java.time.LocalDate;

public class Bank_Client implements Iaccount, Ibonus {
    private String name; // имя клиента
    private int passport;
    private double summa_bank; // сумма вклада
    private LocalDate date;
    public double getSumma_bank(){
        return summa_bank;
    }

    // конструктор
    public Bank_Client(String name, double summa_bank, int passport, int year , int month , int day) {
        this.name = name;
        this.passport = passport;
        this.summa_bank = summa_bank;
        date =  LocalDate.of(year, month ,day);
    }
    //ввод информации о клиенте
    public void Person_Display(){
        System.out.println(" " + name + " " + passport + " " + summa_bank + " " + date);
    }


    // реализация методов интерфейса Iaccount
    // Положить деньги на счет
    public void put(double summa) {
        summa_bank += summa;
    }


    // Снять деньги со счета
    public void get(double summa) {
        if (summa <= summa_bank)
            summa_bank -= summa;
    }


    // Начислить проценты в размере 10% годовых.
    // Проценты начисляются один раз, если вклад
    // пролежал год
    public void percent() {
        LocalDate today = LocalDate.now();
        if (date.plusDays(365).equals(today)) {
            summa_bank *= 1.1;
        }
    }


    // реализация метода интерфейса Ibonus
    // Начислить бонус в размере 0,5% в последний
    // день года, если вклад более 1000000 рублей
    // пролежал более 6 месяцев

    public double bonus() {
        double add_bonus = 0.0;
        LocalDate today = LocalDate.now();
        LocalDate endOfYear = LocalDate.of(today.getYear(), 12, 31);
        if (today.equals(endOfYear)) {
            long summa_days = date.until(endOfYear).getDays();
            if (summa_bank > 1000000 && summa_days > 180)
                add_bonus = summa_bank * 0.005;
            System.out.println(" Бонус начислен " + add_bonus);
        }
        return add_bonus;
    }
}




