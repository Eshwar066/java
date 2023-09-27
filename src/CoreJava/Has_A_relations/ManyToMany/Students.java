package CoreJava.Has_A_relations.ManyToMany;

public class Students {

    private String SName;
    private Integer SAge;

    private Courses[] courses;

    public Students(String SName, Integer SAge, Courses[] courses) {
        this.SName = SName;
        this.SAge = SAge;
        this.courses = courses;
    }

    public  void display(){
        System.out.println("******************Student Details*****************");
        System.out.println("Student Name:"+SName);
        System.out.println("Student Age:"+SAge);

        System.out.println("*************Courses taken by student:"+SName);
        for (Courses course:courses){
            System.out.println(course.getCourseId());
            System.out.println(course.getCourseName());

        }

    }
}
