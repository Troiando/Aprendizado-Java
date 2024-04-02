package ClasseeOrientação.Execicios.exe2;

import java.util.Locale;
import java.util.Scanner;

public class exe1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        // Requerimento
        System.out.println("Nome: ");
        employee.name = sc.nextLine();
        System.out.println("Salario Bruto: ");
        employee.salaryBruto = sc.nextDouble();
        System.out.println("Taxa: ");
        employee.tax = sc.nextDouble();

        // resultado Parcial
        System.out.println("");
        System.out.println("Employee: " + employee.toString());
        System.out.println("");

        // Requerimento da Porcentagem
        System.out.println("Taxa para acrecimo: ");
        double porcentage = sc.nextDouble();
        employee.IncreaseSalary(porcentage);

        // Resultado Final
        System.out.println("Uptadet data: " + employee.name + ", $ " + String.format("%.2f", employee.realSalary));

    }
}
