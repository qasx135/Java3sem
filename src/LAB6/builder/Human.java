package LAB6.builder;

public class Human {
    private String name;
    private int age;
    private String motherName;
    private String dadName;

    public static class HumanBuilder {
        private String name;
        private int age;
        private String motherName;
        private String dadName;

        public HumanBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public HumanBuilder setMotherName(String name) {
            this.motherName = name;
            return this;
        }
        public HumanBuilder setDadName(String name) {
            this.dadName = name;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }
    private Human(HumanBuilder humanBuilder) {

    }
}
