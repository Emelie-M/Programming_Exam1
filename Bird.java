
/**
 * Write a description of class Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private String color;
    private String breed;
    private int age;

    /**
     * Constructor for objects of class Bird
     */
    public Bird(String color, String breed, int age)
    {
        // initialise instance variables
        this.color = color;
        this.breed = breed;
        this.age = age;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void sing()
    {
        // put your code here
        System.out.println("Bird_vocalization_in_action...");
    }
    
        public String getColor() {
        return color;
    }
}
