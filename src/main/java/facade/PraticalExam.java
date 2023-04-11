package facade;

public class PraticalExam extends Exam{

    private static PraticalExam praticalExam = new PraticalExam();

    private PraticalExam() {};

    public static PraticalExam getInstance() {
        return praticalExam;
    }
}
