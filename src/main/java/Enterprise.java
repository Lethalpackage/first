import Engine.Engine;

public class Enterprise extends Car {
    public Enterprise(Beeper beeper, Engine engine, Door door, Headlight headlight) {
        super(beeper, engine, door, headlight);
    }


    public void searchСivilizations() {
        System.out.println("search");

    }

    public void collectSolarEnergy() {
        System.out.println("collect");
    }

}