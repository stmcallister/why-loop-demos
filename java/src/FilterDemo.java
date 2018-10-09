import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String... args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bart Simpson", 10, 15));
        people.add(new Person("Lisa Simpson", 8, 12));
        people.add(new Person("Marge Simpson", 36,18));
        people.add(new Person("Maggie Simpson", 1,5));
        people.add(new Person("Homer Simpson", 39, 20));

        int drinkingAge = 21;

//        List<Person> adults = people.stream().filter(member -> member.getAge() >= drinkingAge)
//                .collect(Collectors.toList());

        ArrayList<Person> adults = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= drinkingAge) {
                adults.add(person);
            }
        }

        System.out.println(adults.toString());
    }
}