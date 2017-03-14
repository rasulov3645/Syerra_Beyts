package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Main {
    static int calcArea(int height, int width){
        return height * width;
    }

    public static void main (String [] args) {

        int a = calcArea(7, 12);
        short c = 7;
        int b = calcArea(c, 15);
        //int d = calcArea(57);
        calcArea(2, 3);
        long t = 42;
        byte t1 = 42;
        short t2 = 42;
        //int f = calcArea(t, 17);
        int f1 = calcArea(t1, 17);
        int f2 = calcArea(t2, 17);
        //int g = calcArea();
        //calcArea();
        int h = calcArea(144, 2);


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("t1 = " + f1);
        System.out.println("t2 = " + f2);
        System.out.println("h = " + h);
        //System.out.println("b = " + b);
    }
}
