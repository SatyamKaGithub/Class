public class P17 {
    private String name;
    private int age;

    public P17() {
        this.name = "Unknown";
        this.age = 0;
    }

    public P17(String name) {
        this.name = name;
        this.age = 0;
    }

    public P17(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        P17 person1 = new P17();
        P17 person2 = new P17("John");
        P17 person3 = new P17("Jane", 25);

        System.out.println("Person 1: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Person 2: " + person2.getName() + ", Age: " + person2.getAge());
        System.out.println("Person 3: " + person3.getName() + ", Age: " + person3.getAge());
    }
}

