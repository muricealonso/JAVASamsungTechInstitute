package clases;

public class Intervalo {
	private int min, max;
	
	public Intervalo (int min, int max){
		setMin(min);
		setMax(max);
		
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	public int longitud(){
		return this.max - this.min;
	}
}
