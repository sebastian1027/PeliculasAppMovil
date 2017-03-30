package movil.unicauca.peliculasappmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static movil.unicauca.peliculasappmoviles.R.id.usuario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView img1;
    EditText ETUser, ETPass;
    Button btnIngresar, btnRegistro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primerview);

        img1 = (ImageView) findViewById(R.id.pelicula);
        ETUser = (EditText) findViewById(usuario);
        ETPass = (EditText) findViewById(R.id.contrasenia);
        btnIngresar = (Button) findViewById(R.id.btnIngreso);
        btnRegistro = (Button) findViewById(R.id.btnRegistrarse);

        btnIngresar.setOnClickListener(this);
        btnRegistro.setOnClickListener(this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String cadena = (String) bundle.get("DATO");
            ETUser.setText(cadena);

            String cadena1 = (String) bundle.get("DATO1");
            ETPass.setText(cadena1);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegistrarse:
                Intent intent = new Intent(this, Registro.class);
                startActivity(intent);
                break;
        }


    }
}
