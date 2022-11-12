import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first side");
        int a = scanner.nextInt();
        System.out.println("Enter second side");
        int b = scanner.nextInt();
        System.out.println("Enter third side");
        int c = scanner.nextInt();

        double triangleSqr = triangleSquare(a, b, c);
        if (triangleSqr < 0) {
            System.out.println("\u001B[31m" + "This triangle can't exsit" + "\u001B[0m");
        } else  {
            System.out.printf("Triangle with sides a = %d, b = %d, c = %d\n equals %.2f\n", a, b, c, triangleSqr);
    }
}
     static double triangleSquare(int a, int b, int c) {
         if ((a < 0 || b < 0 || c < 0) || (a >= (b + c) || b >= (a + c) || c >= (a + b))) {
             return - 1;
         }
         double halfPerimeter = (a + b + c) * 1.0 / 2;
         double square = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
         return square;

    }
}
