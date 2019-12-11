package Ninth;

public class SuperTester {
    public static void main(String[] args) {
        SuperCAR c1 = new SuperCAR ("BMW", "5 Series", "E34", 500000, 2015); // создание экземпляра с1класса Car и передача ему параметров
        c1.println(); //применение метода println() к c1
        SuperCAR  c2 = new SuperCAR ("BMW", "3 Series", "E36", 350000, 1999);
        c2.println(); //применение метода println() к c2
        SuperCAR  c3 = new SuperCAR ("BMW", "7 Series", "E38", 800000, 2001);
        c3.println(); //применение метода println() к c3
    }
}