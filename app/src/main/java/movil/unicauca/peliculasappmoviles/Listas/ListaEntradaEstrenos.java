package movil.unicauca.peliculasappmoviles.Listas;

/**
 * Created by Sebastianl on 20/04/2017.
 */

public class ListaEntradaEstrenos {

    private int idImagen;
    private String titulopelicula;
    private String duracion;
    private int numerominutos;
    private String minutos;
    private String tipogenero;
    private String genero1;
    private String genero2;


    //region Constructor
    public ListaEntradaEstrenos(int idImagen, String titulopelicula,
                                String duracion, int numerominutos, String minutos,
                                String tipogenero, String genero1, String genero2) {
        this.idImagen = idImagen;
        this.titulopelicula = titulopelicula;
        this.duracion = duracion;
        this.numerominutos = numerominutos;
        this.minutos = minutos;
        this.tipogenero = tipogenero;
        this.genero1 = genero1;
        this.genero2 = genero2;

    }
    //endregion

    //region getter
    public int getIdImagen() {
        return idImagen;
    }

    public String getTitulopelicula() {
        return titulopelicula;
    }

    public String getDuracion() {
        return duracion;
    }

    public int getNumerominutos() {
        return numerominutos;
    }

    public String getMinutos() {
        return minutos;
    }

    public String getTipogenero() {
        return tipogenero;
    }

    public String getGenero1() {
        return genero1;
    }

    public String getGenero2() {
        return genero2;
    }


    //endregion
}
