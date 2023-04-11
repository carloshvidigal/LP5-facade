package facade;

public class DriverFacade {

    public static boolean checkPendingExams(Driver driver) {
        if (PracticalExam.getInstance().checkPendingDrivers(driver)) {
            return false;
        }
        if (PsychologicalExam.getInstance().checkPendingDrivers(driver)) {
            return false;
        }
        if (TheoreticalExam.getInstance().checkPendingDrivers(driver)) {
            return false;
        }
        return true;
    }
}
