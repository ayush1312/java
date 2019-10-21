package designPatterns.testExample;

public class noQuack implements  QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cant quack");
    }
}
