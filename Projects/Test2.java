import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test2
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL("http://i.ytimg.com/vi/ofiv-vDf4M8/hqdefault.jpg");
        JOptionPane.showMessageDialog(null, "WOAH NICE GRAPHICS", "I'D LIKE TO GET MY HANDS ON THAT GAME",
               JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}