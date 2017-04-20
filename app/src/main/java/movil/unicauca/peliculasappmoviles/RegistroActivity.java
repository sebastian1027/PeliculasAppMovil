package movil.unicauca.peliculasappmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtNombre, edtApellido, edtEdad, edtUsuario, edtContrasenia;
    Button butRegistrarse;
    ImageView imgGoogleMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        //region Recuperar Views
        edtNombre = (EditText) findViewById(R.id.etNombre);
        edtApellido = (EditText) findViewById(R.id.etApellido);
        edtEdad = (EditText) findViewById(R.id.etEdad);
        edtUsuario = (EditText) findViewById(R.id.etUsuario);
        edtContrasenia = (EditText) findViewById(R.id.etContrasenia);

        butRegistrarse = (Button) findViewById(R.id.btnRegistrate);
        imgGoogleMas = (ImageView) findViewById(R.id.imvGoogleMas);
        //endregion

        //region Eventos
        butRegistrarse.setOnClickListener(this);
        //endregion
    }


    @Override
    public void onClick(View v) {

        //region Envia los campos llenos a Usuario y contraseña
        switch (v.getId()) {
            case R.id.btnRegistrate:
                Intent intent = new Intent(this, MainActivity.class);
                String dato = edtUsuario.getText().toString();
                intent.putExtra("DATO", dato);

                String dato1 = edtContrasenia.getText().toString();
                intent.putExtra("DATO1", dato1);
                startActivity(intent);
                break;
        }
        //endregion

    }
}
