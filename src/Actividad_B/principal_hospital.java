package Actividad_B;

import java.time.Instant;
import java.util.*;
import java.util.GregorianCalendar;

public class principal_hospital {
	
	
	
	

	public static void main(String[] args) {
		GregorianCalendar f1=new GregorianCalendar(1970,Calendar.JULY,1);
		GregorianCalendar f2=new GregorianCalendar(1997,Calendar.NOVEMBER,19);
		GregorianCalendar f3=new GregorianCalendar(2007,Calendar.JANUARY,04);
		GregorianCalendar f4=new GregorianCalendar(1985,Calendar.SEPTEMBER,15);
		
		
		
		
		persona p1 = new persona("11111111A", "Jose", "Medina", "Hombre", f1, "C/ Los Almendros", "666223344", "jose@gmail.com","38122333");
		persona p2 = new persona("22222222B", "Andres", "Cejas", "Hombre",f2,"C/ Los Pinos", "606213354", "andres@gmail.com","38462333");
		persona p3 = new persona("33333333C", "Julia", "Gonzalez", "Mujer",f3,"C/ El Faro", "806293754", "julia@gmail.com","38462377");
		persona p4 = new persona("22222222B", "Ana", "Cejas", "Mujer",f4,"C/ Verodes", "735213354", "aNA@gmail.com","38123453");
		
		paciente pa1=new paciente(1,p1,123345);
		personal_sanitario ps1=new personal_sanitario(1, p4, "Medico", "Traumatologo", 1200);
		personal_sanitario ps2=new personal_sanitario(3, p3, "Enfermera", "Nivel 1", 1000);
		
		personal_no_sanitario pns1=new personal_no_sanitario(3, p2, "Auxiliar Administrativo", "Administración", 1300);
		
		System.out.println(" DATOS DE LA PERSONA \n" + p1.toString());
		System.out.println(" DATOS DE LA PERSONA \n" + p2.toString());
		System.out.println(" DATOS DEL PACIENTE \n" + pa1.toString());
		System.out.println(" DATOS DEL PERSONAL SANITARIO \n" + ps1.toString());
		System.out.println(" DATOS DEL PERSONAL SANITARIO \n" + ps2.toString());
		System.out.println(" DATOS DEL PERSONAL NO SANITARIO \n" + pns1.toString());
		
	}

}
