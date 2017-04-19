package movil.unicauca.peliculasappmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import movil.unicauca.peliculasappmoviles.Tabbed.TabbedActivity;

import static movil.unicauca.peliculasappmoviles.R.id.etUsuario;
import static movil.unicauca.peliculasappmoviles.R.id.usuario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1;
    EditText ETUser, ETPass;
    Button btnIngresar, btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primerview);


        //region Recuperar Views
        img1 = (ImageView) findViewById(R.id.pelicula);
        ETUser = (EditText) findViewById(usuario);
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
                Intent intent = new Intent(this, Registro.class);
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
