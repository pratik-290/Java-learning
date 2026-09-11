class Hello {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();


        s2.name = "Mahesh";
        s2.age = 25;
        s2.rollno = 55;

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

    Student(){
        name = "Pratik";
        age = 21;
        rollno = 57;
    }

}