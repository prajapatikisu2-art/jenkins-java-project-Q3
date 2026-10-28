public class App {
    public String greet() {
        return "Hello, Jenkins CI!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greet());
    }
}