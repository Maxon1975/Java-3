public class Main {
    public static void main(String[] args) {
        int minimumReplenishment = 1000;
        int replenishmentAmount = 2000;
        int currentBalance = 500;

        int bonus;
        if (replenishmentAmount > minimumReplenishment) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount;
        totalAmount = currentBalance + replenishmentAmount + bonus;

        System.out.println(totalAmount);
        System.out.println(bonus);
    }
}
