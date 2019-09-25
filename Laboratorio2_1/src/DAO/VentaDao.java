
package DAO;


import Modelo.Venta;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class VentaDao {
     Conexion con;

    public VentaDao() {
        this.con = new Conexion();
    }

    public ArrayList<Venta> getVenta() {

        ArrayList<Venta> Venta= new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM venta ";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_venta = resultados.getInt("id_venta");
                String sucursal = resultados.getString("sucursal");
                int monto = resultados.getInt("monto");
                String fecha = resultados.getString("fecha");
                int id_vendedor = resultados.getInt("id_venta");

                Venta.add(new Venta(id_venta,sucursal,monto,fecha,id_vendedor));
            }
            accesoBD.close();
            return Venta;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }

    }

    public Venta getPersona(int id) {

        Venta p = null;
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM venta WHERE ID = " + id + "";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {

                     int id_venta = resultados.getInt("id_venta");
                String sucursal = resultados.getString("sucursal");
                int monto = resultados.getInt("monto");
                String fecha = resultados.getString("fecha");
                int id_vendedor = resultados.getInt("id_venta");

               
                p = new Venta(id_venta,sucursal,monto,fecha,id_vendedor);

            }
            accesoBD.close();
            return p;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }
    }
}
