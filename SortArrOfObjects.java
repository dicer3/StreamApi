import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }


    
}

public class SortArrOfObjects {
    public static void main(String[] args) {
        List<Employee> a1 = new ArrayList<>();
        a1.add(new Employee(3,"pragun"));
        a1.add(new Employee(4,"ravi"));
        a1.add(new Employee(15,"sunam"));
        a1.add(new Employee(7,"rajesh"));
        a1.add(new Employee(9,"Abhi"));

        List<Employee> newList = a1.stream().sorted((i,j)->i.getName().compareTo(j.getName())).collect(Collectors.toList());
        System.out.println("newList "+newList.toString());
    }
}
