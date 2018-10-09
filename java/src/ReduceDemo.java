import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceDemo {
    public static void main(String... args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bart Simpson", 10, 15));
        people.add(new Person("Lisa Simpson", 8, 12));
        people.add(new Person("Marge Simpson", 36,18));
        people.add(new Person("Maggie Simpson", 1,5));
        people.add(new Person("Homer Simpson", 39, 20));

//        int totalCost = 0;

        int totalCost  = people.stream()
                .map((person) -> person.getAdmission())
                .reduce(0, (sum, admission) -> sum + admission);
//
//        for (Person person : people) {
//            totalCost += person.getAdmission();
//        }
        System.out.println("Total price of admission (with reduce): $"+ totalCost);
    }


}
