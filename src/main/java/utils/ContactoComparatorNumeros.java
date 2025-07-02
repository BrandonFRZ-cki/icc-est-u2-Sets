package utils;

import models.Contacto;

import java.util.Comparator;

public class ContactoComparatorNumeros implements Comparator<Contacto> {

    @Override
    public int compare(Contacto o1, Contacto o2) {
        // primero el apellido orden alfabetico
        int x =o1.getApellido().compareTo(o2.getApellido());
        if(x!=0)
            return x;
        // Segundo si son iguales comparo por el nombre orden alfabetico
        int y =o1.getNombre().compareTo(o2.getNombre());
        if(y!=0)
            return  y;
        return o2.getTelefono().compareTo(o1.getTelefono());
    }
}
