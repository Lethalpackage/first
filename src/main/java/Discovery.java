import Engine.Engine;

public class Discovery extends Car {
    public Discovery(Beeper beeper, Engine engine, Door door, Headlight headlight) {
        super(beeper, engine, door, headlight);
    }




    public void exploreSpace() {
        System.out.println("explore");
    }

    public  void timeTravel(){
        System.out.println("travel");
    }
}
