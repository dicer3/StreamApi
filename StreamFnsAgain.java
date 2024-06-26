import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFnsAgain {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(12,31,22); 
        List<Integer> list2 = List.of(12,31,22); 

        Stream<Integer> newList = Stream.concat(list1.stream(), list2.stream());

        String[] arr = new String[]{"abcd","dse","dsw","qwer"};

        List<String> ans = Arrays.stream(arr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("nice "+ans.toString());

        List<String> newAns = Arrays.stream(arr).map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println("new ans "+newAns.toString());

        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String,Long> namesCount = names.stream()
        .collect(
            Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )
        );

        System.out.println("names "+namesCount.toString());

        List<String> newNames = Arrays.asList("CC","AA", "BB", "AA", "CC");
        Map<String, Long> namesCount2 = names.stream()
        .filter(x-> Collections.frequency(newNames, x)>1)
        .collect(
            Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()
            )
        );

        System.out.println("names Count 2 "+namesCount2.toString());
    }
}
