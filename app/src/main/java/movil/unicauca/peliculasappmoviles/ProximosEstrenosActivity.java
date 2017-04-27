package movil.unicauca.peliculasappmoviles;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import movil.unicauca.peliculasappmoviles.Tabbed.ProximosEstrenosFragment;
import movil.unicauca.peliculasappmoviles.databinding.ActivityEstrenosBinding;
import movil.unicauca.peliculasappmoviles.databinding.FragmentProximosEstrenosBinding;
import movil.unicauca.peliculasappmoviles.util.Data;
import movil.unicauca.peliculasappmoviles.util.Datape;

public class ProximosEstrenosActivity extends AppCompatActivity implements ProximosEstrenosFragment.OnPESelected, DrawerLayout.DrawerListener, NavigationView.OnNavigationItemSelectedListener {

    ActivityEstrenosBinding binding;
    ProximosEstrenosFragment adapter;

    ActionBarDrawerToggle toogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_estrenos);

        adapter = new ProximosEstrenosFragment(getLayoutInflater(), Datape.getDatape(), this);
        binding.list.setAdapter(adapter);
        binding.list.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toogle = new ActionBarDrawerToggle(this, binding.drawer, R.string.open, R.string.close);

        binding.drawer.addDrawerListener(this);
        binding.nav.setNavigationItemSelectedListener(this);

    }

    @Override
    public void OnPE(int position) {
        Toast.makeText(this, "Proximos Estreno " +position, Toast.LENGTH_SHORT).show();
    }

    //region Toggle
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toogle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toogle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
        toogle.onDrawerSlide(drawerView, slideOffset);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        toogle.onDrawerOpened(drawerView);
    }

    @Override
    public void onDrawerClosed(View drawerView) {
        onDrawerClosed(drawerView);
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        toogle.onDrawerStateChanged(newState);
    }


    //endregion

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        binding.drawer.closeDrawers();
        switch (item.getItemId()){
            case R.id.nav_peliculas:
                Toast.makeText(this, "peliculas", Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_calificarpeliculas:
                Toast.makeText(this, R.string.calificarpeliculas, Toast.LENGTH_SHORT).show();
                break;

            case  R.id.nav_recordar:
                Toast.makeText(this, R.string.recordar, Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_horarios:
                Toast.makeText(this, R.string.horarios, Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_mejorescalificadas:
                Toast.makeText(this, R.string.mejorescalificadas, Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_precios:
                Toast.makeText(this, R.string.precios, Toast.LENGTH_SHORT).show();
                break;

            case R.id.nav_salir:
                Toast.makeText(this, R.string.salir, Toast.LENGTH_SHORT).show();
                break;

        }
        return false;
    }
}
