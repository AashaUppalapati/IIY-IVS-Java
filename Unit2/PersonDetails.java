class Person{
    String name;
    int age;

    void setDetails(String n,int a){
        name=n;
        age=a;
    }

    void display(){
        System.out.println(name+" "+age);
    }
}

public class PersonDetails{
    public static void main(String[] args){
        Person p=new Person();
        p.setDetails("Ajay",20);
        p.display();
    }
}