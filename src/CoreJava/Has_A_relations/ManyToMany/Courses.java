package CoreJava.Has_A_relations.ManyToMany;

public class Courses {

    private Integer courseId;
    private String courseName;



    public Courses(Integer courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;

    }

    public Integer getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }


}
