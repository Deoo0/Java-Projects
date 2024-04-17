package prelim;

public class Person2 {
    String name;
    int age;
    String address;
    
    public Person2(){
        name = " ";
        age = 0;
        address = " ";
    }
    public Person2(String name){
        this.name = name;
        age = 0;
        address = " ";
    }
    public Person2(String name, int age){
        this.name = name;
        this.age = age;
        address = " ";
    }
    public Person2(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    
}
