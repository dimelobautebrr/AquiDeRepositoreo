package raulDieta;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Programa que agreg matriculas de coches en el array de una clase validandolas
		Coche coches[] = new Coche[10];
		String matricula;
		int numVehiculos = 0;
		
		do {
		System.out.println("Introduzca matricula de un coche");
		matricula = sc.nextLine();
		
		if(validarMatricula(matricula)) {
			coches[numVehiculos] = new Coche(matricula);
			numVehiculos++;
		}else {
			System.out.println("Matricula no valida, repita");
		}
		}while(numVehiculos < coches.length);
		
		for(int i = 0; i < numVehiculos; i++) {
			System.out.println(coches[i].toString());
		}
	}

	public static boolean validarMatricula(String mat){
        mat = mat.toUpperCase();
        
        if(mat.length() != 7){
            return false;
        }
        
        for(int i=0;i<4;i++){
            if(mat.charAt(i)< '0' || mat.charAt(i)>'9'){
                return false;
            }
        }
        
        for(int x=4; x<=6 ; x++){
            if(mat.charAt(x) < 'A' || mat.charAt(x) > 'Z'){
                return false;
            }
        }
        
        return true;
    }
}
