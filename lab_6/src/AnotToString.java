@ToString
public class AnotToString {
    @ToString(value = true) // поле будет включено в ToString
    String name;

    @ToString(value = false) // поле будет исключено из ToString
    int age;

    public void start() {
        System.out.println("Поле name включено в результат метода toString ");
        System.out.println("Поле age исключено из метода toString ");
    }
}