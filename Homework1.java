/**
 * Java Basic. Home work #1
 
 *@author Oleksandr Hrynok
 *@ version data 13.09.2022
 *
 */
class Homework1 {
    public static void main (String[] args){
        //Homwork1.1
        int a = 5;
        int b = 3;
        System.out.println(a);
        System.out.println(b);
        float S = (a*b)/2f;
        System.out.println("trikutnik area" + S);
        double P = (Math.sqrt(a*a+b*b))+a+b;
        System.out.println(P);
        //Homwork1.2
        float d = a+b;
        float e = a - b;
        float f = a*b;
        float g = a/b;
        System.out.println("addition result a end b" + d);
        System.out.println("subtraction result a end b" + e);
        System.out.println("multiplcation result a end b" + f);
        System.out.println("division result a end b" + g);
        //Homwork1.3
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        System.out.println(array[i]);
        }
        //Homework1.4
        int D = 40;
        double cal =(Math.PI*((D/2)*(D/2)))*40;
        System.out.println("pizza contains calories" + cal);
    }
}