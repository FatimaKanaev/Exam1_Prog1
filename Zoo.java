import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    private ArrayList<Bird> zooBirds;
    
    public Zoo() { 
        zooBirds = new ArrayList<>();
        zooBirds.add(new Bird("blue","blue jay", 2));
        zooBirds.add(new Bird("red","blue jay", 2));
        zooBirds.add(new Bird("blue","blue jay", 2));
        zooBirds.add(new Bird("red","blue jay", 2));
        zooBirds.add(new Bird("blue","blue jay", 2));
    }
    
    int countBlueBirds()  {
        int count = 0;
        for (Bird bird : zooBirds) {
            if(bird.getColor().equals("blue")) {
                count++;
            }
        }
        return count;
    }
}
