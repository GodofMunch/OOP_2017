/**
 * Created by t00139303 on 28/09/2017.
 */
public class MyPoint {

    private int x,y;

    public int getX() { return x; }

    public int getY() { return y; }

    public void setX(int x) { this.x = x; }

    public void setY(int y) { this.y = y; }

    public MyPoint() {this (0, 0); }

    public void moveHorizontally(int x) { this.x += x; }

    public void moveVertically(int y) { this.y += y; }

    public void translate(int x, int y) {this.y += y; this.x += x;}

    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }

    public String toString() {

        String xAndY="";


        return xAndY;
    }
}
