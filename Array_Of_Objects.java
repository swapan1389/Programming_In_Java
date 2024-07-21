class Student{
    int rollno;
    String Name;
    int age;
}
public class Array_Of_Objects{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.rollno=101;
        s1.Name="A";
        s1.age=18;
        Student s2=new Student();
        s2.rollno=102;
        s2.Name="B";
        s2.age=19;
        Student s3=new Student();
        s3.rollno=103;
        s3.Name="C";
        s3.age=18;
        Student students[]=new Student[3]; 
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            System.out.println(students[i].Name+":"+students[i].age);
        }


    }

}