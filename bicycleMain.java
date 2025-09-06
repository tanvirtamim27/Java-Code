import java.util.Scanner;

public class bicycleMain {
    public static void main(String[] args) {
        //Create two different bicycle object:
        bicycle bike1 = new bicycle();
        bicycle bike2 = new bicycle();
        //Call methode on those object
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStstus();

        bike2.changeCadence(40);
        bike2.speedUp(5);
        bike2.changeGear(3);
        bike2.printStstus();
    }
}
