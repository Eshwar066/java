package CoreJava.Has_A_relations.ManyToMany;

public class TestCode {
    public static void main(String[] args) {

       Courses c1=new Courses(23,"java");
        Courses c2=new Courses(22,"javaCore");
        Courses c3=new Courses(24,"python");
        Courses c4=new Courses(25,"javaScript");
        Courses c5=new Courses(27,"Nestjs");

        Courses[] courses1=new Courses[2];
        courses1[0]=c3;
        courses1[1]=c2;

        Courses[] courses2=new Courses[3];
        courses2[0]=c1;
        courses2[1]=c2;
        courses2[2]=c5;

        Courses[] courses3=new Courses[1];
        courses3[0]=c4;


        Students s1=new Students("Eshwar",22,courses1);
        s1.display();
        Students s2=new Students("kavya",21,courses2);
        s2.display();
        Students s3=new Students("Ravi",22,courses3);
        s3.display();

    }
}
