public class Person {
    String name;
    int age;
    int admission;

    public Person(String name, int age, int admission) {
        this.name = name;
        this.age = age;
        this.admission = admission;
    }

    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("Name: "+ name +". Age: "+ age);
    }

    public Integer getAdmission() {
        return this.admission;
    }
}
