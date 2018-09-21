//Ch02 page 15 - page 20
//Karel Robot Workbook

//Luke Black
//06 09 2018
//EC1405935

package Task3;

import Task3.Garden;
import Task3.Garden;
import Task3.DanceBot;
import Task3.DanceBot;
import becker.robots.*;
import java.awt.Color;
import static java.awt.Color.BLUE;


public class PlantFlowers 

{

    
    public static void main(String[] args) 
    {
    
        Garden berlin = new Garden();
        berlin.buildWalls();
        
        DanceBot karel = new DanceBot(berlin,1,3,Direction.SOUTH,8);
        DanceBot rob = new DanceBot(berlin,8,3,Direction.NORTH,8);
         
        
        //KAREL
         karel.DanceMoves();
         
         
         
         //ROB
         
         //CAN Karel Robot move right??
         rob.DanceMovesRight();
         
         
         
         
         
        
       //Plant
   
     
     
    
     
     
     
        //karel.plantFlowers();
        
    }

    private static void putThing() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

        
        
        
    
    

