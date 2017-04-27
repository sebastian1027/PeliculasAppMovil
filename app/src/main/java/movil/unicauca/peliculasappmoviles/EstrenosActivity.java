package movil.unicauca.peliculasappmoviles;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import movil.unicauca.peliculasappmoviles.Tabbed.EstrenosFragment;
import movil.unicauca.peliculasappmoviles.databinding.ActivityEstrenosBinding;
import movil.unicauca.peliculasappmoviles.util.Data;

public class EstrenosActivity extends AppCompatActivity implements EstrenosFragment.OnEstrenoSelected, DrawerLayout.DrawerListener, NavigationView.OnNavigationItemSelectedListener {

    ActivityEstrenosBinding binding;
    EstrenosFragment estrenosFragment;

    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_estrenos);

        estrenosFragment = new EstrenosFragment(getLayoutInflater(), Data.getData(), this);
        binding.list.setAdapter(estrenosFragment);
        binding.list.setLayoutManager(new LinearLayoutManager(this));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toggle = new ActionBarDrawerToggle(this, binding.drawer, R.string.open,  R.string.close);

        binding.drawer.addDrawerListener(this);
        binding.nav.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onEstreno(int position) {
        Toast.makeText(this, "Estreno "+ position, Toast.LENGTH_SHORT).show();

    }


    //region toggle
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onDrawerSlide(View drawerView, float slideOffset) {
         toggle.onDrawerSlide(drawerView, slideOffset);
    }

    @Override
    public void onDrawerOpened(View drawerView) {
        toggle.onDrawerOpened(drawerView);

    }

    @Override
    public void onDrawerClosed(View drawerView) {
        toggle.onDrawerClosed(drawerView);
    }

    @Override
    public void onDrawerStateChanged(int newState) {
        toggle.onDrawerStateChanged(newState);

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
