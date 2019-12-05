package Spiridonovlab25;

import java.lang.*;
import java.util.Scanner;

public class TestKrujok {
    public static void main(String[] args) {
        double r;
        Krujok k1 = new Krujok(3.1,4.1,5.1,"red");

        System.out.println("Длина кружка = " + k1.getLength() + "см\n");
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина кружка = " + k1.getLength() + "см");
    }
}
