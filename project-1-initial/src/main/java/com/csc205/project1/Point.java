package main.java.com.csc205.project1;

public class Point {

    double y; // declare variables
    double x; // declare variables

    public Point() {
    }

    public Point(double x, double y) {
        this.y = y;
        this.x = x;
    }

    // finds distance from point one to point two
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getY() - this.getY(), 2) + Math.pow(p.getX() - this.getX(), 2));

    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
    //set points on coordinate
    public void setPoint(double x, double y) {
        this.setY(y);
        this.setX(x);
    }

    public void shiftY(double i) {
        this.setY(this.getY() + i);
    }

    public void shiftX(double i) {
        this.setX(this.getX() + i);

    }

    // rotates the point at a fixed angle around the origin
    public void rotate(double rotation) {
        this.setX(this.getX() * Math.cos(rotation) - this.getY() * Math.sin(rotation));
        this.setY(this.getX() * Math.sin(rotation) + this.getY() * Math.cos(rotation));
    }


    // prints the points to command line
    public String toString() {
        return "Point {x = " + this.getX() + ", y = " + this.getY() + "}";
    }
}