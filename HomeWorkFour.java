import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        str2 = str1.concat(" " + str2);
        System.out.println(str2);

        //Task 2

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("Results of addition - " + (a + b));
        System.out.println("Results of subtraction - " + (a - b));
        System.out.println("Results of multiplication - " + (a * b));
        System.out.println("Results of division - " + (a / b));

        //Task 3

        System.out.println("Enter amount EUR: ");
        double x = scanner.nextDouble();
        System.out.println("Sum in USD: \n" + (x * 0.9792));

        //Task 4
        System.out.println("Enter the diameter of the first pizza:");
        double d1 = scanner.nextDouble();
        System.out.println("Enter the diameter of the second pizza:");
        double d2 = scanner.nextDouble();
        if (d1 < d2) {
            double SmallPizza = Math.PI * Math.pow(d1 / 2, 2) * 40;
            double BigPizza = Math.PI * Math.pow(d2 / 2, 2) * 40;
            double different = BigPizza - SmallPizza;
            System.out.printf("You'll eat %.2f less callories if you'll chose small pizza\n", different);
        } else  {
            double SmallPizza1 = Math.PI * Math.pow(d1 / 2, 2) * 40;
            double BigPizza1 = Math.PI * Math.pow(d2 / 2, 2) * 40;
            double different = SmallPizza1 - BigPizza1;
            System.out.printf("You'll eat %.2f less callories if you'll chose small pizza\n", different);
        }



    }
}
