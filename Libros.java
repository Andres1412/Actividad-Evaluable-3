package ejercicioevaluable;

public abstract class Libros extends Publi {
	
	String Autor;
	
	public Libros(){
		
	}
	
	public Libros(int Codigo, int Año, boolean Prestado, String Autor) {
		
		this.Codigo=Codigo;
		this.Año=Año;
		this.Prestado=Prestado;
		this.Autor=Autor;
		
	}
	
	public String getAutor() {
		
		return Autor;
		
	}
	
	public void setAutor(String Autor) {
		
		this.Autor=Autor;
		
	}
	
	public String toString() {
		
		String res=super.toString();
		
		res=res+", autor: "+Autor;
		
		return res;
		
	}

	
}
