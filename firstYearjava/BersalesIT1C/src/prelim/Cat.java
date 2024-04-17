package prelim;

public class Cat {
    //member variables
    private String name;
    private int age;
    private String color;

    public Cat(){
        name = "";
        age = 0;
        color = "";
    }
    public Cat (String name){
        this.name = name;
        age = 0;
        color = "";
    }
    public Cat (String name, int age){
        this.name = name;
        this.age = age;
        color = "";
    }
    public Cat (String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    // member methods
    //getter method
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //age getter and setter
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void speak(){
        System.out.println("Meow!");
    }
}
