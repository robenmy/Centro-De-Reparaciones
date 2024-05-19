package logicaex;

import java.util.ArrayList;




public class Centro {

	private ArrayList<Trabajadores> misTrabajadores;
	private int cantRiesgo;

	public Centro() {
		super();
		this.misTrabajadores = new ArrayList<Trabajadores>();
		this.cantRiesgo=0;
	}

	public ArrayList<Trabajadores> getMisTrabajadores() {
		return misTrabajadores;
	}

	public void setMisTrabajadores(ArrayList<Trabajadores> misTrabajadores) {
		this.misTrabajadores = misTrabajadores;
	}
	
	
	
	public int getCantRiesgo() {
		return cantRiesgo;
	}

	public void setCantRiesgo(int cantRiesgo) {
		this.cantRiesgo = cantRiesgo;
	}

	public void cantidasTrabajadoresRiesgo(){
		
		for (Trabajadores aux : misTrabajadores){
			if(aux instanceof TRiesgo ){
				cantRiesgo+= 1;
			}
			
		}
		
		
	}
	
	
}
