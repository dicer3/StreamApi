import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatingStream {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        input = input.toLowerCase();

        Map<Character, Long> frequencyMap = 
        input.chars().
        mapToObj(c -> (char)c)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character ans = input.chars().
        mapToObj(ch -> (char)ch)
        .filter(ch -> frequencyMap.get(ch) == 1)
        .findFirst().get();
        System.out.println("nice "+frequencyMap.toString());
        System.out.println("see "+ans);
    }
}
