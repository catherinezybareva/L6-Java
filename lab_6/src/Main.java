
public class Main {
    public static void main(String[] args) {

        System.out.print("\nЗадание 2 на аннотацию: \n");

        System.out.print("\nЗадание 2 №1\n");

        AnotInvoke ex21 = new AnotInvoke();
        ex21.start();

        System.out.print("\nЗадание 2 №2\n");

        AnotDefault ex22 = new AnotDefault();
        ex22.start();

        System.out.print("\nЗадание 2 №3\n");

        AnotToString ex23 = new AnotToString();
        ex23.start();

        System.out.print("\nЗадание 2 №4\n");

        AnotValidate ex24 = new AnotValidate();
        ex24.start();

        System.out.print("\nЗадание 2 №5\n");

        AnotTwo ex25 = new AnotTwo();
        ex25.start();

        System.out.print("\nЗадание 2 №6\n");

        AnotCache ex26 = new AnotCache();
        ex26.start();
    }
}