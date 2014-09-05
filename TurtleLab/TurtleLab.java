import java.awt.Color;
import java.util.Random; 

public class TurtleLab
{
    public static void main(String args[])
        throws InterruptedException
    {
        World turtleWorld = new World();
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
            step = step + 4;
            Random color = new Random();
            Color newcolor = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
            Color newcolor2 = new Color(color.nextInt(225-1),color.nextInt(225-1),color.nextInt(225-1));
            turtle.setPenWidth(step / 70);
            turtle2.setPenWidth(step / 70);
            if (colorstep < 10)
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
                turtle.forward(step / 50);
                turtle.turn(step / 20);
                turtle2.forward(step / -50);
                turtle2.turn(step / 20);
         
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
            Thread.sleep(4);
            System.out.println("Step: "+ step + " Color: " + newcolor + " Colorstep: " + colorstep);
            
        }
        
    }
}
