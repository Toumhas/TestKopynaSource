import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scenar1();
    }

    private static void Scenar1() {
        List<Figurka> figurky = new ArrayList<Figurka>();
        figurky.add(new Zajicek(20));
        figurky.add(new Drak(1000));
        figurky.add(new Rytir(200));
        figurky.add(new Zajicek(17));

        figurky.forEach(figurka -> {
            System.out.println(figurka.toString());
        });
    }

    //Scenar 1 nemusi existovat
    private static void Scenar2() {
        List<Figurka> figurky = new ArrayList<Figurka>();
        new Rytir(150).naPlochu(figurky);
        new Drak(100).naPlochu(figurky);
        new Zajicek(20).naPlochu(figurky);
        new Zajicek(40).naPlochu(figurky);
        new Rytir(90).naPlochu(figurky);
        new Drak(500).naPlochu(figurky);
        new Zajicek(55).naPlochu(figurky);
        new Rytir(200).naPlochu(figurky);

        figurky.forEach(figurka -> {
            System.out.println(figurka.toString());
        });
    }
}