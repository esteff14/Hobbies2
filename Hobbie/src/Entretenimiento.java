public class Entretenimiento extends Hobbie{

    String nombre_E;
    String duracion;
    String genero;
    public Entretenimiento(String nombre_hobbie, String tipo_hobbie) {
        super(nombre_hobbie, tipo_hobbie);
    }

    public String getNombre_E() {
        return nombre_E;
    }

    public void setNombre_E(String nombre_E) {
        this.nombre_E = nombre_E;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void seleccion(){

    }


}
