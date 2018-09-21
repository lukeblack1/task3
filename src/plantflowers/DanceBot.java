
package Task3;

import becker.robots.*;
import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;

public class DanceBot extends Robot

{
 public DanceBot(City aCity,int aStreet,int anAvenue,
                 Direction aDirection,int numThings)
 {
     super(aCity,aStreet,anAvenue,aDirection,numThings);
 }
 
 public void DanceMoves()
 {
     this.setSpeed(10); 
     this.turnLeft();
     this.setColor(Color.yellow);
     this.turnLeft();
     
     this.turnLeft();
     this.turnLeft();
     
     
         this.setSpeed(5);
this.setColor(Color.blue);
         this.move();
         this.move();
         this.move();
     
 }
 
 public void DanceMovesRight()
 {
     this.setSpeed(10); 
     this.turnLeft();
     this.setColor(Color.orange);
     this.turnLeft();
     
     this.turnLeft();
     this.turnLeft();
     
     
         this.setSpeed(5);
this.setColor(Color.blue);
         this.move();
         this.move();
         this.move();
     
 }

    void setspeed(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setcolor(Color BLUE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
 
 
}


