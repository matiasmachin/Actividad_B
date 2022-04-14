package Actividad_B;

import java.awt.*;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.channels.NonWritableChannelException;
import java.time.Instant;

import java.util.*;

public class principal_hospital {
	
	
	
	

	public static void main(String[] args) {
		GregorianCalendar f1=new GregorianCalendar(1970,Calendar.JULY,1);
		GregorianCalendar f2=new GregorianCalendar(1997,Calendar.NOVEMBER,19);
		GregorianCalendar f3=new GregorianCalendar(2007,Calendar.JANUARY,04);
		GregorianCalendar f4=new GregorianCalendar(1985,Calendar.SEPTEMBER,15);
		GregorianCalendar f5=new GregorianCalendar(2021,Calendar.MARCH,15);
		GregorianCalendar f6=new GregorianCalendar(2022,Calendar.JANUARY,17);
		GregorianCalendar f7=new GregorianCalendar(2021,Calendar.DECEMBER,5);
		
		
		
		
		persona p1 = new persona("11111111A", "Jose", "Medina", "Hombre", f1, "C/ Los Almendros", "666223344", "jose@gmail.com","38122333");
		persona p2 = new persona("22222222B", "Andres", "Cejas", "Hombre",f2,"C/ Los Pinos", "606213354", "andres@gmail.com","38462333");
		persona p3 = new persona("33333333C", "Julia", "Gonzalez", "Mujer",f3,"C/ El Faro", "806293754", "julia@gmail.com","38462377");
		persona p4 = new persona("22222222B", "Ana", "Cejas", "Mujer",f4,"C/ Verodes", "735213354", "aana@gmail.com","38123453");
		persona p5 = new persona("5555552X", "Maria", "Ortega", "Mujer",f4,"C/ Mendez ", "831333254", "maria@gmail.com","378153453");
		
		examenes e1=new examenes(1, "Perfil-20", "Laboratorio", f5);
		examenes e2=new examenes(2, "RX Mano Derecha", "Radiologia", f6);
		examenes e3=new examenes (3, "Escanner Craneal", "Radiologia", f7);
		
		patologias pt1=new patologias(1, "Encefalea", "Dolor fuerte en la cabeza, especificamente en zona de la frente", "Paracetamol 500 mg cada 8 horas por 3 dias", f7);
		patologias pt2=new patologias(2, "Crisis asmatifoide", "Deficiencia respiratoria", "Salbutamol 100 microgramos, un puff cada 8 horas por 7 dias", f6);
		patologias pt3=new patologias(2, "Hipertension", "Mareos y nauseas", "Olmesartan de 40mg, Una capsula en la mañana" , f5);
		
		
		paciente pa1=new paciente(1,p1,123345);
		paciente pa2=new paciente(2,p5,654321);
		personal_sanitario ps1=new personal_sanitario(1, p4, "Medico", "Traumatologo", 1200);
		personal_sanitario ps2=new personal_sanitario(3, p3, "Enfermera", "Nivel 1", 1000);
		
		personal_no_sanitario pns1=new personal_no_sanitario(3, p2, "Auxiliar Administrativo", "Administraci�n", 1300);
		
		pa1.anadirexamen(e1);
		pa1.anadirexamen(e2);
		pa2.anadirexamen(e3);
		pa1.anadirpatalogia(pt1);
		pa1.anadirpatalogia(pt2);
		pa2.anadirpatalogia(pt3);
		
	
		
		System.out.println(" DATOS DE LA PERSONA \n" + p1.toString());
		pausa();
		System.out.println(" DATOS DE LA PERSONA \n" + p2.toString());
		pausa();
		System.out.println(" DATOS DEL PACIENTE \n" + pa1.toString());
		pausa();
		System.out.println(" DATOS DEL PACIENTE \n" + pa2.toString());
		pausa();
		System.out.println(" DATOS DEL PERSONAL SANITARIO \n" + ps1.toString());
		pausa();
		System.out.println(" DATOS DEL PERSONAL SANITARIO \n" + ps2.toString());
		pausa();
		System.out.println(" DATOS DEL PERSONAL NO SANITARIO \n" + pns1.toString());
		
	}

	
	public static void pausa() { // Metodo para generar una pausa hasta que se pulse una tecla
		
		String seguir;
	    Scanner teclado = new Scanner(System.in);
	    System.out.println("Press Enter key to continue...");
	    System.out.println("Presione  una tecla para continuar...");
	    try
	    {
	        seguir = teclado.nextLine();
	    }
	    catch(Exception e)
	    {}
		    
	}

		
}