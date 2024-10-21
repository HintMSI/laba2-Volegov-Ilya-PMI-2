public class Point {  // 1.1
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}