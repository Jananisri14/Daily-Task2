package JavaCore;
import java.util.*;
public class collection10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("How many names do you want to input? ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name #" + i + ": ");
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println("Names longer than 5 characters:");
        for (String name : names) {
            if (name.length() > 5) {
                System.out.println(name);
            }
        }

        
    }
}