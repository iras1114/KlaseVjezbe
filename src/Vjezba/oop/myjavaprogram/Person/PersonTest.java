package Vjezba.oop.myjavaprogram.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setId(12);
        person.setName("Edin");
        person.setSurname("Džeko");
        person.setAge(36);

        System.out.println("Ime:" + " " + person.getName()+ " " + "Prezime:" + " " + person.getSurname()+ " " + "Godina:" + " " + person.getAge()+ " " + "ID:"+ " " + person.getId());
    }
}
