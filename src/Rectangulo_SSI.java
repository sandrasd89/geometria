/**
 * @author Sandra Sáez Ibarra
 * @version 1.2
 */
public class Rectangulo_SSI extends FiguraGeometrica_SSI {
	private double l1;
	private double l2;

	/**
	 * Este método recibe los valores de las variables para poder usarlos en los métodos sucesivos
	 * @param tipoFigura String Variable de texto
	 * @param lG double variable numérico para definir uno de los lados del rectángulo
	 * @param lP double variable numérico para definir el otro de los lados del rectángulo
	 */
	public Rectangulo_SSI(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Este método calcula el área del rectángulo
	 * @return area double valor numérico resultante del cálculo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}

	/**
	 * Este método calcula el perímetro del rectángulo
	 * @return perimetro double valor numérico resultante del cálculo
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
