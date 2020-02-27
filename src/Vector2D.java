public class Vector2D {
    private double x, y;

    public Vector2D() {
        this.x = this.y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(x + v.getX(), y + v.getY());
    }

}
