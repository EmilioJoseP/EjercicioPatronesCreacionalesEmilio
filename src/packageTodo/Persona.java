package packageTodo;

public class Persona {
	private String colorOjos;
	private String colorPelo;
	private String tipoPelo;
	private String tipoOjos;
	private String nombre;
	private int edad;
	private String ciudad;
	private double peso;
	private double altura;
	
	public Persona(PersonaBuilder builder) {
		this.colorOjos = builder.getColorOjos();
		this.colorPelo = builder.getColorPelo();
		this.tipoPelo = builder.getTipoPelo();
		this.tipoOjos = builder.getTipoOjos();
		this.nombre = builder.getNombre();
		this.edad = builder.getEdad();
		this.ciudad = builder.getCiudad();
		this.peso = builder.getPeso();
		this.altura = builder.getAltura();
	}
	
	public String getColorOjos() {
		return this.colorOjos;
	}
	
	public String toString() {
		String paraDevolver = "";
		
		paraDevolver += "Nombre: " + this.nombre;
		
		if (this.colorOjos != null) {
			paraDevolver += ", Color de Ojos: " + this.colorOjos;
		} 
		
		if (this.colorPelo != null) {
			paraDevolver += ", Color de Pelo: " + this.colorPelo;
		} 
		
 		if (this.tipoPelo != null) {
			paraDevolver += ", Tipo de Pelo: " + this.tipoPelo;
		}
 		
 		if (this.tipoOjos != null) {
			paraDevolver += ", Tipo de ojos: " + this.tipoOjos;
		}
 		
 		if (this.edad != 0) {
			paraDevolver += ", Edad: " + this.edad;
		}
 		
 		if (this.ciudad != null) {
			paraDevolver += ", Ciudad: " + this.ciudad;
		}
 		
 		if (this.peso != 0) {
			paraDevolver += ", Peso: " + this.peso;
		}
 		
 		if (this.altura != 0) {
			paraDevolver += ", altura: " + this.altura;
		}
		
		return paraDevolver;
	}
	
	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}
	
	public String getColorPelo() {
		return this.colorPelo;
	}
	
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	public String getTipoPelo() {
		return this.tipoPelo;
	}
	
	public void setTipoPelo(String tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
	
	public String getTipoOjos() {
		return this.tipoOjos;
	}
	
	public void setTipoOjos(String tipoOjos) {
		this.tipoOjos = tipoOjos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
}
