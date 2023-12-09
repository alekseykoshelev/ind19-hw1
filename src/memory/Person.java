package memory;

public class Person {

    private String name;
    private String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void changePerson(Person person) {
        person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    public void changePerson2(Person person) {
        person.name = "Ilya";
        person.surname = "Lagutenko";
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               '}';
    }
}
