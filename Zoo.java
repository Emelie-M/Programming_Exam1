import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private ArrayList<Bird> zooBirds;
    
    public Zoo() 
    {
        zooBirds = new ArrayList<Bird>();
        zooBirds.add(new Bird("blue","blue jay",2));
        zooBirds.add(new Bird("blue","blue jay",2));
        zooBirds.add(new Bird("red","blue jay",2));
    }
    
    public int countBlueBirds()
    {
        int sum = 0;
        for (Bird bird : zooBirds)
        {
            if(bird.getColor().equals("blue"))
            {
                sum++;
            }
        }
        return sum;
    }
}
