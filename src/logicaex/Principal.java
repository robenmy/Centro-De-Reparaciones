package logicaex;

import java.util.ArrayList;



public class Principal {

	public static void main(String[] args) {
		
		Centro centro = new Centro();
		ArrayList<Trabajadores> tra = new ArrayList<Trabajadores>();
		
		TRiesgo r1= new TRiesgo("ALBERTO","75758",6,3,20,9);
		TImprescindibles im1= new TImprescindibles("Pedro","78787",5,5,23);
		TRiesgo r2= new TRiesgo("jose","959",6,3,20,2);
		TRiesgo r3= new TRiesgo("Maria","9684",6,3,25,2);
		TImprescindibles im2= new TImprescindibles("Alex","8484",2,6,27);
		
		
		tra.add(r1);
		tra.add(im1);
		tra.add(r2);
		tra.add(r3);
		tra.add(im2);
		
		centro.setMisTrabajadores(tra);
		
		for (Trabajadores aux : centro.getMisTrabajadores()){
			if(aux instanceof TRiesgo ){
				//((TRiesgo)aux).salario();
				
				System.out.println("\nNombre: " + ( (TRiesgo)aux).nombre );
				System.out.println("Cedula: " + ( (TRiesgo)aux).id );
				((TRiesgo)aux).salario();
				System.out.println("Salario: " + ( (TRiesgo)aux).getSalario());
		
	}else if(aux instanceof TImprescindibles){
		((TImprescindibles)aux).salario();
		
		System.out.println("\nNombre: " + ( (TImprescindibles)aux).nombre);
		System.out.println("Cedula: " + ( (TImprescindibles)aux).id );
		System.out.println("Salario: " + ( (TImprescindibles)aux).getSalario());
		
	}
		}
		
		
		centro.cantidasTrabajadoresRiesgo();
		System.out.println("\n");
		System.out.println("Cantidad de trabajadores de Riesgo = " +centro.getCantRiesgo());

}
	
	
	
	
}
