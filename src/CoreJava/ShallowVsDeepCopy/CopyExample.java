package CoreJava.ShallowVsDeepCopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class CopyExample {
    public static void main(String[] args) {
        // Creating a person object
        List<String> originalHobbies = new ArrayList<>(Arrays.asList("Reading", "Hiking"));
        Person originalPerson = new Person("Alice", originalHobbies);

        // Shallow copy example
        Person shallowCopy = originalPerson;
        shallowCopy.setName("Bob");
        shallowCopy.getHobbies().add("Swimming");

        // Deep copy example
        List<String> deepCopiedHobbies = originalPerson.getHobbies().stream()
                .collect(Collectors.toList());
        Person deepCopy = new Person(originalPerson.getName(), deepCopiedHobbies);
        deepCopy.setName("Charlie");
        deepCopy.getHobbies().add("Cooking");

        System.out.println("Original Person: " + originalPerson);
        System.out.println("Shallow Copy: " + shallowCopy);
        System.out.println("Deep Copy: " + deepCopy);
    }
}
