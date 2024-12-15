public class Main {
    public static void main(String[] args) {
        Ex ex = new Ex();
        ex.ex();
        ex.ex2();

        ExHandler t = new ExHandler();
        t.printMessage(null);
        t.printMessage("normal key");

        ExHandler2 t2 = new ExHandler2();
        t2.getKey();

        ExHandler3 t3 = new ExHandler3();
        t3.getKey();
    }
}