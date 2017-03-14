package chapter3.example;

/**
 * Created by Гамзат on 3/15/2017.
 */
public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String [] args){
        int x = 0;
        //int y = 0;      - Лишный
        Triangle [] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("треугольник " + x + ", зона");
            System.out.println(" = " +ta[x].area);
            x = x + 1;
        }
        int y = x;   // Пропустил
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", зона t5 = "+ t5.area);

    }

    void setArea() {
        area = (height * length) / 2;
    }
}
