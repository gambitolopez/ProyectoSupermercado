package negocio;

	public class Persona {
		
		protected String nombre;
		protected String apellido1;
		protected String apellido2;

		public Persona(){
		
		}
		
		public Persona(String n,String a1,String a2){
			this.nombre=n;
			this.apellido1=a1;
			this.apellido2=a2;
		}

		public String getNombre(){
			return nombre;
		}
		
		public void setNombre(String nombre){
			this.nombre=nombre;
		}
		
		public String getApellido1(){
			return apellido1;
		}
		
		public void setApellido1(String apellido1){
			this.apellido1=apellido1;

		}
		
		public String getApellido2(){
			return apellido2;
		}
		
		public void setApellido2(String apellido2){
			this.apellido2=apellido2;

		}
	}

