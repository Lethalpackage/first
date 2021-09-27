package Engine;

import Engine.Engine;

public class SporeEngine implements Engine {

   public String coolingWarpCore(){
       return "Cooling";
   }

   public String startEngine(){
       return "start";
   }

    @Override
    public String makeRotation() {
        return "10warp";
    }
}
