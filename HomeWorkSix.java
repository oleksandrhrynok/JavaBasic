import java.util.Scanner;

public class HomeWorkSix {

    public static void main(String[] args) {
        System.out.println(twoFlasks());
        System.out.println(refenceNumber());
        System.out.println(circleArea());
        System.out.println(tangleArea());
        System.out.println(triangleArea());

    }

    static boolean twoFlasks() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature first flask");
        int temperature1 = scanner.nextInt();
        System.out.println("Enter temperature second flask");
        int temperature2 = scanner.nextInt();
        if (temperature1 > 100 & (temperature2 < 100)) {
            return true;
        } else {
            return false;
        }
    }

    public static String refenceNumber () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter reference number");
        int number = scanner.nextInt();
        switch (number) {
            case 0:
                return ("Don't move");
            case 1:
                return ("Up");
            case 2:
                return ("down");
            case 3:
                return ("Left");
            case 4:
                return  ("Right");
            default:
                return ("Error!");
        }

    }
    public static double circleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the diameter of the circle:");
        double d1 = scanner.nextDouble();
        double d2 = Math.PI * Math.pow(d1 / 2, 2);
        System.out.printf("Area of a circle: %.2f\n", d2);
        return d2;
    }
    public static int tangleArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side");
        int y = scanner.nextInt();
        System.out.println("Enter second side");
        int x = scanner.nextInt();
        if ((y > 0) & (x > 0)) {
            int z = (y * x);
            System.out.println("Area of the rectangle:" + z);
            return z;
        } else {
            System.out.println("\u001B[31m" + "Error" + "\u001B[0m");
            return -1;
        }

    }
    public static double triangleArea() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();
        System.out.println("Enter third side");
        int c = scanner.nextInt();


        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            System.out.println("\u001B[31m" + "This triangle can't exsit" + "\u001B[0m");
            return -1;
        } else if ((a < 0 || b < 0 || c < 0) || (a >= (b + c) || b >= (a + c) || c >= (a + b))) {
            System.out.println("\u001B[31m" + "This triangle can't exsit" + "\u001B[0m");
            return -1;
        } else {
            double halfPerimeter = (a + b + c) * 1.0 / 2;
            double square = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
            System.out.printf("Area of the triangle: %.2f\n", square);
            return square;

        }
    }

}

