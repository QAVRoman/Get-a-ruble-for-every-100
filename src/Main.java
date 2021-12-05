public class Main {
    public static void main(String[] args) {
        int balance = 100; // счет клиента
        int replenishment = 1100; // сумма пополнения счета
        int bonus = replenishment / 100;
        int amount = balance + replenishment + bonus;
        System.out.println(" Ваш бонус " + bonus);
        System.out.println(" Cумма счета " + amount);
    }
}
