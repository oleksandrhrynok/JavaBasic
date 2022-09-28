/**
 * Java Basic. Home work #2
 
 @author Oleksandr Hrynok
 @todo 7.09.2022
 @data 28.09.2022
 */
class HomeWork2 {
    public static void main(String[] args) {
        
        // homework 2.1
        System.out.println(checkWeather(-5));
        System.out.println(checkWeather(5));
        System.out.println(checkWeather(20));
        System.out.println(checkWeather(30));
        
        // homework 2.2
        System.out.println(canWalk(true, true)? "I can walk" : "I cannot walk");
        System.out.println(canWalk(false, true)? "I can walk" : "I cannot walk");
        System.out.println(canWalk(true, false)? "I can walk" : "I cannot walk");
        System.out.println(canWalk(false, false)? "I can walk" : "I cannot walk");
        
        // homework 2.3
        int a = 4;
        int b = 2;
        System.out.println(sum(a, b));
        System.out.println(sub(a, b));
        System.out.println(mul(a, b));
        System.out.println(div(a, b));
        
        
    }
    static String checkWeather (int temperatura) {
        if (temperatura < 0) {
            return "it's frost";
        } else if (temperatura <= 18) {
            return "it's cold";
        } else if (temperatura <= 28) {
            return "It's warm";
        } else {
            return "It's hot";
        }
    }
    
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static double div(double a, double b) {
        return a / b;
    }
    
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        return isWeekend && !isRain;
    }
}

