
package Modelo;


public class Vendedor {

    public static void add(Vendedor vendedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int id_vendedor;
    private String nombre;
    private String apellido;
    private String rut;

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
    
    
  

    public Vendedor(int id_vendedor, String nombre, String apellido, String rut) {
        this.id_vendedor = id_vendedor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
    }

    public Vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }


}
