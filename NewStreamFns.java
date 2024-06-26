import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class NewStreamFns {
    public static void main(String[] args) {
        ///List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        int nums[] = new int[]{10,15,8,49,25,98,98,32,15,10,15,49};
        List<Integer> newList =  Arrays.stream(nums).boxed().collect(Collectors.toList());
        System.out.println("newList "+newList.toString());

        HashSet<Integer> a1 = new HashSet<>(newList);
        if(a1.size() == newList.size()) {
            System.out.println("true");
        } 
        else{
            System.out.println("false");
        }
       }

}
