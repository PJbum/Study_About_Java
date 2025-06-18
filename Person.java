public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("Hello, my name is "+name+" and I am "+age+" years old");
    }
    public int haveBirthday(){
        age += 1;
        return age;
    }
}
    class PersonTest {
        public static void main(String[] args){
            Person person1 = new Person("Park", 22);
            Person person2 = new Person("Kim", 25);
            person1.introduce();
            person2.introduce();
            int newage = person1.haveBirthday();
            System.out.println(person1+" has a new age: "+newage);
        }
    }