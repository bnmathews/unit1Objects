import java.awt.Color;
import java.util.Random; 

public class TurtleLabXX
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World(1280,720);
        Turtle turtle = new Turtle(turtleWorld);
        turtle.setPenColor(Color.RED);
        turtle.penDown();
        Turtle turtle2 = new Turtle(turtleWorld);
        turtle2.setPenColor(Color.BLUE);
        turtle2.penDown();
        
        int step = 0;
        int colorstep = 0;
        
        while (1 == 1)
        {
            step = step + 4; // usually 4
            Random color = new Random();
            Color newcolor = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
            Color newcolor2 = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
            int randstep = color.nextInt(20) + 1;
            turtle.setPenWidth(step / 370); // usually 70
            turtle2.setPenWidth(step / 370);
            if (colorstep < 100) // usually 
            {
                colorstep = colorstep + 1;
                
            }
            else
            {
                colorstep = 1;
                newcolor = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
                newcolor2 = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
                turtle.setPenColor(newcolor);
                turtle2.setPenColor(newcolor2);
            }
  
            //if (step < 4000)
            //{
                turtle.forward(step / randstep); // usually step / 50, bottom is usually step / 20
                turtle.turn(step / 55);
                turtle2.forward(step / -randstep);
                turtle2.turn(step / -55);
         
            //}
            /*
            else if (step < 9000)
            {
                turtle.forward(step / 60); // usually 2
                turtle.turn(step / 30);
                turtle2.forward(step / -60);
                turtle2.turn(step / 30); 
            }
            else if (step < 13000)
            {
                turtle.forward(step / 70);
                turtle.turn(step / 40); // usually 1
                turtle2.forward(step / 70);
                turtle2.turn(step / 40); 
            }
            else if (step < 17000)
            {
                turtle.forward(step / 80);
                turtle.turn(step / 50);
                turtle2.forward(step / 90);
                turtle2.turn(step / 50); 
            }
            */
            //Thread.sleep(2);
            System.out.println("Step: "+ step + " Color: " + newcolor + " Colorstep: " + colorstep + " Randstep:" + randstep);
            
        }
        
    }
}
