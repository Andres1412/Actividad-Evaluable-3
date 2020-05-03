package ejercicioevaluable;

public abstract class Publi implements InterFaz {
	
	boolean Prestado=false;
	int Codigo, Año;
	
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
	
public int getAño() {
		
		return Año;
		
	}
	
public void setAño(int Año) {
		
		this.Año=Año;
		
	}
	
	public void Prestar() {
		
		Prestado=true;
		
	}
	
public void Prestado() {
		
		Prestado=false;
		
	}
	
	public String toString() {
		
		String res= "El código es "+Codigo+", el año de publicación es "+Año+" y prestado "+Prestado;
		return res;
	}
}


