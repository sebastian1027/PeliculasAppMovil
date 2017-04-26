package movil.unicauca.peliculasappmoviles;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

import movil.unicauca.peliculasappmoviles.Listas.ListaEntradaEstrenos;
import movil.unicauca.peliculasappmoviles.Tabbed.TabbedActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView img1;
    private EditText ETUser, ETPass;
    private Button btnIngresar, btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primerview);


        //region Recuperar Views
        img1 = (ImageView) findViewById(R.id.pelicula);
        ETUser = (EditText) findViewById(R.id.usuario);
        ETPass = (EditText) findViewById(R.id.contrasenia);
        btnIngresar = (Button) findViewById(R.id.btnIngreso);
        btnRegistro = (Button) findViewById(R.id.btnRegistrarse);
        //endregion

        //region Eventos
        btnIngresar.setOnClickListener(this);
        btnRegistro.setOnClickListener(this);
        //endregion

        //region Cargamos Eventos Previos
        if (savedInstanceState != null){
            ETUser.setText(savedInstanceState.getString("Usuario"));
            ETPass.setText(savedInstanceState.getString("Contrasenia"));
        }
        //endregion

        //region Permite que los campos Usuario y Contraseña se completen en el primer view
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null){
            String cadena = (String) bundle.get("DATO");
            ETUser.setText(cadena);

            String cadena1 = (String) bundle.get("DATO1");
            ETPass.setText(cadena1);
        }
        //endregion

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("Usuario", ETUser.getText().toString());
        outState.putString("Contrasenia", ETPass.getText().toString());
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View v) {
        //region Al pulsar el Boton cambia de Activity
        switch (v.getId()){
            case R.id.btnRegistrarse:
                Intent intent = new Intent(this, RegistroActivity.class);
                startActivity(intent);
                break;
            case R.id.btnIngreso:
                Intent intent1 = new Intent(this, TabbedActivity.class);
                startActivity(intent1);
                break;
        }
        //endregion

    }
}
//region no sirve
    /*private ListView lista;

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
*/
//endregion