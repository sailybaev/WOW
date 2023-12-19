package Task5;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Default", 0);

        person.age = 6;
        person.name = "Apple";

        person.setAge(17);
        person.setName("Alikhan");


        person.getAge();
        person.getName();

    }


}