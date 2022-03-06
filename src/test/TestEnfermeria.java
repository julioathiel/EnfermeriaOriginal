package test;

import calculogota.*;
import java.util.Scanner;

public class TestEnfermeria {

    public static void main(String[] args) {

        Scanner usuario = new Scanner(System.in);
        Suero e = new Suero(3, 24);
        GotasMinuto gm = new GotasMinuto(3, 24, 8);

        System.out.println("Cuantas gotas por minutos desea agregar?");
        e.setGotas(usuario.nextDouble());
        System.out.println("De qué milimetro es el suero?");
        e.setMlSuero(usuario.nextDouble());
        e.proceso(e.getGotas(), e.getMlSuero());
        
        System.out.println("Cual es el tiempo");
        gm.setTiempo(usuario.nextDouble());
        System.out.println("Agrega el ml del suero");
        gm.setSueroML(usuario.nextDouble());
        gm.proceso(gm.getTiempo(),gm.getSueroML());
    }
}
 