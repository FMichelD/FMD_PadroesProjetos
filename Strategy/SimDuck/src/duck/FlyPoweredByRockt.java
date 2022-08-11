package duck;

public class FlyPoweredByRockt implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Estou voando com um foguete!!!");
    }
}
