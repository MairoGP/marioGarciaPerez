
public class CosasNatziz {
	public static void main (String[] args) {
		int numero=15;
		String salida="";
		
		for (int i = 0; i <= numero; i++) {
			for(int j=1; j <= i;j++) {
				salida+=String.format("%5s",j);
			}
			salida+="\n";
		}
		System.out.println(salida);
	}
}
