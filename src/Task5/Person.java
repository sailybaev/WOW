package Task5;

public class Person{
    private String name;
    private int age;

    public void setName(String a){name = a;}
    public void setAge(int a){age = a;}

    public void getName(){
        System.out.println(name);
    }
    public void getAge(){
        System.out.println(age);
    }


    public void setData(String a , int b) {
        name =a;
        age = b;
    }

    public void getData(){
        System.out.println(name + " " + age);
    }


}
