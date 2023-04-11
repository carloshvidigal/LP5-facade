package facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Exam {

    private List<Driver> testedDrivers = new ArrayList<Driver>();

    public void addTestedDriver (Driver driver) {
        this.testedDrivers.add(driver);
    }

    public boolean checkTestedDriver (Driver driver) {
        return this.testedDrivers.contains(driver);
    }
}
