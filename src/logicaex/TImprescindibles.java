package logicaex;

public class TImprescindibles extends Trabajadores{

	float salario;
	
	public TImprescindibles(String nombre, String id, float salarioDiario,
			int antiguedad, int diasTrabajados) {
		super(nombre, id, salarioDiario, antiguedad, diasTrabajados);
		this.salario=0;
	}
	



	public float getSalario() {
		return salario;
	}







	public void setSalario(float salario) {
		this.salario = salario;
	}







	@Override
	public void salario() {
		
		salario = (salarioDiario)*(diasTrabajados)*(antiguedad/3);
		
		
	}
	
	
	

}
