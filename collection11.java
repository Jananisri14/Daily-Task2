package JavaCore;
import java.util.*;

public class collection11 {
    public static void main(String[] args) {
      Set<String> s = new LinkedHashSet<>();
      s.add("Java");
      s.add("Hello");
      s.add("Programming");
      s.add("World");

      Iterator<String> it = s.iterator();
      String result = "";

      while (it.hasNext()) {
            String value = it.next();
            System.out.println("Elements in the Set : " + value);
            result = result + value + " ";
        }
        System.out.println("Concatenated result: " + result.trim());
    }
}