package designPatterns.strategicPattern;

public class quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I do Quack");
    }
}
