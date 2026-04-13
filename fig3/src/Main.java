import Company.*;
import Employee.Employee;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Company gameCompany = new GameDevCompany();
        Company outsourcingCompany = new OutsourcingCompany();

        System.out.println("Game Development Company:");
        List<Employee> gameEmployees = gameCompany.getEmployees(3);
        for (Employee e : gameEmployees) {
            e.doWork();
        }

        System.out.println("-----");

        System.out.println("Outsourcing Company:");
        List<Employee> outsourceEmployees = outsourcingCompany.getEmployees(3);
        for (Employee e : outsourceEmployees) {
            e.doWork();
        }
    }
}