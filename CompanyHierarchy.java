import java.util.Scanner;

abstract class Employee
{
    protected  String name;
    protected double salary;
    protected double baseSalary;

    public Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateBonus();

    public void showDetails()
    {
        System.out.println("Name: " + name + " | Salary: $" + baseSalary);

    }
}

class Manager extends Employee
{
    private int teamsize;
    public Manager(String name,double baseSalary,int teamsize ){
        super(name,baseSalary);
        this.teamsize = teamsize;
    }

    @Override
    public double calculateBonus() {
        return baseSalary*0.1+(teamsize*200);
    }
}

class Developer extends Employee
{
    private String techstack;
    public Developer(String name,double baseSalary,String techstack){
        super(name,baseSalary);
        this.techstack = techstack;
    }
    public double calculateBonus() {
        return baseSalary*0.07;
    }
}
public class CompanyHierarchy{
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name of employee:");
            String name = sc.nextLine();
            System.out.println("Enter Base Salary:");
            double baseSalary = sc.nextDouble();
            System.out.println("Enter the number of teamsize:");
            int teamsize = sc.nextInt();
            Manager m = new Manager(name, baseSalary,teamsize);
            m.showDetails();
            System.out.println("Bonus: " + m.calculateBonus());
            sc.nextLine();
            System.out.println("Enter the name of Developer:");
            String dev_name = sc.nextLine();
            sc.nextLine();
            System.out.println("Enter Base Salary:");
            double dev_baseSalary = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter techstack:");
            String techstack = sc.nextLine();
            Developer d = new Developer(dev_name,dev_baseSalary,techstack);
            d.showDetails();
            System.out.println("Bonus: " + d.calculateBonus());

        }

        }
