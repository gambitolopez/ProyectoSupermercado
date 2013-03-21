package control;


import negocio.Departamento;
import negocio.Inventario;
import negocio.Caja;
import negocio.Devolucion;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Sistema implements ISistema{
	
	public Sistema (List <Inventario> lista){

        this.lista=lista;

	}
	private List<Inventario> lista;
	public List<Inventario> buscar (String nombre){
		List <Inventario> aux=new ArrayList <Inventario>();

		for (Iterator<Inventario> it=lista.iterator(); it.hasNext();){


		Inventario i=it.next();

		if(i.getNombre().equals (nombre))

		          aux.add(i);

		}
	
		return aux;

}


public List<Inventario>buscar (Departamento departamento){

	List <Inventario> aux=new ArrayList <Inventario>();
		System.out.println(lista);
		for (Iterator<Inventario> it=lista.iterator(); it.hasNext();){


		Inventario i=it.next();

		if(i.getDepartamento().getClave()==departamento.getClave())

		          aux.add(i);
		}

		return aux;
}
public void registrarPrestamo (Caja caja){

}

public void registrarDevolucion (Devolucion devolucion){
	
	File archivo=new File("C:\\devolucion.txt");
	try{
	PrintWriter out=new PrintWriter(new FileWriter (archivo));
	out.println(devolucion.toString());
	out.close();
}
	catch (IOException ioe){
	System.out.println("Ocurrio un error al registrar el prestamo");
	}

}




}