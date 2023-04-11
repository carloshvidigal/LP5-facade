package facade;

public class TheoreticalExam extends Exam{

    private static TheoreticalExam theoricalExam = new TheoreticalExam();
    private TheoreticalExam() {};

    public static TheoreticalExam getInstance() {
        return theoricalExam;
    }


}
