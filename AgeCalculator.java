
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;

    public int ageCalculation(int yearOfBirth)
    {
        int age = currentYear - yearOfBirth;
        if (age>=16)
        {
            System.out.println("you can drive");
        }
        else{
            int remainder = 16 - age;
            System.out.println("you need to wait "+remainder+" years to start driving");
        }
        return age;
    }
}
