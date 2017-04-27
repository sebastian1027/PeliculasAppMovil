package movil.unicauca.peliculasappmoviles;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import movil.unicauca.peliculasappmoviles.databinding.FragmentProximosEstrenosBinding;

public class ProximosEstrenosActivity extends AppCompatActivity {

    FragmentProximosEstrenosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.fragment_proximos_estrenos);
    }


}
