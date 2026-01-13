import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 1,2,2,3,3,4,5,6,7,8,8);
        // Using a Set to track seen elements
        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = list.stream().filter(e->!seen.add(e)).   //// add() returns false if element already exists
                collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);

    }
}
