public class ExHandler {
    public String getDetails(String key){
        if (key == null){
            throw new NullPointerException("null key");
        }
        return "data for " + key;
    }
    public void printMessage(String key){
        try {
            System.out.println(getDetails(key));
        } catch (Exception e){
            System.out.println("null key22");
        }
    }
}