public class Bauteil implements GerateTeil {

    private int gewicht;

    public Bauteil(int gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public int printTotalWeight() {
        return gewicht;
    }
}
