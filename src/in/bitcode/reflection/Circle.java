package in.bitcode.reflection;

public class Circle extends Shape {
    private int r;

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public Circle() {
        super(0, 0);
        r = 0;

    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println("x = " + getX() + " y = " + getY() + " r = " + r);
    }
}
