package di.ui;

import di.entity.Exam;

public class INlineExamConsole implements ExamConsole {

    private Exam exam;


    public INlineExamConsole(Exam exam) {
        this.exam = exam;
    }

    @Override
    public void print() {
        System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
    }
}
