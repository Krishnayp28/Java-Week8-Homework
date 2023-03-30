package poolarea20;

public class Rectangle {
    public double width;// Integer declaration
    public double length;// Integer declaration

    public Rectangle(double width, double length){
        if ((width < 0) && (length < 0)){
            this.width = 0;
            this.length = 0;
        } else if ((width < 0 ) && (length > 0)) {
            this.width = 0;
            this.length = length;
        } else if ((width > 0) && (length < 0)) {
            this.width = width;
            this.length = 0;
        }else {
            this.width = width;
            this.length = length;
        }
    }

    public double getWidth() {// method returning width value
        return width;
    }

    public double getLength() {// method returning length value
        return length;
    }
    public double getArea(){// method calculating and returning area value
        return (width * length);
    }
}
