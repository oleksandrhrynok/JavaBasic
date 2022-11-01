package algorithms;

import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Home Work Three Task 1

        String str = "I study Basic Java!";
        System.out.println("I study Basic Java!");
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.replace('o', 'a'));
        System.out.println(str.replace("Java", "Python"));
        str.replace("Python", "Java");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(14, 18));

        //Home Work Three Task 2.1

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));

        //Home Work Three Task 2.2

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int result = sideA * sideB;

        System.out.printf("Square %s with a side 1 = %d and side 2 = %d is equal to  %d\n", "rectangles", sideA, sideB, result);

        //Home Work Three Task 2.3

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("x + y = " + (x1 + y1));
        System.out.println("x - y = " + (x1 - y1));

        //Home Work Three Task 2.4

        System.out.println("Enter radius please:");
        double radius = scanner.nextDouble();

        double circleSquare = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of a circle with radius %f equal %.2f\n", radius, circleSquare);

        //Home Work Three Task 2.5

        System.out.println("Enter your name please:");
        String name1 = scanner.nextLine();
        name1 = scanner.nextLine();
        System.out.printf("Hello %s\n", name1);

        //Home Work Three Task 2.6

        System.out.println("Enter your name please:");
        String name = scanner.nextLine();
        name = scanner.nextLine();
        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your name started with symbol %s\n", name.charAt(0));

        //Home Work Three Task 2.7

        double SmallPizza = Math.PI * Math.pow(24/2, 2) * 40;
        double BigPizza = Math.PI * Math.pow(28/2, 2) * 40;
        double different = BigPizza - SmallPizza;
        System.out.printf("You'll eat %.2f less callories if you'll chose small pizza\n", different);




    }
}
