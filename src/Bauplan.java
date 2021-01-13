public class Bauplan {
    public static void main(String[] args) {
        Bauteil stein = new Bauteil(20);
        Bauteil eisen = new Bauteil(22);
        Bauteil klopapier = new Bauteil(2000);
        Bauteil rohrzange = new Bauteil(10);

        CompositeGeraeteTeil handy = new CompositeGeraeteTeil();
        handy.add(stein);
        handy.add(eisen);
        handy.add(klopapier);
        handy.add(rohrzange);

        System.out.println("Das totale Gewicht beträgt: " + handy.printTotalWeight());
    }
}
