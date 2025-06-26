package prelim;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield");

        System.out.println(cat.getName() + " is a " + cat.getColor() + " cat who is " + cat.getAge() + " years old.");
        System.out.print("Miming says: ");
        cat.speak();

    }
    
}
