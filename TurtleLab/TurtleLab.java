import java.awt.Color;
import java.util.Random; 

public class TurtleLab
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World(1920,1080);
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        //Turtle turtle2 = new Turtle(turtleWorld);
        //turtle2.setPenColor(Color.BLUE);
        //turtle2.penDown();
        
        int step = 0;
        int colorstep = 0;
        int steprev = 0;
        
        while (1 == 1)
        {
           
            if (steprev == 0)
            {
                  step = step + 1; // usually 4
            } 
               else
            {
                step = step - 1;
            }
                
            if (step == 1)
            {
                steprev = 0;
                turtle.clearPath();
            }
            
            if (step == 10000)
            {
                steprev = 1;
                
            }
            
            Random color = new Random();
            Color newcolor = new Color(color.nextInt(255-1),color.nextInt(255-1),color.nextInt(255-1));
            Color newcolor2 = new Color(color.nextInt(255-1),color.nextInt(255-1),color.nextInt(255-1));
            int randstep = color.nextInt(80) + 1;
            turtle.setPenWidth(step / 70); // usually step / 70
            //turtle2.setPenWidth(step / 70);
            if (colorstep < 10) // usually 
            {
                colorstep = colorstep + 1;
                
            }
            else
            {
                colorstep = 1;
                newcolor = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
                newcolor2 = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
                turtle.setPenColor(newcolor);
                //turtle2.setPenColor(newcolor2);
            }
 
            turtle.forward(step / 50); // usually step / 50, bottom is usually step / 20
            turtle.turn(step / 20);
            //turtle2.forward(step / -50);
            //turtle2.turn(step / -20);
            Thread.sleep(4);
            //System.out.println("Step: "+ step + " Color: " + newcolor + " Colorstep: " + colorstep + " Randstep:" + randstep);
            
        }
        
    }
}
