package movil.unicauca.peliculasappmoviles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;



/**
 * Created by Sebastianl on 20/04/2017.
 */

public abstract class ListaAdaptadorEstrenos extends BaseAdapter {

    private ArrayList<?> entradas;
    private int R_Layout_IdView;
    private Context context;

    public ListaAdaptadorEstrenos(ArrayList<?> entradas, int r_Layout_IdView, Context context) {
        this.entradas = entradas;
        R_Layout_IdView = r_Layout_IdView;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView != null) {
            LayoutInflater vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = vi.inflate(R_Layout_IdView, null);
        }
        onEntrada (entradas.get(position), convertView);
        return convertView;

    }

    @Override
    public int getCount() {
        return entradas.size();
    }


    @Override
    public Object getItem(int position) {
        return entradas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public abstract void onEntrada (Object entrada, View view);
}
