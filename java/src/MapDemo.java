import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String... args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Bart Simpson", 10, 15));
        people.add(new Person("Lisa Simpson", 8, 12));
        people.add(new Person("Marge Simpson", 36,18));
        people.add(new Person("Maggie Simpson", 1,5));
        people.add(new Person("Homer Simpson", 39, 20));

        String lastName = "Simpson";
        List<Person> fullNames = people.stream().map(member -> {
            return new Person(member.getName() + " " + lastName, member.getAge(), member.getAdmission());
        }).collect(Collectors.toList());


//        for (Person person : people) {
//            fullNames.add(new Person(person.getName() + " " + lastName,  person.getAge(), person.getAdmission()));
//        }

        System.out.println(fullNames.toString());
    }
}