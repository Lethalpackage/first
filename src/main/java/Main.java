import Engine.EngineV12;

public class Main {
    public static void main(String[] args) {

        Horn horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        Leftdoor leftdoor = new Leftdoor();
        Right right = new Right();


        Bus bus = new Bus52(horn, engineV12, leftdoor, right);
        bus.stop(5);
        bus.checkBeep();
        bus.checkSpeed();
        bus.stop(-2);








    }


    }












