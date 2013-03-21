package control;

	
	import negocio.Inventario;
	import negocio.Departamento;
	import negocio.Devolucion;



	import java.util.*;


	public interface ISistema {
		
	List<Inventario> buscar (String nombre);

	List <Inventario> buscar (Departamento departamento);
		
		
	void registrarDevolucion (Devolucion devolucion);	
		
			

}
