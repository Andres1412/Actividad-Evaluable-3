package ejercicioevaluable;

public abstract class Publi implements InterFaz {
	
	boolean Prestado=false;
	int Codigo, A�o;
	
public boolean getPrestado() {
		
		return Prestado;
		
	}
	
	public void setPrestado(boolean Prestado) {
		
		this.Prestado=Prestado;
		
	}
	

public int getCodigo() {
		
		return Codigo;
		
	}
	
	public void setCodigo(int Codigo) {
		
		this.Codigo=Codigo;
		
	}
	
public int getA�o() {
		
		return A�o;
		
	}
	
public void setA�o(int A�o) {
		
		this.A�o=A�o;
		
	}
	
	public void Prestar() {
		
		Prestado=true;
		
	}
	
public void Prestado() {
		
		Prestado=false;
		
	}
	
	public String toString() {
		
		String res= "El c�digo es "+Codigo+", el a�o de publicaci�n es "+A�o+" y prestado "+Prestado;
		return res;
	}
}


