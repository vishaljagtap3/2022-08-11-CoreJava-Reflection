package in.bitcode.reflection;

public class Rect extends Shape {
    private int w, h;

    public Rect(int x, int y, int w, int h) {
        super(x, y);
        this.w = w;
        this.h = h;
    }

    public Rect() {
        super(0, 0);
        w = h = 0;
    }

    @Override
    public void draw() {
        System.out.println("x = " + getX()  + " y = " + getY() + " w = " + w + " h = " + h);
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
