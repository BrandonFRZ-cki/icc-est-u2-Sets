import java.util.*;

public class Sets {
    public Sets(){

    }
    public Set<String>  construirHashSet(){
        Set<String> palabras = new HashSet<String>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> palabrasLinkeadas = new LinkedHashSet<String>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");
        return palabrasLinkeadas;

    }
    public Set <String> construirTreeSet(){
        Set <String> palabrasTree = new TreeSet();
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        return palabrasTree;

    }
    public Set <String> construirTreeSetConComparador(){
        //Crear un comparator
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Comparamos la longitud
                int result =        Integer.compare(s1.length(), s2.length());
                if(result == 0)
                    result = s1.compareTo(s2);
                return result;

            }
        };

        Set <String> palabrasTree = new TreeSet(comparadorLongitud);
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        palabrasTree.add("Celulas");
        return palabrasTree;
    }
    public Set <String> construirTreeSetConComparadorAlfabeticoDescendente(){
        //Crear un comparator
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Comparamos la longitud
                int result =        Integer.compare(s2.length(), s1.length());
                if(result == 0)
                    result = s2.compareTo(s1);
                return result;

            }
        };

        Set <String> palabrasTree = new TreeSet(comparadorLongitud);
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        palabrasTree.add("Celulas");
        return palabrasTree;
    }
}
