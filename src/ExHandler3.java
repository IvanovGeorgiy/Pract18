import java.util.Objects;
import java.util.Scanner;

public class ExHandler3 {
    public String getDetails(String key) {
        if (Objects.equals(key, "")){
            throw new NullPointerException("Empty key");
        }
        return "data for " + key;
    }
    public void printDetails(String key){
        System.out.println(getDetails(key));
    }
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        while (Objects.equals(key, "")) {
            try {
                printDetails(key);
            } catch (Exception e) {
                System.out.println("Empty key");
                key = sc.nextLine();
            }
        }
        printDetails(key);
    }
}