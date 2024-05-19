package logicaex;

public class TRiesgo extends Trabajadores {
	
	private int indice;
	private float salario;

	public TRiesgo(String nombre, String id, float salarioDiario,
			int antiguedad, int diasTrabajados, int indice) {
		super(nombre, id, salarioDiario, antiguedad, diasTrabajados);
		this.indice = indice;
		this.salario=0;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public void salario() {
		if(indice >=1 && indice <=5){
		salario = (salarioDiario)*(diasTrabajados)*(antiguedad/3)+(indice*5000);
		}else{
			System.out.println("Error: Indice tiene que estar entre 1 y 5");
		}
	
		
	}
	
	

}
