package facade;

public class Driver {

    public boolean getDriverLicense() {
        return DriverFacade.checkLicenceExams(this);
    }
}
