package Task2;

public class PrintDetails extends Person {
    public PrintDetails(String name , int age) {
        super(name , age);
    }
    public void getDetails(){
        String name = getName();
        int age = getAge();
        System.out.println(name + " " + age);
    }
}
