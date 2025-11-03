package FactoryBlueprint;

public class ConcreteProductA implements Product {
    @Override
    public void showDetails() {
        System.out.println("This is ConcreteProductA.");
    }
}
