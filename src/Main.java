public class Main {

    public static void main(String[] args) {
        int amount = 550;
        int deposit = 1500;

        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        int accountBalance = amount + deposit + bonus;

        System.out.println("Итоговый счет: " + accountBalance);
        System.out.println("Бонус: " + bonus);
    }
}
