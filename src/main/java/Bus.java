import Engine.Engine;

public abstract class Bus extends Car implements People{
    private int totalPeople = 0;


    public Bus(Beeper beeper, Engine engine, Door door, Headlight headlight) {
        super(beeper, engine, door, headlight);
    }



    @Override
    public void stop(int peopleCount) {
    totalPeople += peopleCount;
        System.out.println(totalPeople + " people In Bus");
    }
}
