import java.util.ArrayList;
import java.util.List;

public class CompositeGeraeteTeil implements GerateTeil {

    private List<GerateTeil> childGerateTeil = new ArrayList<>();
    private int gesamtGewicht = 0;

    @Override
    public int printTotalWeight() {
        for (GerateTeil gerateTeil : childGerateTeil) {
           gesamtGewicht += gerateTeil.printTotalWeight();
        }
        return gesamtGewicht;
    }

    public void add(GerateTeil gerateTeil) {
        childGerateTeil.add(gerateTeil);
    }

    //Removes the graphic from the composition.
    public void remove(GerateTeil gerateTeil) {
        childGerateTeil.remove(gerateTeil);
    }

}
