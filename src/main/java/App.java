import controllers.ContactoController;
import controllers.Sets;

public class App {
    public static void main(String[] args) {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetComparator();
        runTreeSetDescendente();
        ContactoController contactoController = new ContactoController();

    }
    public static void runHashSet() {
        Sets sets = new Sets();
        System.out.println(" ------- HashSet --------\nOrden: Diferente en cada pc");
        System.out.println(sets.construirHashSet());

    }
    public static void runLinkedHashSet() {
        Sets sets = new Sets();
        System.out.println(" ------- LinkedHashSet --------\nOrden: como due la de insersion");
        System.out.println(sets.construirLinkedHashSet());
    }
    public static void runTreeSet() {
        Sets sets = new Sets();
        System.out.println(" ------- TreeSet --------\nOrden: Alfabetico (En orden)");
        System.out.println(sets.construirTreeSet());
    }
    public static void runTreeSetComparator() {
        Sets sets = new Sets();
        System.out.println(" ------- TreeSet --------\nOrden: Alfabetico (En orden)");
        System.out.println(sets.construirTreeSetConComparador());

    }
    public static void runTreeSetDescendente() {
        Sets sets = new Sets();
        System.out.println(" ------- TreeSet Alfabetico Descendente--------\nOrden: Alfabetico (En orden)");
        System.out.println(sets.construirTreeSetConComparadorAlfabeticoDescendente());

    }
}

