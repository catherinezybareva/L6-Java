
@Default(value = String.class) // аннотация к типу
public class AnotDefault {

    @Default(value = String.class) // аннотация к полю
    String field;

    public void start() {
        System.out.println("Поле field со значением " + field + " имеет аннотацию @Default и связано с типом String");
    }
}