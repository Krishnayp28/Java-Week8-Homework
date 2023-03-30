package point16;

public class Point {
    // Main method with Test code
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());


    }
    public int x;// Integer declarati
    public int y;// Integer declarati

    public Point() {// no args constructor
        this(0,0);
    }

    public Point(int x, int y) {// Constructor with two int parameters
        this.x = x;
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    public double distance(Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public int getX() { // int type method returning value of x
        return x;
    }

    public void setX(int x) {// void type with return method setting value of x
        this.x = x;
    }

    public int getY() {// int type method returning value of y
        return y;
    }

    public void setY(int y) {// void type method setting value of y
        this.y = y;
    }
}

