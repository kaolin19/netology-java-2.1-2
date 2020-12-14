public class Main {
    public static void main(String[] args) {
        double accountAmount = 100.00;
        double replenishAmount = 1100.00;
        int bonusAmount = (int) replenishAmount / 100;
        if (replenishAmount > 100) {
            accountAmount += replenishAmount + bonusAmount;
        } else {
            accountAmount += replenishAmount;
            bonusAmount = 0;
        }
        System.out.print("Бонусные баллы: ");
        System.out.println(bonusAmount);
        System.out.print("Баланс счёта: ");
        System.out.print(accountAmount);
    }
}
