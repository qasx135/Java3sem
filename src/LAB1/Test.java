package LAB1;

public class Test {
    public static void main(String[] args) {
        String pinCode1 = "1234";
        String pinCode2 = "12344";
        String pinCode3 = "666666";
        PIN checker = new PIN();
        System.out.println(pinCode1 + " -> " + checker.test(pinCode1));
        System.out.println(pinCode2 + " -> " + checker.test(pinCode2));
        System.out.println(pinCode3 + " -> " + checker.test(pinCode3));
    }
}
