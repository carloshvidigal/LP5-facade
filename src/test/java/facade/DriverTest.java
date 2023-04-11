package facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DriverTest {

    @Test
    void shouldGetDriverPendingTheoreticalExam() {
        Driver driver = new Driver();
        TheoreticalExam.getInstance().addPendingDriver(driver);

        assertEquals(false, driver.getDriverLicense());
    }

    @Test
    void shouldGetDriverPendingPracticalExam() {
        Driver driver = new Driver();
        PracticalExam.getInstance().addPendingDriver(driver);

        assertEquals(false, driver.getDriverLicense());
    }

    @Test
    void shouldGetDriverPendingPsychologicalExam() {
        Driver driver = new Driver();
        PsychologicalExam.getInstance().addPendingDriver(driver);

        assertEquals(false, driver.getDriverLicense());
    }

    @Test
    void shouldGetDriverAbleToGetDriverLicense() {
        Driver driver = new Driver();

        assertEquals(true, driver.getDriverLicense());

    }


}
