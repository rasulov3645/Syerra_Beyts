package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class XCopy {
    public static void main(String [] args) {
        int orig = 42;

        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
