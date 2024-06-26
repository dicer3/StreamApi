import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee1 implements Serializable{
   int id;
   String name;
   public Employee1(int id, String name) {
     this.id = id;
     this.name = name;
    }

    @Override
    public String toString() {
      return "Employee [id=" + id + ", name=" + name + "]";
    }
    
}

public class Serz {
    public static void main(String[] args){

        try {
        Employee1 e1 = new Employee1(21, "pragun");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.txt"));
        oos.writeObject(e1);

        ObjectInputStream newOb = new ObjectInputStream(new FileInputStream("file.txt"));
        Employee1 e2 = (Employee1) newOb.readObject();
        System.out.println("e2 "+e2.toString());

        oos.close();
        newOb.close();

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    }
}
