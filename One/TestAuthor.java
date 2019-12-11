package One;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Тихон", "spiridonovmt@mail.ru",'M');
        System.out.println(a1);
        a1.setEmail("spiridonovmt@gmail.com");
        System.out.println(a1);
    }
}
