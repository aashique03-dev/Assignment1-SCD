package Company;

import Employee.*;

public class GameDevCompany extends Company {

    public Employee createEmployee() {
        return new Designer();
    }
}