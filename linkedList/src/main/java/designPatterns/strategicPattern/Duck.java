package designPatterns.strategicPattern;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();
    public  void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.println("Of course i can swim");
    }
}
