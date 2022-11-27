import java.util.Scanner;




public class HomeWorkSeven {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        compoundInterest();
        calculateScales();
    }
    static void calculateScales() {

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        System.out.println("Enter the number of ratings: ");
        int num = scanner.nextInt();
        String stub = scanner.nextLine();

        for (int i = 0; i < num; i++) {
            String scale = scanner.nextLine();
            switch (scale) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
                case "D":
                    countD++;
                    break;

            }
        }
        System.out.printf("A = %d, B = %d, C = %d, D = %d\n", countA, countB, countC, countD);
    }
    static void compoundInterest() {
        System.out.println("Enter amount money: ");
        double amount = scanner.nextDouble();
        System.out.println("Enter the number of months:");
        int months = scanner.nextInt();


        double finalSum = compoundInterest(months, amount);
        System.out.printf("If you put %.2f money for %d months, you will recieve %.2f\n", amount, months, finalSum);
    }

    static double compoundInterest(int months, double amount) {
        for (int i = 0; i < months; i++) {
            amount += amount * 0.01;
        }
        return amount;
    }
}







