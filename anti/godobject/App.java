package anti.godobject;

public class App {

    public static void main(String[] args) {

        StudentUtils studentUtils = new StudentUtils();
        Student student = new Student();

        studentUtils.FetchStudentDetails(21);
        studentUtils.SaveStudentDetails(student);
        studentUtils.ValidateStudentDetails(student);
        studentUtils.ExportStudentDetailsToCSV(student);
        studentUtils.ImportStudentDetailsForDb(student);

    }

}
