
public class Moto extends Vehiculo {
	

	public Moto(String id, String descripcion) {
		super(id, descripcion);
	}

	public double precio(double dias) {
		
		double precioDiaUnaSemana = 8;
		double precioDiaMasSemanas = 7;
		
		if (this.diaValido(dias) == false) throw new RuntimeException("Meter nº dias valido");
		
		if (dias <= 7){
			return dias * precioDiaUnaSemana;
		} else {
			return dias * precioDiaMasSemanas;
		}
	}

}
