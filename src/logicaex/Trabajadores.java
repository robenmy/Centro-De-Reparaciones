package logicaex;

public abstract class Trabajadores {
	protected String nombre;
	protected String id;
	protected float salarioDiario;
	protected int antiguedad;
	protected int diasTrabajados;
	
	public Trabajadores(String nombre, String id, float salarioDiario,
			int antiguedad, int diasTrabajados) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.salarioDiario = salarioDiario;
		this.antiguedad = antiguedad;
		this.diasTrabajados = diasTrabajados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getSalarioDiario() {
		return salarioDiario;
	}

	public void setSalarioDiario(float salarioDiario) {
		this.salarioDiario = salarioDiario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;
	}

	public void setDiasTrabajados(int diasTrabajados) {
		this.diasTrabajados = diasTrabajados;
	}
	
	public abstract void salario();

}
