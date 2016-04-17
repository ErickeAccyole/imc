
public class Imc {
	
	public static double calculoImc(double altura,double peso){
		double resultado;
		
		resultado = peso/ (altura * altura);
		return resultado;
	}

}
