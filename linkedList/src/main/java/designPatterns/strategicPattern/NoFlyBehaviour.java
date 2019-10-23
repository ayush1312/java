package designPatterns.strategicPattern;

public class NoFlyBehaviour implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
