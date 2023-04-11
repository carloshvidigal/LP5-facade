package facade;

public class PracticalExam extends Exam{

    private static PracticalExam practicalExam = new PracticalExam();

    private PracticalExam() {};

    public static PracticalExam getInstance() {
        return practicalExam;
    }
}
