package duck;

public class RedheadDuck extends Duck{
    
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("\nSou um pato de cabeça vermelha");
    }
}
