package movil.unicauca.peliculasappmoviles.Tabbed;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import movil.unicauca.peliculasappmoviles.R;


public class EstrenosFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_estrenos, container, false);
    }
}
