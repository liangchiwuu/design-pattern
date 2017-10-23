package anti.godobject;

public class StudentUtils {

    public void FetchStudentDetails(int studentId) {
        System.out.println("Fetched student details.");
    }

    public void SaveStudentDetails(Student studentDetails) {
        System.out.println("Saved student details.");
    }

    public void ValidateStudentDetails(Student studentDetails) {
        System.out.println("Validated student details.");
    }

    public void ExportStudentDetailsToCSV(Student studentDetails) {
        System.out.println("Exported student details to CSV.");
    }

    public void ImportStudentDetailsForDb(Student studentDetails) {
        System.out.println("Imported student details for DB.");
    }

}
