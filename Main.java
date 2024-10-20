import java.util.ArrayList;
import java.util.List;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Elev e1 = new Elev("Andrei", Gen.MASCULIN);
        Elev e2 = new Elev("Andreea", Gen.FEMININ);
        Elev e3 = new Elev("Mihai", Gen.NESPECIFICAT);


        Clasa c1 = new Clasa(30, NumarClasa.I, 'A');
        Clasa c2 = new Clasa(20, NumarClasa.II, 'B');

        Scoala s = new Scoala();
        s.adaugaClasa("1a", c1);
        s.adaugaClasa("2b", c2);
        s.adaugaElevInClasa("2b", e1);
        s.adaugaElevInClasa("1a", e2);

        s.getNumarClase();
        s.getTotalElevi();
        System.out.println(s.getTotalElevi());
    }
}