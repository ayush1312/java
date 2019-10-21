package designPatterns.testExample;

public class MallardDuck extends Duck {


    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour=new quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck");
    }

}
