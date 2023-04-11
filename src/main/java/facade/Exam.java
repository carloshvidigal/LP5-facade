package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Exam {
    private List<Driver> pendingDrivers = new ArrayList<Driver>();

    public void addPendingDriver (Driver driver) {
        this.pendingDrivers.add(driver);
    }
    public boolean checkPendingDrivers (Driver driver) {
        return this.pendingDrivers.contains(driver);
    }
}
