
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    // Salary is the netPay
    // Correction : I wrote everything in one method and created the variables Wage and Total. I also added "void" after public, which I forgot to add.
    // I added the varibale deduction and arranged my equation to calculate the taxes.
    public void HourWage (int hours, int hourlyWage) {
        int wage = hourlyWage;
        int total = hours * wage;
        double deduction = total * 0.3; 
        double Salary = total - deduction;
        System.out.println("Your salary is :" + Salary + "$");
    }
}
