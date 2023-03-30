package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Jigna");
        obj.setAge(42);
        obj.setRollNo(15);

        // Displaying values of the variables
        System.out.println("Prime's name :" + obj.getName());
        System.out.println("Prime's name :" + obj.getAge());
        System.out.println("Prime's name :" + obj.getRollNo());

        // Direct access of rollNo is not possible due to encapsulation

        //System.out.println("Prime's rollNo : " + obj.geekName)
    }


}
