package facade;

public class Driver {

    public boolean getDriverLicense() {
        return DriverFacade.checkPendingExams(this);
    }
}
