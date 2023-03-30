package poolarea20;

public class Cuboid extends Rectangle{
    public double height; // Integer declaration

    public Cuboid(double width, double lenght, double height){// Parameterised constructor
        super(width,lenght);// Calling constructor from parent class
        if (height < 0){
            this.height = 0;// setting height value using ternary operator
        }else {
            this.height = height;
        }
    }

    public double getHeight() {//method returning height value
        return height;
    }
    public double getVolume(){// method returning volume value
        return (getArea() * height);
    }
}
