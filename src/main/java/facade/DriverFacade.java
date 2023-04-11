package facade;

public class DriverFacade {

    public static boolean checkLicenceExams(Driver driver) {
        if (PraticalExam.getInstance().checkApprovedDriver(driver) &&
                PsychologicalExam.getInstance().checkApprovedDriver(driver) &&
                TheoricalExam.getInstance().checkApprovedDriver(driver)) {
            return true;
        } else {
            return false;
        }

    }
}
