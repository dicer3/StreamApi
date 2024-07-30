import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Check {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
		List<Integer> ans = myList.stream().filter(ele -> ele.toString().
		startsWith("1")).collect(Collectors.toList());

        List<Integer> ans2 = myList.stream().map(ele -> ele.toString()).filter(ele -> ele.startsWith("1")).map(ele->Integer.parseInt(ele)).collect(Collectors.toList());
        System.out.println("ok "+ans.toString());

        System.out.println("ok "+ans2.toString());

        List<Integer> myList2 = Arrays.asList(1, 1, 85, 6, 2, 3, 65, 6, 45, 45, 5662, 2582, 2, 2, 266, 666, 656);
        Set<Integer> st = new HashSet<>(myList2);
        List<Integer> ans3 = st.stream().collect(Collectors.toList());

        Set<Integer> st2 = new HashSet<>();
        List<Integer> ans4 = myList2.stream().filter(ele -> !st2.add(ele)).collect(Collectors.toList());

        Integer a = myList2.stream().max((i,j)->i.compareTo(j)).get();

        String[] k2 = new String[]{"ft","ft","f7"};
        List<String> ans5 = List.of(k2);
    }
}
