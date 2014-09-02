import java.awt.Rectangle;

public class Rectangle2
{
   public static void main(String[] args)
   {
      Rectangle r1 = new Rectangle(5, 10, 20, 30);
      r1.add(0,0);
      System.out.println(r1);
      System.out.println("Width: " + r1.getWidth());
      System.out.println("Height: " + r1.getHeight());
   }
}