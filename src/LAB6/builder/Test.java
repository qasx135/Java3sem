package LAB6.builder;

public class Test {
    public static void main(String[] args) {
        Human p = new Human.HumanBuilder("Michael", 21).setMotherName("Sveta").setDadName("Andrey").build();
    }
}
