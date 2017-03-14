package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class ClockTestDrive {
    public static void main (String [] args) {

        Clock c = new Clock();

        c.setTime("5:57");
        String tod = c.getTime();
        System.out.println("время: " + tod);
    }
}
