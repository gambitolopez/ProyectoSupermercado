package control;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Verificador {
		Connection con;
		Statement stm;
		ResultSet res;
		int pos=0;
		public Verificador(String usuario){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
		Statement instruccion = (Statement) con.createStatement(); 
		res = instruccion.executeQuery("select name,pass FROM usuario where name='"+usuario+"'");

		}catch(ClassNotFoundException e1){
		JOptionPane.showMessageDialog(null,e1.getMessage() ,"error en el contolador",JOptionPane.ERROR_MESSAGE);
		}
		catch(SQLException e2){
		JOptionPane.showMessageDialog(null,e2.getMessage() ,"error en la base de datos",JOptionPane.ERROR_MESSAGE);
		}
		}
		public void VerificarDatos(String nomPedido, String pasPedido){
		try{while(res.next()){
		String name=res.getString("name");
		String pass=res.getString("pass");
		if(name.equalsIgnoreCase(nomPedido)&& pass.equalsIgnoreCase(pasPedido)){
		pos=res.getRow();
		break;
		}
		}
		}catch(SQLException e2){
		JOptionPane.showMessageDialog(null,e2.getMessage() ,"error en la base de datos",JOptionPane.ERROR_MESSAGE);
		}
		}
		public int ObtenerValor(){
		return pos;
		}

		public static void main(String[] args) {

		
}
		}
	


