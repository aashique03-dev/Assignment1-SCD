package Company;

import java.util.*;
import Employee.Employee;

public abstract class Company {

    public abstract Employee createEmployee();

    public List<Employee> getEmployees(int count) {
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(createEmployee());
        }

        return list;
    }
}