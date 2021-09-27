import Engine.Engine;

public  abstract class Car {
    private Beeper beeper;
    private Engine engine;
    private Door door;
    private Headlight headlight;


    public Car(Beeper beeper, Engine engine, Door door, Headlight headlight) {
        this.beeper = beeper;
        this.engine = engine;
        this.door = door;
        this.headlight = headlight;

    }





    public String checkBeep(){
        return beeper.makeSound();
     }
     public String checkSpeed(){
        return engine.makeRotation();

     }

     public String checkDoor(){
         return door.openDoor();
    }
    public String checkLight(){
        return headlight.light();
    }

}
