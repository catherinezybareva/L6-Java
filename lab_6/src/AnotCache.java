@Cache(value = {"item1", "item2", "item3"})
public class AnotCache {
    public void start() {
        System.out.println("Класс использует аннотацию @Cache с элементами: item1, item2, item3");
    }
}