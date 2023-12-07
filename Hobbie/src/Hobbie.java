public class Hobbie {

    String nombre_hobbie;
    String tipo_hobbie;

    public Hobbie(String nombre_hobbie, String tipo_hobbie) {
        this.nombre_hobbie = nombre_hobbie;
        this.tipo_hobbie = tipo_hobbie;
    }

    public String getNombre_hobbie() {
        return nombre_hobbie;
    }

    public void setNombre_hobbie(String nombre_hobbie) {
        this.nombre_hobbie = nombre_hobbie;
    }

    public String getTipo_hobbie() {
        return tipo_hobbie;
    }

    public void setTipo_hobbie(String tipo_hobbie) {
        this.tipo_hobbie = tipo_hobbie;
    }
    public String Informacion(){
        return nombre_hobbie + " " + tipo_hobbie;
    }
}
