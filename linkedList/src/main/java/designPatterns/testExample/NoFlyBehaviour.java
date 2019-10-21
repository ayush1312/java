package designPatterns.testExample;

public class NoFlyBehaviour implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
