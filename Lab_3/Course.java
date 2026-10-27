public class Course {
    private String name;
    private final int maxStudents;
    private static int numberOfCreatedCourses;

    /*
    private w name i max students do ograniczenia możliwości zmiany wartości, również walidacja name
    numberOfCreatedCourses zlicza ilość przedmiotów utworzonych, stąd static
     */

    public Course(int maxStudents, String name) {
        this.maxStudents = maxStudents;
        this.name = name;

        numberOfCreatedCourses++;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;

        }
    }
}
