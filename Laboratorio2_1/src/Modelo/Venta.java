
package Modelo ;


public class Venta extends Vendedor {
    private int id_venta;
    private String sucursal;
    private int monto;
    private String fecha;

    public Venta(int id_venta, String sucursal, int Monto,String fecha, int id_vendedor, String nombre, String apellido , String rut) {
        super( id_vendedor,  nombre,  apellido,  rut);
        this.id_venta = id_venta;
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
    }

    public Venta(int id_venta, String sucursal, int monto, String fecha, int id_vendedor) {
        super(id_vendedor);  
        this.id_venta = id_venta;
        this.sucursal = sucursal;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.sucursal = Sucursal;
    }

    public int getmonto() {
        return monto;
    }

    public void setmonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

  
    
    
    
    
}
