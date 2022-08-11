package duck;

public class Duck {
    
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public void swim() {
        System.out.println("Eu posso nadar!");
    }

    public void display() {
        System.out.println("Eu sou um pato!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavoir(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavoir(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void introduceYourself() {
        this.display();
        this.performQuack();
        this.swim();
        this.performFly();
    }
}
