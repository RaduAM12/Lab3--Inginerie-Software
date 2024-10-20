import java.util.HashMap;
import java.util.Map;

public class Scoala {

    Map<String, Clasa> m = new HashMap<>();

    public void adaugaClasa(String nume, Clasa c) {
        m.put(nume, c);
    }

    public void eliminaClasa(String nume) {
        m.remove(nume);
    }

    public void adaugaElevInClasa(String nume, Elev e) {
        m.get(nume).adaugaElev(e);
    }

    public void eliminaElevDupaNume(String nume) {
        m.remove(nume);
    }

    public int getNumarClase() {
        return m.keySet().size();

    }

    public int getTotalElevi() {
        for (String nume : m.keySet()) {
            System.out.println("Clasa " + m.get(nume).getClass());
        }
        return m.size();
    }

}
