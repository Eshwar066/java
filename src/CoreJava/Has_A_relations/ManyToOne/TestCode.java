package CoreJava.Has_A_relations.ManyToOne;

public class TestCode {
    public static void main(String[] args) {

        Branch branch=new Branch("Mech","Bangalore");

        Student stud1=new Student(2,"Eshwar",branch);
        Student stud2=new Student(3,"Ravi",branch);
        Student stud3=new Student(4,"Navya",branch);

        Student[] students=new Student[3];

        students[0]=stud1;
        students[1]=stud2;
        students[2]=stud3;

         for(Student stud:students){
             stud.display();
         }


    }
}
