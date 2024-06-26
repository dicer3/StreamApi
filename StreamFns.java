import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFns {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> newList =   list.stream()

        //even numbers
        .filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println("newList ..."+newList.toString());

        // starting with 1 by converting to string
        list.stream()
        .map(s -> s + "").filter(s -> s.startsWith("1")).forEach(System.out::println);

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> st = new HashSet<>();
        
        List<Integer> mynewList = myList.stream()
        .filter(n -> !st.add(n)).collect(Collectors.toList());

        System.out.println("nice "+mynewList.toString());

        list.stream().findFirst().ifPresent(System.out::println);
        //System.out.println("no "+no);

        int ans = (int) list.stream().count();
        System.out.println("ans "+ans);

        Integer a = list.stream().max((i,j)->i.compareTo(j)).get();
        Integer b = list.stream().min((i,j)->i.compareTo(j)).get();

        System.out.println("a "+a+" "+b);

        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream()
                   .map(i -> i*i*i)
                   .filter(i -> i>50)
                   .forEach(System.out::println);

                   
    }
}
