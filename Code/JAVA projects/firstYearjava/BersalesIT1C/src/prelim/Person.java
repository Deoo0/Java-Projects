package prelim;

public class Person {
    String name;
    int age;
    String address;

    public Person(){
        name = "";
        age = 0;
        address = "";
    }
    public Person(String name){     
        this.name = name;
        age = 0;
        address = "";
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
        address = "";
    }
    public Person(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
}
