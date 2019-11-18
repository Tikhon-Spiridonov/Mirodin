package fifth;

public class TestNePetyx { public static void main(String[] args) {
    NePetyx d1 =  new NePetyx("Sashka", 2);
    NePetyx d2 =  new NePetyx("Helen", 7);
    NePetyx d3 =  new NePetyx("Bob");
    d3.setAge(1);
    System.out.println(d1);
    d1.intoHumanAge();
    d2.intoHumanAge();
    d3.intoHumanAge();
}
}
