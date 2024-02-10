package week03.geometry;

public class Point {
    private float x;
    private float y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.getX();
        this.y = p.getY();
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void translate(float dX, float dY) {
        this.x += dX;
        this.y += dY;
    }

    public float distance(Point p) {
        return (float) Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }

    public boolean equals(Point p) {
        return this.x == p.getX() && this.y == p.getY();
    }

    public boolean isOnLine(Point p1, Point p2) {
        return (p1.getY() - this.y) * (p2.getX() - this.x) == (p2.getY() - this.y) * (p1.getX() - this.x);
    }

    public boolean isOnSegment(Point p1, Point p2) {
        return isOnLine(p1, p2) && Math.min(p1.getX(), p2.getX()) <= this.x && this.x <= Math.max(p1.getX(), p2.getX())
                && Math.min(p1.getY(), p2.getY()) <= this.y && this.y <= Math.max(p1.getY(), p2.getY());
    }
}