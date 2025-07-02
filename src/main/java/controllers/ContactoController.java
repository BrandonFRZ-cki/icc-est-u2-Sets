package controllers;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparatorNumeros;

import java.util.Set;
import java.util.TreeSet;

public class ContactoController {
    public ContactoController() {
        runTreeContacto();
        runTreeContactoNumeros();
    }
    private void runTreeContacto() {
        ContactoComparator contactoComparator = new ContactoComparator();
        Set<Contacto> agenda = new TreeSet<Contacto>(contactoComparator);
        System.out.println("------------------------------ APELLIDO Y NOMBRE");
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
    private void runTreeContactoNumeros() {
        ContactoComparatorNumeros contactoComparatorNumeros = new ContactoComparatorNumeros();
        Set<Contacto> agenda = new TreeSet<Contacto>(contactoComparatorNumeros);
        System.out.println("------------------------------ APELLIDO, NOMBRE Y TELEFONO");
        // Agregamos algunos contactos
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Pedro", "Gonzales", "123456789"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez","123456789"));

        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
    }
}
