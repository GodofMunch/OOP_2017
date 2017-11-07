public class Laptop extends Computer {

    private boolean touchScreen;

    private boolean getTouchScreen()
    {
        return touchScreen;
    }

    private void setTouchScreen(boolean touchScreen)
    {
        this.touchScreen = touchScreen;
    }

    public Laptop() {
        this(new Computer(), true);
    }

    public Laptop(Computer c, boolean touchScreen) {
        c = new Computer();
        setTouchScreen(touchScreen);
    }
}
