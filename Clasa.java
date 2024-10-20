import java.util.ArrayList;
import java.util.List;

public class Clasa {

    private int capacitate;
    private char litera;
    NumarClasa nr;

    Clasa(int capacitate, NumarClasa nr, char litera) {
        this.capacitate = capacitate;
        this.nr = nr;
        this.litera = litera;
    }

    List<Elev> elevi = new ArrayList<>();


    void adaugaElev(Elev e) {
        elevi.add(e);
    }


    public void eliminaElev(Elev e) {
        elevi.remove(e);
    }

    int getTotalElevi() {
        return elevi.size();
    }


}
