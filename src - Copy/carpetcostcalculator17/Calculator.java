package carpetcostcalculator17;

public class Calculator {
    public Floor floor;// Variable declaration
    public Carpet carpet;// Variable declaration

    public Calculator(Floor floor, Carpet carpet){ // Parameterised constructor initializing floor & carpet variables
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){// Return type method to return total cost by multiplying floor area and carpet cost
        return floor.getArea() * carpet.getCost();
    }
}
