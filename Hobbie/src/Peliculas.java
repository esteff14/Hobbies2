public class Peliculas extends Entretenimiento{
    int anio_lanzamiento;
    public Peliculas(String nombre_hobbie, String tipo_hobbie) {
        super(nombre_hobbie, tipo_hobbie);
    }

    public int getAnio_lanzamiento() {
        return anio_lanzamiento;
    }

    public void setAño_lanzamiento(int anio_lanzamiento) {
        this.anio_lanzamiento = anio_lanzamiento;
    }

}
