import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
        out.println("Hello");
        MyService myService = new MyService();
        out.println(myService.getMyEntity());
        out.println(myService.setMyEntity(new MyEntity("second")));
        out.println(myService.getMyEntity());
    }
}