package Company;

import Employee.*;

public class OutsourcingCompany extends Company {

    public Employee createEmployee() {
        return new Programmer();
    }
}