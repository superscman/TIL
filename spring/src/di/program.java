package di;

import di.entity.Exam;
import di.entity.NewlecExam;
import di.ui.ExamConsole;
import di.ui.GridExamConsole;
import di.ui.INlineExamConsole;

public class program {
    public static void main(String[] args) {
        Exam exam = new NewlecExam();
//        ExamConsole console = new INlineExamConsole(exam); //DI
        ExamConsole console = new GridExamConsole(exam);
        console.print();
    }
}
