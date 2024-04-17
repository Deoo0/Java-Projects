package prelim;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Lawrence");
        Person person2 = new Person("Lawrence",19);
        Person person3 = new Person("Lawrence",19,"Tacloban");

        person.printInfo();
        System.out.println(" ");
        person1.printInfo();
        System.out.println(" ");
        person2.printInfo();
        System.out.println(" ");
        person3.printInfo();


        /*person.setName("Pedro");
        person.setAge(18);
        person.setAddress("Tacloban");

        person2.setName("Maria");
        person2.setAge(12);
        person2.setAddress("Manila");*/


    }
    
}
