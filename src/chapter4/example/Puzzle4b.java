package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Puzzle4b {
    int ivar;
    public int doStuff(int factor) {
        if (ivar > 100) {
            return ivar * factor;
        } else {
            return ivar *(5-factor);
        }
    }
}
