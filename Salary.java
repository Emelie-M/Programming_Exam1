
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    public void netPay(double hours, double hourlyWage)
    {
        double taxes = 0.30;
        double salary = hours * hourlyWage;
        double deduction = salary * taxes;
        double total = salary - deduction;
        System.out.println(total);
    }
}
