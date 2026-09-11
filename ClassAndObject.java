public class ClassAndObject {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();


        s1.name = "Mahesh";
        s1.age = 25;
        s1.rollno = 55;

        s2.name = "Pratik";
        s2.age = 22;
        s2.rollno = 40;


        s1.print();
        s2.print();
        
        
    }
}

class Student{
    String name;
    int age;
    int rollno ;

    void print(){
        System.out.println( name +" "+age + " "+ rollno);
    }

    

}
