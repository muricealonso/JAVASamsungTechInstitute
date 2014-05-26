
public class Bici extends Vehiculo {

	public Bici(String id, String descripcion) {
		super(id, descripcion);
	
	}


	public double precio(double dias) {
		
		double precioDias2Dias = 3;
		double precioDiaMasDias = 2;
		
		if (this.diaValido(dias)== false) throw new RuntimeException();
		
		if(dias <= 3){
			return dias * precioDias2Dias;
		}else{
			return ((dias-3)*precioDiaMasDias) + 9;
		}
		
	}

}
