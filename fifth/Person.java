package fifth;

public class Person {
    
    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }
    private String name;
    private int age;
    private String sex;

public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex() {
        return sex;
    }

    private void eat() {
    	System.out.println(name+"正在吃东西");
    }

    private void sleep() {
    System.out.println(name+"正在睡觉");
    }

    private void dadoudou() {
    	System.out.println(name+"正在打豆豆");
    }
}
