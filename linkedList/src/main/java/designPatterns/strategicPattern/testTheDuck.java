package designPatterns.strategicPattern;

public class testTheDuck {
    public static void main(String [] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();
    }
}
