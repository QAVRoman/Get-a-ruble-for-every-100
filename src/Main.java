public class Main {
    public static void main(String[] args) {
        int balance = 100; // счет клиента
        int replenishment = 250; // сумма пополнения счета
        int bonus;
        if (replenishment >= 100) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int amount = balance + replenishment + bonus;
        System.out.println(" Ваш бонус " + bonus);
        System.out.println(" Cумма счета " + amount);
    }
}