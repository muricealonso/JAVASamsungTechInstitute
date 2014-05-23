package clases;

public class Rectangulo {
	private double base, altura;

	public Rectangulo(double d, double e) {
		this.setBase(d);
		this.setAltura(e);
	}

	public Rectangulo() {
		this(0, 0);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {

		this.base = this.positivo(base);
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = this.positivo(altura);
	}

	private double positivo(double valor) {
		if (valor < 0) {
			return 0;
		} else {
			return valor;
		}
	}

	public double area() {
		return (this.base * this.altura);
	}

	public double hipo() {
		return Math.sqrt((this.base * this.base) + (this.altura * this.altura));
	}

	public double ratioBaseAltura() {
		if (this.base != 0 & this.altura != 0) {
			return this.base / this.altura;
		} else {
			return 0;
		}
	}

	public double perimetro() {
		return ((2 * this.base) + (2 * this.altura));
	}
}
