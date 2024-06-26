import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee2 implements Comparable<Employee2>{
    int id;
    String name;
    
    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee2 [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Employee2 e){
       return this.name.compareTo(e.name); 
    }
}

class IdComparator implements Comparator<Employee2>{

    @Override
    public int compare(Employee2 o1, Employee2 o2) {
          return o1.getId() - o2.getId();
    }
    
}
public class ComparatorComparable {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(12,"veeda"));
        list.add(new Employee2(22,"nupur"));
        list.add(new Employee2(8,"sakshi"));
        list.add(new Employee2(24,"aarti"));
        list.add(new Employee2(11,"preeti"));

        Collections.sort(list, new IdComparator());

        System.out.println("check "+list.toString());

    }
}
