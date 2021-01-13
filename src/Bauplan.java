public class Bauplan {
    public static void main(String[] args) {
        Bauteil stein = new Bauteil(20);
        Bauteil eisen = new Bauteil(22);
        Bauteil klopapier = new Bauteil(2000);
        Bauteil rohrzange = new Bauteil(10);
        Bauteil nutzloseScheisse = new Bauteil(10000);

        Bauteil panel = new Bauteil(1000000);

        CompositeGeraeteTeil handy = new CompositeGeraeteTeil();
        CompositeGeraeteTeil display = new CompositeGeraeteTeil();
        display.add(panel);
        handy.add(display);
        handy.add(stein);
        handy.add(eisen);
        handy.add(klopapier);
        handy.add(rohrzange);
        handy.add(nutzloseScheisse);

        System.out.println("Das totale Gewicht beträgt: " + handy.printTotalWeight());

        handy.remove(nutzloseScheisse);

        System.out.println("Das totale Gewicht beträgt: " + handy.printTotalWeight());
    }
}
