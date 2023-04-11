package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Exam {

    private List<Driver> approvedDrivers = new ArrayList<Driver>();

    public void addApprovedDrivers (Driver driver) {
        this.approvedDrivers.add(driver);
    }

    public boolean checkApprovedDriver (Driver driver) {
        return this.approvedDrivers.contains(driver);
    }
}
