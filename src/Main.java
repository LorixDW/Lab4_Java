import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Apple> appleBox1 = new Box<>(new Apple(), new Apple());
        Box<Orrange> orrangeBox = new Box<>(new Orrange(), new Orrange());
        Box<Orrange> orrangeBox1 = new Box<>();
        appleBox.Transfer(appleBox1);
        appleBox1.Print();
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
        System.out.println(orrangeBox.getWeight());
        orrangeBox1.AddNum(5);
        orrangeBox1.Print();
    }
}
