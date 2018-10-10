import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String... args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bart ", 10, 15));
        people.add(new Person("Lisa ", 8, 12));
        people.add(new Person("Marge ", 36,18));
        people.add(new Person("Maggie ", 1,5));
        people.add(new Person("Homer ", 39, 20));

        String lastName = "Simpson";
        List<Person> fullNames = people.stream().map(member -> {
            return new Person(member.getName() + " " + lastName, member.getAge(), member.getAdmission());
        }).collect(Collectors.toList());

//        ArrayList<Person> fullNames = new ArrayList<>();
//        for (Person person : people) {
//            fullNames.add(new Person(person.getName() + " " + lastName,  person.getAge(), person.getAdmission()));
//        }

        System.out.println(fullNames.toString());
    }
}