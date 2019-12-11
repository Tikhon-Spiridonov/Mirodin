package fourth;

public class TestBook {public static void main(String[] args) {
    Book b1 = new Book("Пролетая над гнездом кукушки", "Кен Кизи.", 600, "роман");
    Book b2 = new Book("Война и мир", "Лев Толстой", 180, "эпопея");
    b2.setPagesCount(10000);
    System.out.println(b1);
    System.out.println(b2); }
}
