public class Test {
    Test(int a, int b) {
        System.out.println("a = " + a + " b = " + b);
    }

    Test(int a, float b) {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String args[]) {
        byte a = 10;
        byte b = 15;
        Test test = new Test(a, b);
    }
}
class Animal{
    void eat(){System.out.println("eating...");t1();}
    void t1(){System.out.println("from parent...");}

}
class Dog extends Animal{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dog d=new Dog();
        d.work();
    }}
