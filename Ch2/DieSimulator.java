import java.util.Random; 
public class DieSimulator
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        System.out.println("You rolled: " + ( rand.nextInt(6) + 1 ));
    }
}