public class Main {
    public static void main(String[] args) {

        int account = 200;
        int amount = 1400;

        int bonus;
        if (amount > 1000) {
            bonus = (amount / 100);
        } else {
            bonus = 0;
        }

        int total = (account + amount + bonus);

        System.out.println("Количество бонусных рублей:" + bonus);
        System.out.println("Итоговый счёт:" + total);
    }
}
