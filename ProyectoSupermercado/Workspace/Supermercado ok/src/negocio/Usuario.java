package negocio;

	public class Usuario{
		
		private int clave;

		
		public Usuario(){
		}
		
		public Usuario(int c){
			this.clave=c;
		}	
		
		public int getClave(){
			return this.clave;
		}
		
		public void setClave(int clave){
			this.clave=clave;
		
		}

	}
	
