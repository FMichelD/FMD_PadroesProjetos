package duck;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Eu posso voar usando minhas asas");
    }    
}
