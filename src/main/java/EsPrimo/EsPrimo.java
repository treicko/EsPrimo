package EsPrimo;

public class EsPrimo {

	public boolean EsNumeroPrimo(int numero) {
		int numeroDeDivisores=0;
		int contador=1;
		while(contador<=numero&&numeroDeDivisores!=3)
		{
			if(numero%contador==0)
			{
				numeroDeDivisores++;
				
			}
			
			contador++;
		}
		return numeroDeDivisores==2;
	}

}
