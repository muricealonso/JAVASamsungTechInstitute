
public abstract class Vehiculo {

	private String id ;
	private String descripcion;
	
	public Vehiculo(String id, String descripcion) {
		this.setId(id);
		this.setDescripcion(descripcion);
	}

	
	public void setId(String id) {
		if (id == "") throw new RuntimeException("Introducir id");
		this.id = id;
	}


	public void setDescripcion(String descripcion) {
		if (descripcion == "") throw new RuntimeException("Introducir descripcion");

		this.descripcion = descripcion;
	}
	
	

	public String getId() {
		return id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public boolean diaValido(double dia){
		if (dia >= 0){
			return true;
		}else{
			return false;
		}
	}
	
	public abstract double precio(double dias);
}
