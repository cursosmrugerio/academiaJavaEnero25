package com.curso.builder.privado;

public class Cliente2 {
	
	public static void main(String[] args) {
		
		Tarea tarea = new Tarea.TareaBuilder(30)
				.setTarea("Comprar Pan")
				.setDefinidaPor("Urbano")
				.setAsignadaA("Aristobulo")
				.build();
		
		System.out.println(tarea);
	}

}
