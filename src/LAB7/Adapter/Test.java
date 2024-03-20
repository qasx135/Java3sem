package LAB7.Adapter;

public class Test {
    public static void main(String[] args) {
        USB wifiAdapter = new WIFIAdapter(new WIFIRouter());
        wifiAdapter.connectWithUSB();
    }
}
