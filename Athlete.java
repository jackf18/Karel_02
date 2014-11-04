/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jack Flaherty>  // replace <...> with your name
* @version <10/30/14> // replace <...> with the date
*/

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

   public class Athlete extends Robot
  {
    public Athlete()
    {
      super(1,1, Display.NORTH, Display. INFINITY);
    }
      public Athlete(int x, int y, int dir, int beep)
    {
      super(x, y, dir, beep);
     }
      public void turnAround()
     {
      turnLeft();
      turnLeft();
     }
      public void turnRight()
     {
      turnLeft();
      turnAround();
          
   }
   
}
   