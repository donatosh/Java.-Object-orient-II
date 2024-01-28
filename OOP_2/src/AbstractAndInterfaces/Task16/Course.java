package AbstractAndInterfaces.Task16;

public class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Это место оставлено для выполнения задания
    }

    @Override
    public Object clone(){
        Course obj = new Course(getCourseName());
        obj.students = new String[100];

        System.out.println(getStudents().length);

        for (int i = 0; i < getStudents().length - 1; i++){
            obj.addStudent(getStudents()[i]);
        }

        return obj;
    }
}
