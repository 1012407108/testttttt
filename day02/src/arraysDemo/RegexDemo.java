package arraysDemo;

public class RegexDemo {
    public static void main(String[] args) {
        String regex = "\\d{4,}";
        System.out.println("45455555".matches(regex));
    }
}
