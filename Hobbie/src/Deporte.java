public class Deporte extends Hobbie{
    String nombre_D;
    String tipo_D;
    public Deporte(String nombre_hobbie, String tipo_hobbie, String nombre_D, String tipo_D) {
        super(nombre_hobbie, tipo_hobbie);
        this.nombre_D = nombre_D;
        this.tipo_D = tipo_D;
    }

    public String getNombre_D() {
        return nombre_D;
    }

    public void setNombre_D(String nombre_D) {
        this.nombre_D = nombre_D;
    }

    public String getTipo_D() {
        return tipo_D;
    }

    public void setTipo_D(String tipo_D) {
        this.tipo_D = tipo_D;
    }
    @Override
    public String Informacion(){
        return nombre_hobbie + " " + tipo_D + " " + nombre_D + " " + tipo_hobbie;
    }
}
