package clases;

public class ColeccionDecimales {
	private double[] coleccion;

	public ColeccionDecimales(int tamaño) {
		this.setColeccion( new double[tamaño]);
	}
	public ColeccionDecimales(){
		this(0);
	}

	public double[] getColeccion() {
		return coleccion;
	}

	public void setColeccion(double[] coleccion) {
		this.coleccion = coleccion;
	}
	
	public void añadirElementPos (double nuevo, int posicion){
		 double [] nuevaColeccion = new double[this.coleccion.length + 1];
		 int i ;
		 
		 for ( i = 0 ; (i < this.coleccion.length) & (i != posicion); i++) {
			 nuevaColeccion[i] = this.coleccion[i];
		 }
		 nuevaColeccion[posicion] = nuevo;
		 i++;
		 
		 for ( i = 0  ; (i < this.coleccion.length); i++) {
			 nuevaColeccion[i] = this.coleccion[i];
		 }
		 
	}
		 
		 
	
	public void sobrescElemento(double doble, int posicion){
		
		if (posicion < this.coleccion.length){
		this.coleccion[posicion] = doble;
		}
	}
		

	public double mayor() {

		double miMayor = this.coleccion[0];
		int i = 0;

		while (i < this.coleccion.length) {

			if (this.coleccion[i] > miMayor) {
				miMayor = this.coleccion[i];
			}
			i++;
		}
		return miMayor;
	}

	public double menor() {
		double miMenor = this.coleccion[0];

		for (int i = 0; i < this.coleccion.length; i++) {

			if (this.coleccion[i] < miMenor) {
				miMenor = this.coleccion[i];
			}

		}

		return miMenor;

	}

	public double media(){
		double sumatorio = 0.0;
		for (double doble: this.coleccion){
			sumatorio = sumatorio + doble;
		}
	return sumatorio / this.coleccion.length;
	
	}
}
