package movil.unicauca.peliculasappmoviles.util;

import java.util.ArrayList;
import java.util.List;

import movil.unicauca.peliculasappmoviles.Listas.ListaEntradaEstrenos;
import movil.unicauca.peliculasappmoviles.R;

/**
 * Created by Sebastianl on 26/04/2017.
 */

public class Data {

    private static List<ListaEntradaEstrenos> data;

    public static List<ListaEntradaEstrenos> getData(){
        if (data == null){
            data = new ArrayList<>();
            ListaEntradaEstrenos l1 = new ListaEntradaEstrenos();
            l1.setTitulopelicula("Nunca Digas su Nombre");
            l1.setDuracion("Duración");
            l1.setNumerominutos(120);
            l1.setMinutos("Minutos");
            l1.setTipogenero("Género");
            l1.setGenero1("Terror");
            l1.setGenero2(" ");

            ListaEntradaEstrenos l2 = new ListaEntradaEstrenos();
            l2.setTitulopelicula("Logan");
            l2.setDuracion("Duración");
            l2.setNumerominutos(120);
            l2.setMinutos("Minutos");
            l2.setTipogenero("Género");
            l2.setGenero1("Acción");
            l2.setGenero2("Ficción");

            ListaEntradaEstrenos l3 = new ListaEntradaEstrenos();
            l3.setTitulopelicula("Rapidos y Furiosos");
            l3.setDuracion("Duración");
            l3.setNumerominutos(140);
            l3.setMinutos("Minutos");
            l3.setTipogenero("Género");
            l3.setGenero1("Acción");
            l3.setGenero2("Ficción");

            ListaEntradaEstrenos l4 = new ListaEntradaEstrenos();
            l4.setTitulopelicula("Un jefe en pañales");
            l4.setDuracion("Duración");
            l4.setNumerominutos(100);
            l4.setMinutos("Minutos");
            l4.setTipogenero("Género");
            l4.setGenero1("Animación");
            l4.setGenero2("Comedia");

            data.add(l1);
            data.add(l2);
            data.add(l3);
            data.add(l4);

        }
        return data;
    }
}
