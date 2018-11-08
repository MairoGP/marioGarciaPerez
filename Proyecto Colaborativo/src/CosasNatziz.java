
public class CosasNatziz {
	public static void main (String[] args) {
		int numero=15;
		String salida="";
		//Algoritmo para escalera de numeros
		/*
		for (int i = 0; i <= numero; i++) {
			for(int j=1; j <= i;j++) {
				salida+=String.format("%5s",j);
			}
			salida+="\n";
		}
		System.out.println(salida);
		*/
		
		//Algoritmo para el triangulo de Floyd
		
		int numeroFloyd=5;
		int contador=1;
		
		for(int i=0; i <= numeroFloyd; i++) {
			for(int j=0; j < i; j++) {
				salida+=String.format("%5s",contador);
				contador++;
			}
			salida+="\n";
		}
		
		System.out.println(salida);
	}

}
