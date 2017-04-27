package movil.unicauca.peliculasappmoviles.Tabbed;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import movil.unicauca.peliculasappmoviles.Listas.ListaEntradaEstrenos;
import movil.unicauca.peliculasappmoviles.R;
import movil.unicauca.peliculasappmoviles.databinding.FragmentEstrenosBinding;

public class EstrenosFragment extends  RecyclerView.Adapter<EstrenosFragment.EstrenoHolder>{

    public interface OnEstrenoSelected{
        void onEstreno(int position);

    }

    LayoutInflater inflater;
    List<ListaEntradaEstrenos> data;
    OnEstrenoSelected onEstrenoSelected;
    //32:30

    //region Constructor
    public EstrenosFragment(LayoutInflater inflater, List<ListaEntradaEstrenos> data, OnEstrenoSelected onEstrenoSelected) {
        this.inflater = inflater;
        this.data = data;
        this.onEstrenoSelected = onEstrenoSelected;
    }
    //endregion



    //region Metodos
    @Override
    public EstrenoHolder onCreateViewHolder(ViewGroup parent, int viewType) { //se crea
        View v = inflater.inflate(R.layout.fragment_estrenos, parent, false);
        return new EstrenoHolder(v);
    }

    @Override
    public void onBindViewHolder(EstrenoHolder holder, int position) { //Se enlaza
        ListaEntradaEstrenos l = data.get(position);
        holder.binding.setEstrenos(l);
        holder.binding.getRoot().setTag(position);
        holder.binding.setHandler(this);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void onClick(View view){
        int pos = (int) view.getTag();
        onEstrenoSelected.onEstreno(pos);
    }
    //endregion

    //region ViewHolder
    static class EstrenoHolder extends RecyclerView.ViewHolder{

        FragmentEstrenosBinding binding;
        public EstrenoHolder(View itemView) {
            super(itemView);
            binding = DataBindingUtil.bind(itemView);
        }
    }
    //endregion


}