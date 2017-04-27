package movil.unicauca.peliculasappmoviles.Tabbed;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.List;

import movil.unicauca.peliculasappmoviles.Listas.ListaEntradaProximosEstrenos;
import movil.unicauca.peliculasappmoviles.R;
import movil.unicauca.peliculasappmoviles.databinding.FragmentProximosEstrenosBinding;

public class ProximosEstrenosFragment extends RecyclerView.Adapter<ProximosEstrenosFragment.ProximosEstrenosHolder> {

    public interface OnPESelected{
        void OnPE (int position);
    }
    LayoutInflater inflater ;
    List<ListaEntradaProximosEstrenos> datape;
    OnPESelected onPESelected;

    public ProximosEstrenosFragment(LayoutInflater layoutInflater, List<ListaEntradaProximosEstrenos> datape, OnPESelected onPESelected) {
        this.inflater = layoutInflater;
        this.datape = datape;
        this.onPESelected = onPESelected;
    }


    @Override
    public ProximosEstrenosHolder onCreateViewHolder(ViewGroup parent, int viewType) { //Cuando se crea
        View v = inflater.inflate(R.layout.fragment_proximos_estrenos, parent, false);
        return new ProximosEstrenosHolder(v);
    }

    @Override
    public void onBindViewHolder(ProximosEstrenosHolder holder, int position) { //cuando se enlaza y se colocan datos
        ListaEntradaProximosEstrenos lp = datape.get(position);
        //holder.binding.setHandler(lp);
        holder.binding.getRoot().setTag(position);
        holder.binding.setHandler(this);

    }

    @Override
    public int getItemCount() {
        return datape.size();
    }

    public void onClick(View view){
        int pos = (int) view.getTag();
        onPESelected.OnPE(pos);
    }


    //region ViewHolder
    static class ProximosEstrenosHolder extends RecyclerView.ViewHolder{

        FragmentProximosEstrenosBinding binding;

        public ProximosEstrenosHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion

}
