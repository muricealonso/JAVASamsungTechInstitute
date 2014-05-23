package clases;

public class PruebaRectangulo {
	public void prueba() {
		Rectangulo rectangulo1, rectangulo2, rectangulo3;

		rectangulo1 = new Rectangulo(2, 1);
		rectangulo2 = new Rectangulo(2.1, 1.2);
		rectangulo3 = new Rectangulo();

		if (rectangulo1.getBase() == 2 & rectangulo1.getAltura() == 1) {
			System.out.println("Prueba constructor base y altura : CORRECTA");
		} else {
			System.out.println("Prueba constructor base y altura : ERROR");
		}

		if (rectangulo2.getBase() == 2.1 & rectangulo2.getAltura() == 1.2) {
			System.out.println("Prueba constructor base y altura : CORRECTA");
		} else {
			System.out.println("Prueba constructor base y altura : ERROR");
		}

		if (rectangulo3.getBase() == 0 & rectangulo3.getAltura() == 0) {
			System.out.println("Prueba constructor sin parametros : CORRECTA");
		} else {
			System.out.println("Prueba constructor sin parametros : ERROR");
		}

		if (rectangulo1.area() == 2) {
			System.out.println("Prueba area : CORRECTA");
		} else {
			System.out.println("Prueba area : ERROR");
		}

		if (rectangulo2.area() == 2.52) {
			System.out.println("Prueba area : CORRECTA");
		} else {
			System.out.println("Prueba area : ERROR");
		}

		if (rectangulo3.area() == 0) {
			System.out.println("Prueba area : CORRECTA");
		} else {
			System.out.println("Prueba area : ERROR");
		}

		if (rectangulo1.hipo() == Math.sqrt(5)) {
			System.out.println("Prueba hoipotenusa : CORRECTA");
		} else {
			System.out.println("Prueba area : ERROR");
		}

		if (rectangulo2.hipo() == Math.sqrt(5.85)) {
			System.out.println("Prueba hoipotenusa : CORRECTA");
		} else {
			System.out.println("Prueba hipotenusa : ERROR");
		}

		if (rectangulo3.hipo() == Math.sqrt(0)) {
			System.out.println("Prueba hoipotenusa : CORRECTA");
		} else {
			System.out.println("Prueba hipotenusa : ERROR");
		}

		if (rectangulo1.ratioBaseAltura() == (2 / 1)) {
			System.out.println("Prueba ratio base altura : CORRECTA");
		} else {
			System.out.println("Prueba ratio base altura : ERROR");

		}

		if (rectangulo2.ratioBaseAltura() == (2.1 / 1.2)) {
			System.out.println("Prueba ratio base altura : CORRECTA");
		} else {
			System.out.println("Prueba ratio base altura : ERROR");

		}

		if (rectangulo3.ratioBaseAltura() == (0)) {
			System.out.println("Prueba ratio base altura : CORRECTA");
		} else {
			System.out.println("Prueba ratio base altura : ERROR");

		}

		if (rectangulo1.perimetro() == 6) {
			System.out.println("Prueba perimetro : CORRECTA");
		} else {
			System.out.println("Prueba perimetro : ERROR");

		}

		if (rectangulo2.perimetro() == 6.6) {
			System.out.println("Prueba perimtro : CORRECTA");
		} else {
			System.out.println("Prueba perimetro : ERROR");

		}

		if (rectangulo3.perimetro() == (0)) {
			System.out.println("Prueba perimetro : CORRECTA");
		} else {
			System.out.println("Prueba perimetro : ERROR");

		}

	}

	public static void main(String[] args) {
		new PruebaRectangulo().prueba();// TODO Auto-generated method stub

	}

}
