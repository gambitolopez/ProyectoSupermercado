
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import gui.GUI;
import control.Sistema;
import negocio.Departamento;
import negocio.Inventario;

public class Principal {

@SuppressWarnings("unused")
public static void main(String[] args) {
	
	/*
	
		Departamento departamento1=new Departamento();
		             departamento1.setNombre("Frutas y Verduras");
		             departamento1.setClave(1);

		
		System.out.println("Clave:"+departamento1.getClave()+",Nombre:"+departamento1.getNombre());

		
        Departamento departamento2=new Departamento();
                     departamento2.setNombre("Abarrotes");		   
                     departamento2.setClave(2);
		     

		System.out.println("Clave:"+departamento2.getClave()+",Nombre:"+departamento2.getNombre());	
 

        Departamento departamento3=new Departamento();
                     departamento3.setNombre("Ropa");		   
                     departamento3.setClave(3);

		System.out.println("Clave:"+departamento3.getClave()+",Nombre:"+departamento3.getNombre());	


        Departamento departamento4=new Departamento();
                     departamento4.setNombre("Electronica");		   
                     departamento4.setClave(4);

		System.out.println("Clave:"+departamento4.getClave()+",Nombre:"+departamento4.getNombre());	


        Departamento departamento5=new Departamento();
                     departamento5.setNombre("Farmacia");		   
                     departamento5.setClave(5);

		System.out.println("Clave:"+departamento5.getClave()+",Nombre:"+departamento5.getNombre());	


        Departamento departamento6=new Departamento();
                     departamento6.setNombre("Jugueteria");		   
                     departamento6.setClave(6);

		System.out.println("Clave:"+departamento6.getClave()+",Nombre:"+departamento6.getNombre());	



        Departamento departamento7=new Departamento();
                     departamento7.setNombre("Carnes Frias");		   
                     departamento7.setClave(7);

		System.out.println("Clave:"+departamento7.getClave()+",Nombre:"+departamento7.getNombre());	

	    Inventario inventario1=new Inventario();
	    	       inventario1.setNombre("Ropa Infantil");
	    	       inventario1.setCantidad(5);
	    	       inventario1.setUbicacion("R1");
	    	       inventario1.setClave(1);
	    	       inventario1.setDepartamento(departamento3);

      	System.out.println("Nombre:"+inventario1.getNombre()+",Cantidad:"+inventario1.getCantidad()+",Ubicacion:"+inventario1.getUbicacion()+",Clave:"+inventario1.getClave()+",Departamento:"+inventario1.getDepartamento().getNombre());


		Inventario inventario2=new Inventario();
	    	       inventario2.setNombre("Ropa para adulto");
	    	       inventario2.setCantidad(5);
	    	       inventario2.setUbicacion("R2");
	    	       inventario2.setClave(2);
	    	       inventario2.setDepartamento(departamento3);

      	System.out.println("Nombre:"+inventario2.getNombre()+",Cantidad:"+inventario2.getCantidad()+",Ubicacion:"+inventario2.getUbicacion()+",Clave:"+inventario2.getClave()+",Departamento:"+inventario2.getDepartamento().getNombre());


		Inventario inventario3=new Inventario();
	               inventario3.setNombre("Alimento para mascota");
	               inventario3.setCantidad(5);
	   	           inventario3.setUbicacion("A3");
	   	           inventario3.setClave(3);
	   	           inventario3.setDepartamento(departamento2);

      	System.out.println("Nombre:"+inventario3.getNombre()+",Cantidad:"+inventario3.getCantidad()+",Ubicacion:"+inventario3.getUbicacion()+",Clave:"+inventario3.getClave()+",Departamento:"+inventario3.getDepartamento().getNombre());


		Inventario inventario4=new Inventario();
	               inventario4.setNombre("Cereales");
	               inventario4.setCantidad(5);
	               inventario4.setUbicacion("A4");
	               inventario4.setClave(4);
	               inventario4.setDepartamento(departamento2);

      	System.out.println("Nombre:"+inventario4.getNombre()+",Cantidad:"+inventario4.getCantidad()+",Ubicacion:"+inventario4.getUbicacion()+",Clave:"+inventario4.getClave()+",Departamento:"+inventario4.getDepartamento().getNombre());


		Inventario inventario5=new Inventario();
	               inventario5.setNombre("Cosmeticos");
	               inventario5.setCantidad(5);
	               inventario5.setUbicacion("F5");
	               inventario5.setClave(5);
	               inventario5.setDepartamento(departamento5);

      	System.out.println("Nombre:"+inventario5.getNombre()+",Cantidad:"+inventario5.getCantidad()+",Ubicacion:"+inventario5.getUbicacion()+",Clave:"+inventario5.getClave()+",Departamento:"+inventario5.getDepartamento().getNombre());


		Inventario inventario6=new Inventario();
	               inventario6.setNombre("Computadora");
	               inventario6.setCantidad(5);
	               inventario6.setUbicacion("E6");
	               inventario6.setClave(6);
	               inventario6.setDepartamento(departamento4);

      	System.out.println("Nombre:"+inventario6.getNombre()+",Cantidad:"+inventario6.getCantidad()+",Ubicacion:"+inventario6.getUbicacion()+",Clave:"+inventario6.getClave()+",Departamento:"+inventario6.getDepartamento().getNombre());


		Inventario inventario7=new Inventario();
	               inventario7.setNombre("Reproductores");
	               inventario7.setCantidad(5);
	               inventario7.setUbicacion("E7");
	               inventario7.setClave(7);
	               inventario7.setDepartamento(departamento4);

      	System.out.println("Nombre:"+inventario7.getNombre()+",Cantidad:"+inventario7.getCantidad()+",Ubicacion:"+inventario7.getUbicacion()+",Clave:"+inventario7.getClave()+",Departamento:"+inventario7.getDepartamento().getNombre());


		Inventario inventario8=new Inventario();
	               inventario8.setNombre("Cocteles");
	               inventario8.setCantidad(5);
	               inventario8.setUbicacion("FV8");
	               inventario8.setClave(8);
	    	       inventario8.setDepartamento(departamento1);

      	System.out.println("Nombre:"+inventario8.getNombre()+",Cantidad:"+inventario8.getCantidad()+",Ubicacion:"+inventario8.getUbicacion()+",Clave:"+inventario8.getClave()+",Departamento:"+inventario8.getDepartamento().getNombre());


		
        Inventario inventario9=new Inventario();
	               inventario9.setNombre("Llantas para carros");
	               inventario9.setCantidad(5);
	               inventario9.setUbicacion("E9");
	               inventario9.setClave(9);
	               inventario9.setDepartamento(departamento4);

      	System.out.println("Nombre:"+inventario9.getNombre()+",Cantidad:"+inventario9.getCantidad()+",Ubicacion:"+inventario9.getUbicacion()+",Clave:"+inventario9.getClave()+",Departamento:"+inventario9.getDepartamento().getNombre());


		Inventario inventario10=new Inventario();
	               inventario10.setNombre("Salvabidas");
	               inventario10.setCantidad(5);
	               inventario10.setUbicacion("J10");
	               inventario10.setClave(10);
	               inventario10.setDepartamento(departamento6);

      	System.out.println("Nombre:"+inventario10.getNombre()+",Cantidad:"+inventario10.getCantidad()+",Ubicacion:"+inventario10.getUbicacion()+",Clave:"+inventario10.getClave()+",Departamento:"+inventario10.getDepartamento().getNombre());


		Inventario inventario11=new Inventario();
	               inventario11.setNombre("Lociones");
	               inventario11.setCantidad(5);
	               inventario11.setUbicacion("F5");
	               inventario11.setClave(11);
	               inventario11.setDepartamento(departamento5);

      	System.out.println("Nombre:"+inventario11.getNombre()+",Cantidad:"+inventario11.getCantidad()+",Ubicacion:"+inventario11.getUbicacion()+",Clave:"+inventario11.getClave()+",Departamento:"+inventario11.getDepartamento().getNombre());


		Inventario inventario12=new Inventario();
	               inventario12.setNombre("Mnzana roja, verde");
	               inventario12.setCantidad(5);
	               inventario12.setUbicacion("FV12");
	               inventario12.setClave(12);
	               inventario12.setDepartamento(departamento1);

      	System.out.println("Nombre:"+inventario12.getNombre()+",Cantidad:"+inventario12.getCantidad()+",Ubicacion:"+inventario12.getUbicacion()+",Clave:"+inventario12.getClave()+",Departamento:"+inventario12.getDepartamento().getNombre());


        Inventario inventario13=new Inventario();
	               inventario13.setNombre("Pechuga de pollo");
	               inventario13.setCantidad(5);
	               inventario13.setUbicacion("Cf13");
	               inventario13.setClave(13);
	               inventario13.setDepartamento(departamento7);
      	System.out.println("Nombre:"+inventario13.getNombre()+",Cantidad:"+inventario13.getCantidad()+",Ubicacion:"+inventario13.getUbicacion()+",Clave:"+inventario13.getClave()+",Departamento:"+inventario13.getDepartamento().getNombre());


        Inventario inventario14=new Inventario();
	               inventario14.setNombre("Pescados y mariscos");
	               inventario14.setCantidad(5);
	               inventario14.setUbicacion("A14");
	               inventario14.setClave(14);
	               inventario14.setDepartamento(departamento2);

      	System.out.println("Nombre:"+inventario14.getNombre()+",Cantidad:"+inventario14.getCantidad()+",Ubicacion:"+inventario14.getUbicacion()+",Clave:"+inventario14.getClave()+",Departamento:"+inventario14.getDepartamento().getNombre());


        Inventario inventario15=new Inventario();
	               inventario15.setNombre("Papas Fritas");
	               inventario15.setCantidad(5);
	               inventario15.setUbicacion("A15");
	               inventario15.setClave(15);
	               inventario15.setDepartamento(departamento2);

      	System.out.println("Nombre:"+inventario15.getNombre()+",Cantidad:"+inventario15.getCantidad()+",Ubicacion:"+inventario15.getUbicacion()+",Clave:"+inventario15.getClave()+",Departamento:"+inventario15.getDepartamento().getNombre());


        Inventario inventario16=new Inventario();
	               inventario16.setNombre("Dulces");
	               inventario16.setCantidad(5);
	               inventario16.setUbicacion("A16");
	               inventario16.setClave(16);
	               inventario16.setDepartamento(departamento4);
      	System.out.println("Nombre:"+inventario16.getNombre()+",Cantidad:"+inventario16.getCantidad()+",Ubicacion:"+inventario16.getUbicacion()+",Clave:"+inventario16.getClave()+",Departamento:"+inventario16.getDepartamento().getNombre());


        Inventario inventario17=new Inventario();
	               inventario17.setNombre("Lavadoras");
	               inventario17.setCantidad(5);
	               inventario17.setUbicacion("E17");
	               inventario17.setClave(17);
	               inventario17.setDepartamento(departamento4);
   	    System.out.println("Nombre:"+inventario17.getNombre()+",Cantidad:"+inventario17.getCantidad()+",Ubicacion:"+inventario17.getUbicacion()+",Clave:"+inventario17.getClave()+",Departamento:"+inventario17.getDepartamento().getNombre());


        Inventario inventario18=new Inventario();
	               inventario18.setNombre("Televisiones y estereos");
	               inventario18.setCantidad(5);
	               inventario18.setUbicacion("E18");
	               inventario18.setClave(18);
	               inventario18.setDepartamento(departamento4);
   	    System.out.println("Nombre:"+inventario18.getNombre()+",Cantidad:"+inventario18.getCantidad()+",Ubicacion:"+inventario18.getUbicacion()+",Clave:"+inventario18.getClave()+",Departamento:"+inventario18.getDepartamento().getNombre());


        Inventario inventario19=new Inventario();
	               inventario19.setNombre("Jamon de pavo");
	               inventario19.setCantidad(5);
	               inventario19.setUbicacion("CF19");
	               inventario19.setClave(19);
	               inventario19.setDepartamento(departamento7);
    	System.out.println("Nombre:"+inventario19.getNombre()+",Cantidad:"+inventario19.getCantidad()+",Ubicacion:"+inventario19.getUbicacion()+",Clave:"+inventario19.getClave()+",Departamento:"+inventario19.getDepartamento().getNombre());



        Inventario inventario20=new Inventario();
	               inventario20.setNombre("Balones de basquet, bolivol, futbol");
	               inventario20.setCantidad(5);
	               inventario20.setUbicacion("J20");
	               inventario20.setClave(17);
	               inventario20.setDepartamento(departamento6);
   	    System.out.println("Nombre:"+inventario20.getNombre()+",Cantidad:"+inventario20.getCantidad()+",Ubicacion:"+inventario20.getUbicacion()+",Clave:"+inventario20.getClave()+",Departamento:"+inventario20.getDepartamento().getNombre());

   	    
   	  List <Inventario> lista=new ArrayList <Inventario>();
      lista.add(inventario1);
      lista.add(inventario2);
      lista.add(inventario3);
      lista.add(inventario4);
      lista.add(inventario5);
      lista.add(inventario6);
      lista.add(inventario7);
      lista.add(inventario8);
      lista.add(inventario9);
      lista.add(inventario10);
      lista.add(inventario11);
      lista.add(inventario12);
      lista.add(inventario13);
      lista.add(inventario14);
      lista.add(inventario15);
      lista.add(inventario16);
      lista.add(inventario17);
      lista.add(inventario18);
      lista.add(inventario19);
      lista.add(inventario20);
      
	 

      Sistema sistema=new Sistema(lista);

      System.out.println("       "+"Aqui empieza la lista"+"       ");
      
        for (Iterator<Inventario>it=lista.iterator();it.hasNext();){
        	Inventario i=it.next();
      	 System.out.println("Nombre:"+i.getNombre()+",Cantidad:"+i.getCantidad()+",Ubicacion:"+i.getUbicacion()+",Clave:"+i.getClave()+",Departamento:"+i.getDepartamento().getNombre());     	 
      List<Inventario>listaNombre=sistema.buscar("Controladores Programables");
        for (Iterator<Inventario>it1=lista.iterator();it.hasNext();){
        	Inventario i1=it.next();
 	    System.out.println("Nombre:"+i.getNombre()+",Cantidad:"+i.getCantidad()+",Ubicacion:"+i.getUbicacion()+",Clave:"+i.getClave()+",Departamento:"+i.getDepartamento().getNombre());
 	
 	    List<Inventario>listaDepartamento=sistema.buscar(departamento5);
   	  for (Iterator<Inventario>it2=lista.iterator();it2.hasNext();){
   		Inventario i2=it2.next();
   		System.out.println("Nombre:"+i.getNombre()+",Cantidad:"+i.getCantidad()+",Ubicacion:"+i.getUbicacion()+",Clave:"+i.getClave()+",Departamento:"+i.getDepartamento().getNombre());
   	  			}
   	 /
        	}
        
        }
       GUI grafico=new GUI();
        grafico.setSistema(sistema);
        grafico.inicializar();*/ 
	}
}


	
