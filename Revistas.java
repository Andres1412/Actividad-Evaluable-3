package ejercicioevaluable;

public abstract class Revistas extends Publi{
	
	int Numero;
	
	public Revistas () {
		
	}
	
	public Revistas(int Codigo, int A�o, boolean Prestado, int Numero) {
		this.Codigo=Codigo;
		this.A�o=A�o;
		this.Prestado=Prestado;
		this.Numero=Numero;
	}
	
	public int setNumero() {
		
		return Numero;
		
	}
	
	public void setNumero (int Numero) {
		
		this.Numero=Numero;
		
	}
	
	public String toString( ) {
		
		String res=super.toString();
		
		res=res+", n�mero:"+Numero;
		
		return res;
		
	}

}
