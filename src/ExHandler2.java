import java.util.Objects;
import java.util.Scanner;

public class ExHandler2 {
    public String getDetails(String key) {
        if (Objects.equals(key, "")){
            throw new NullPointerException("empty key");
        }
        return "data for " + key;
    }
    public void printDetails(String key){
        System.out.println(getDetails(key));
    }
    public void getKey(){
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        try{
            printDetails(key);
        } catch (Exception e){
            System.out.println("empty key");
        }
    }
}