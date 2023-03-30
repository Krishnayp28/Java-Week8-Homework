package cylinder19;

public class Cylinder extends Circle{
    public double height;// double type variable declaration
    public Cylinder(double radius, double height){
        super(radius); // Calling constructor from parent class
        this.height = height;
        if(height < 0){
            this.height = 0;
        }
    }

    public double getHeight() {// method returning value of height
        return height;
    }
    public double getVolume(){// method returning value of height
        return(super.getArea() * getHeight());
    }
}
