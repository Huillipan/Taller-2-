
package DAO;

import Modelo.Vendedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class VendedorDao {
       Conexion con;

    public VendedorDao() {
        this.con = new Conexion();
    }

    public ArrayList<Vendedor> getVendedor() {

        ArrayList<Vendedor> Vendedor= new ArrayList<>();
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM vendedor ";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {
                int id_vendedor = resultados.getInt("id_vendedor");
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");

                Vendedor.add(new Vendedor(id_vendedor,nombre,apellido,rut));
            }
            accesoBD.close();
            return Vendedor;
        } catch (Exception e) {
            System.out.println();
            System.out.println("Error al obtener");
            e.printStackTrace();
            return null;
        }

    }

    public Vendedor getPersona(int id) {

        Vendedor p = null;
        Connection accesoBD = con.getConexion();

        try {
            String sql = "SELECT * FROM vendedor WHERE ID = " + id + "";

            //System.out.println(sql);
            Statement st = accesoBD.createStatement();
            ResultSet resultados = st.executeQuery(sql);

            while (resultados.next()) {

                int id_vendedor = resultados.getInt("id_vendedor");
                String nombre = resultados.getString("nombre");
                String apellido = resultados.getString("apellido");
                String rut = resultados.getString("rut");
                p = new Vendedor(id_vendedor,nombre,apellido,rut);

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
