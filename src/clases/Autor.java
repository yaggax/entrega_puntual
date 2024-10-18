package clases;

public class Autor {

    private String nombre;
    private String apellidos;
    private boolean premio;

    public Autor(String nombre, String apellidos, boolean premio){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.premio = premio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean getPremio(){
        return premio;
    }

    public void setPremio(boolean premio) {
        this.premio = premio;
    }
    
}
