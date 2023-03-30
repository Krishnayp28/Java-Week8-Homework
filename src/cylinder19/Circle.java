package cylinder19;

public class Circle {
    public double radius;// Double variable
    public Circle(double radius){
        this.radius = radius;
        if (radius < 0){
            this.radius = 0; // ternary operator setting variable to 0 if 0 has been entered
        }
    }

    public double getRadius() {// method returning value of radius
        return radius;
    }
    public double getArea(){
        return(Math.pow(this.radius,2) * Math.PI);
    }
}

