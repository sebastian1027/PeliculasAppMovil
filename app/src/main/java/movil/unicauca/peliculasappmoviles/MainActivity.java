package movil.unicauca.peliculasappmoviles;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

import movil.unicauca.peliculasappmoviles.Listas.ListaEntradaEstrenos;


public class MainActivity extends Activity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_estrenos);

        ArrayList<ListaEntradaEstrenos> datos = new ArrayList<ListaEntradaEstrenos>();

        datos.add(new ListaEntradaEstrenos(R.drawable.unjefe, "Un Jefe en Pañales", "Duración: ",120,
                "Minutos", "Género", "animacion", "comedia"));
        datos.add(new ListaEntradaEstrenos(R.drawable.elcieloespera, "El Cielo Espera", "Duración", 120,
                "Minutos", "Género", "Drama", ""));
        datos.add(new ListaEntradaEstrenos(R.drawable.empeliculados, "Empeliculados", "Duración", 130,
                "Minutos", "Género", "Comedia", ""));
        datos.add((new ListaEntradaEstrenos(R.drawable.lapuertadelguerrero, "La Puerta del guerrero","Duración", 100,
                "Minutos", "Género: ", "Acción", "" )));
        datos.add(new ListaEntradaEstrenos(R.drawable.nuncadigassunombre, "Nunca Digas su Nombre", "Duración", 120,
                "Minutos", "Género: ", "Terror", "" ));
        datos.add(new ListaEntradaEstrenos(R.drawable.posterrapidosyfuriosos8, "Rapidos y Furiosos", "Duración", 120,
                "Minutos", "Género", "Acción", "Ficción" ));
        datos.add(new ListaEntradaEstrenos(R.drawable.silencio, "Silencio", "Duración", 120,
                "Minutos", "Género", "Acción", "" ));


        lista = (ListView) findViewById(R.id.ListView_listado_e);
        lista.setAdapter(new ListaAdaptadorEstrenos(datos, R.layout.fragment_estrenos, this) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    ImageView imagen_pelicula = (ImageView) view.findViewById(R.id.imageView_imagen);
                    if (imagen_pelicula != null)
                        imagen_pelicula.setImageResource(((ListaEntradaEstrenos) entrada).getIdImagen());

                    TextView texto_Titulo = (TextView) view.findViewById(R.id.textotitulopelicula);
                    if (texto_Titulo != null)
                        texto_Titulo.setText(((ListaEntradaEstrenos)entrada).getTitulopelicula());

                    TextView textoDuracion = (TextView) view.findViewById(R.id.textoduracion);
                    if (textoDuracion != null)
                        textoDuracion.setText(((ListaEntradaEstrenos)entrada).getDuracion());

                    TextView texto_minutos = (TextView) view.findViewById(R.id.textominutos);
                    if (texto_minutos != null)
                        texto_minutos.setText(((ListaEntradaEstrenos)entrada).getMinutos());

                    TextView texto_numero_minutos = (TextView) view.findViewById(R.id.txttiempopel1);
                    if (texto_numero_minutos != null)
                        texto_numero_minutos.setText(((ListaEntradaEstrenos)entrada).getNumerominutos());

                    TextView texto_genero = (TextView) view.findViewById(R.id.textogenero);
                    if (texto_genero != null)
                        texto_genero.setText(((ListaEntradaEstrenos)entrada).getTipogenero());

                    TextView texto_genero1 = (TextView) view.findViewById(R.id.textogenero1);
                    if (texto_genero1 != null)
                        texto_genero1.setText(((ListaEntradaEstrenos)entrada).getGenero1());

                    TextView texto_genero2 = (TextView) view.findViewById(R.id.textogenero2);
                    if (texto_genero2 != null)
                        texto_genero2.setText(((ListaEntradaEstrenos)entrada).getGenero2());
                }

            }
        });


    }
}
