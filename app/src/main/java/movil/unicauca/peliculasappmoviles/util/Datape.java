package movil.unicauca.peliculasappmoviles.util;

import java.util.ArrayList;
import java.util.List;

import movil.unicauca.peliculasappmoviles.Listas.ListaEntradaProximosEstrenos;

/**
 * Created by Sebastianl on 27/04/2017.
 */

public class Datape {

    private static List<ListaEntradaProximosEstrenos> datape;

    public static List<ListaEntradaProximosEstrenos> getDatape(){
        if (datape == null) {
            datape = new ArrayList<>();

            ListaEntradaProximosEstrenos pe1 = new ListaEntradaProximosEstrenos();
            pe1.setTituloproximapelicula("Nunca Digas su Nombre");
            pe1.setP_duracion("Duración");
            pe1.setP_numerominutos(120);
            pe1.setP_minutos("Minutos");
            pe1.setP_tipogenero("Género");
            pe1.setP_genero1("Terror");
            pe1.setP_genero2(" ");
            pe1.setP_boton("Recordar");
            pe1.setP_image("http://www.embloga2.com/wp-content/uploads/2016/11/544545.jpg");

            ListaEntradaProximosEstrenos pe2 = new ListaEntradaProximosEstrenos();
            pe2.setTituloproximapelicula("Logan");
            pe2.setP_duracion("Duración");
            pe2.setP_numerominutos(120);
            pe2.setP_minutos("Minutos");
            pe2.setP_tipogenero("Género");
            pe2.setP_genero1("Acción");
            pe2.setP_genero2("Ficción");
            pe2.setP_boton("Recordar");
            pe1.setP_image("http://www.embloga2.com/wp-content/uploads/2016/11/544545.jpg");

            ListaEntradaProximosEstrenos pe3 = new ListaEntradaProximosEstrenos();
            pe3.setTituloproximapelicula("Rapidos y Furiosos");
            pe3.setP_duracion("Duración");
            pe3.setP_numerominutos(140);
            pe3.setP_minutos("Minutos");
            pe3.setP_tipogenero("Género");
            pe3.setP_genero1("Acción");
            pe3.setP_genero2("Ficción");
            pe3.setP_boton("Recordar");
            pe1.setP_image("http://www.embloga2.com/wp-content/uploads/2016/11/544545.jpg");

            ListaEntradaProximosEstrenos pe4 = new ListaEntradaProximosEstrenos();
            pe4.setTituloproximapelicula("Un jefe en pañales");
            pe4.setP_duracion("Duración");
            pe4.setP_numerominutos(100);
            pe4.setP_minutos("Minutos");
            pe4.setP_tipogenero("Género");
            pe4.setP_genero1("Animación");
            pe4.setP_genero2("Comedia");
            pe4.setP_boton("Recordar");
            pe1.setP_image("http://www.embloga2.com/wp-content/uploads/2016/11/544545.jpg");

            datape.add(pe1);
            datape.add(pe2);
            datape.add(pe3);
            datape.add(pe4);

        }
        return datape;
    }

}
