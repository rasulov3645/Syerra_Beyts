package chapter4.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }
    void setBrand (String aBrand) {
        brand = aBrand;
    }
    int getNumOfPickups() {
        return numOfPickups;
    }
    void setNumOfPickups (int num) {
        numOfPickups = num;
    }

    boolean getRockStarUsesIt () {
        return rockStarUsesIt;
    }
    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
