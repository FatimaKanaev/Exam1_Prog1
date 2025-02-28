
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    private int currentYear = 2025; 
    public void CalculateAge(int birthYear){
        int age = currentYear - birthYear;
        if (age >= 16) {
            System.out.println("You're alowed to drive in Canada");
        }
        else {
            System.out.println("You have to wait " + (16 -age) + "years to start driving");
        }
    } 
}
