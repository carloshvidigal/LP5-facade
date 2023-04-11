package facade;

public class PsychologicalExam extends Exam{
    private static PsychologicalExam psychologicalExam = new PsychologicalExam();

    private PsychologicalExam() {};

    public static PsychologicalExam getInstance() {
        return psychologicalExam;
    }
}
