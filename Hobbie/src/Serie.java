public class Serie extends Entretenimiento{
    String nombre_S;

    public Serie(String nombre_hobbie, String tipo_hobbie) {
        super(nombre_hobbie, tipo_hobbie);
    }

    public String getNombre_S() {
        return nombre_S;
    }

    public void setNombre_S(String nombre_S) {
        this.nombre_S = nombre_S;
    }

}
