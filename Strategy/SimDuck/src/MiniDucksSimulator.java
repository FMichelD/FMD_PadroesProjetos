import duck.FlyPoweredByRockt;
import duck.FlyWithWings;
import duck.MallardDuck;
import duck.ModelDuck;
import duck.RedheadDuck;
import duck.RubberDuck;

public class MiniDucksSimulator {
    public static void main(String[] args) throws Exception {
        MallardDuck mDuck = new MallardDuck();
        RedheadDuck redDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        ModelDuck modelDuck = new ModelDuck();

        mDuck.introduceYourself();

        redDuck.introduceYourself();

        rubberDuck.introduceYourself();

        modelDuck.introduceYourself();
        modelDuck.setFlyBehavoir(new FlyPoweredByRockt());
        modelDuck.performFly();
    }
}
