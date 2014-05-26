
public class Coche extends Vehiculo {


	private Categoria cat;
	
	public enum Categoria {
			A(10),
			B(15),
			C(20);
		public final double precioHora;
		private Categoria(double precio){
			this.precioHora = precio;
		} 
	}

	public Coche(String id, String descripcion, Categoria cat) {
		super(id, descripcion);
		this.setCat(cat);
	}

	

	public void setCat(Categoria cat) {
		this.cat = cat;
	}



	public double precio(double dias) {
		
		if (this.diaValido(dias) == false) throw new RuntimeException("Meter nº dias valido");
		
		if (dias <= 3){
			return dias * this.cat.precioHora;
		}else if (dias > 3 && dias <= 7) {
			return dias * this.cat.precioHora * 0.8;
		}else{
			return dias* this.cat.precioHora * 0.5;
		} 
	}

}

