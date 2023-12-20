package Task2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alikhan" , 17);

        PrintDetails details = new PrintDetails("Alikhan" , 17);


        details.getDetails(); // From extended class

        int a = person.getAge(); // From Person class
        String b = person.getName();

        System.out.println(a + " " + b);
    }


}