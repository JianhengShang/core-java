package ch03;

import java.util.Date;

public class OutputTest {
    public static void main(String[] args) {
        double x = 1000.0 / 3.0;
        System.out.println(x);

        System.out.printf("%8.2f", x);

        System.out.printf("Hello, %s. Next year, you'll be %d", "Jianheng", 40);

        System.out.printf("%tc", new Date());
    }
}
