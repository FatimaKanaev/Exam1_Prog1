
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird
{
    private String color;
    private String breed;
    private int age;
    
    public Bird(String color, String breed, int age) {
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    public void sing()  {
        System.out.println("Bird vocallization in action ...");
    }
}
