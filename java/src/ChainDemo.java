import java.util.ArrayList;

public class ChainDemo {
    public static void main(String... args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bart Simpson", 10, 15));
        people.add(new Person("Lisa Simpson", 8, 12));
        people.add(new Person("Marge Simpson", 36,18));
        people.add(new Person("Maggie Simpson", 1,5));
        people.add(new Person("Homer Simpson", 39, 20));

        int adultAge = 18;

//        int totalCost = 0;
//        ArrayList<Person> adults = new ArrayList<>();
//        for (Person person : people) {
//            if (person.getAge() >= adultAge) {
//                totalCost += person.getAdmission();
//            }
//        }

        int totalCost  = people.stream()
                .filter(member -> member.getAge() >= adultAge)
                .map(Person::getAdmission)
                .reduce(0, (sum, admission) -> sum + admission);

        System.out.println("Total price of admission: $"+ totalCost);
    }


}
