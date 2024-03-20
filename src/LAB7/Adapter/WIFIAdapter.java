package LAB7.Adapter;

public class WIFIAdapter implements USB{

    private WIFIRouter wifiRouter;

    public WIFIAdapter(WIFIRouter wifiRouter) {
        this.wifiRouter = wifiRouter;
    }

    @Override
    public void connectWithUSB() {
        this.wifiRouter.send();
        this.wifiRouter.useInet();
    }
}
