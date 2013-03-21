package negocio;

	public class Inventario{

		private String nombre;
		private Departamento departamento;
		private int cantidad;
		private String ubicacion;
		private int clave;
		private float efectivo;

		public Inventario(){
		}
		
		public Inventario(String n,Departamento d,int c,String u,int cl,float ef){
			this.nombre=n;
			this.departamento=d;
			this.cantidad=c;
			this.ubicacion=u;
			this.clave=cl;
			this.efectivo=ef;
		}
		
		public String getNombre(){
			return this.nombre;
		}
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		public Departamento getDepartamento(){
			return this.departamento;
		}
		public void setDepartamento(Departamento departamento){
			this.departamento=departamento;
		}
		public int getCantidad(){
			return this.cantidad;
		}
		public void setCantidad(int cantidad){
			this.cantidad=cantidad;
		}
		public String getUbicacion(){
			return this.ubicacion;
		}
		public void setUbicacion(String ubicacion){
			this.ubicacion=ubicacion;
		}
		public int getClave(){
			return this.clave;
		}
		public void setClave(int clave){
			this.clave=clave;
		}
		public float getEfectivo(){
			return this.efectivo;
		}
		public void setEfectivo(float efectivo){
			this.efectivo=efectivo;
		}
		
	}
		
		
