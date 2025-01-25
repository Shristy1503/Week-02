package multilevelinheritance.educationcoursehierarchy;

public class EducationCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming", 8, "Byjus", true, 200.0, 20.0);
        paidCourse.displayInfo();
    }
}
