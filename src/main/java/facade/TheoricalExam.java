package facade;

public class TheoricalExam extends Exam{

    private static TheoricalExam theoricalExam = new TheoricalExam();
    private TheoricalExam() {};

    public static TheoricalExam getInstance() {
        return theoricalExam;
    }


}
