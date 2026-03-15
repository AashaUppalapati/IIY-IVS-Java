class Student{
    String name;
    int age;

    Student(){
        name="Unknown";
        age=0;
    }

    Student(String n,int a){
        name=n;
        age=a;
    }

    void show(){
        System.out.println(name+" "+age);
    }
}

public class ConstructorOverload{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student("Ajay",20);
        s1.show();
        s2.show();
    }
}