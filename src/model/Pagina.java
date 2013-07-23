package model;

public class Pagina {

	private int d;
	private int limite;
	
	public Pagina(int d){
		this.d = d;
		this.limite = 2*d;
	}
	
	private int[] chaves = new int[limite];
	private int[] chaves = new int[limite];
	private static int i = 0;
	
	public void addChave(int chave){
		if(i < limite)
			chaves[i] = chave;
	}
	public boolean buscaChavePagina(int m){
		for(int j = 0; j < chaves.length; j++)
			if(chaves[i] == m)
				return true;
		
		return false;
	}
}
