package control;


import java.sql.*;
import negocio.Departamento;

public class Jdbc {
	public int conexion(){
		Connection con;
		int hecho=1;
		try  {			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
			   System.out.println("Conexion exitosa");
	            con.close();
				}
				catch(Exception e){
					System.out.println("Imposible realizar conexion con la BD");
					hecho = 0;
				}
			return hecho;
	}


public int alta_departamento(Departamento d){
	
	Connection con;
		int hecho= 1;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
			PreparedStatement instruccion = con.prepareStatement("INSERT INTO departamento(nombre,clave) value('"+d.getNombre()+"',"+d.getClave()+");"); 
			//Un objeto ResultSet, almacena los datos de resultados de una consulta 
			hecho = instruccion.executeUpdate();
			if (hecho != 0)
              System.out.println("Alta exitosa");
			instruccion.close();
            con.close();
			}
			catch(Exception e){
				System.out.println("Imposible realizar conexion con la BD");
				e.printStackTrace();
				hecho = 0;
			}
		return hecho;
	}
	

public Departamento consulta_departamento_id(String t){
	Connection con;
	Departamento d1 = new Departamento();
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
		Statement instruccion = con.createStatement(); 
		//Un objeto ResultSet, almacena los datos de resultados de una consulta 
		ResultSet tabla = instruccion.executeQuery("SELECT nombre,clave FROM departamento WHERE nombre = '"+t+"'");
		tabla.first();
		d1.nombre = tabla.getString(1);
        d1.clave = tabla.getInt(2);
        instruccion.close();
        con.close();
		}
		catch(Exception e){
			System.out.println("Imposible realizar conexion con la BD");
			e.printStackTrace();
		}
	return d1;
}
}