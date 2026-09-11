class Hello {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Pratik";
        s1.age = 21;
        s1.rollno = 57;

        s2.name = "Mayur";
        s2.age = 21;
        s2.rollno = 59;

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