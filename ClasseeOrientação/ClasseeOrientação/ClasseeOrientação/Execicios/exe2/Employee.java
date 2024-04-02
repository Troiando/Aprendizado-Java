package ClasseeOrientação.Execicios.exe2;

/**
 * Employee
 */
public class Employee {

    public String name;
    public double salaryBruto;
    public double tax;
    public double realSalary;


    public double NetSalary(){
        return salaryBruto-tax;
    }

    public void IncreaseSalary(double porcentage ) {
      realSalary =  (NetSalary() + ((porcentage/100)*(salaryBruto)));
    }

    public String toString(){
        return name 
            + ", $ " + String.format("%.2f", NetSalary());
        }
        

    }
