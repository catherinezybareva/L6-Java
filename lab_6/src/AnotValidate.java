@Validate(value = {String.class, Integer.class})
public class AnotValidate {
    public void start() {
        System.out.println("Класс аннотирован @Validate с разрешёнными типами: String и Integer");
    }
}