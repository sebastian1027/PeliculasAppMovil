 package movil.unicauca.peliculasappmoviles.Listas;

/**
 * Created by Sebastianl on 20/04/2017.
 */

public class ListaEntradaEstrenos {

    private int numerominutos;
    private String titulopelicula, duracion, minutos, tipogenero, genero1, genero2, Imagen;


    //region getter and setter

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public String getTitulopelicula() {
        return titulopelicula;
    }

    public void setTitulopelicula(String titulopelicula) {
        this.titulopelicula = titulopelicula;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getNumerominutos() {
        return numerominutos;
    }

    public void setNumerominutos(int numerominutos) {
        this.numerominutos = numerominutos;
    }

    public String getMinutos() {
        return minutos;
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }

    public String getTipogenero() {
        return tipogenero;
    }

    public void setTipogenero(String tipogenero) {
        this.tipogenero = tipogenero;
    }

    public String getGenero1() {
        return genero1;
    }

    public void setGenero1(String genero1) {
        this.genero1 = genero1;
    }

    public String getGenero2() {
        return genero2;
    }

    public void setGenero2(String genero2) {
        this.genero2 = genero2;
    }


    //endregion
}
