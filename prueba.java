import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;

public class prueba{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String [][] tablaTrans = new String[11][3];
		for (int i = 0;i<=10 ;i++ ) {
		tablaTrans[i][0]="q"+i;
		if (i==10) {
			tablaTrans[i][1]="q"+i;
		}else
		tablaTrans[i][1]="q"+(i+1);
		tablaTrans[i][2]="q"+i; 	
		}


		int posActual = 0;
		String actual = "";
		String anterior = "q0";
		do{
			System.out.println("el valor?:");
			int val = in.nextInt();
			actual = tablaTrans[posActual][val+1];
			System.out.println(""+anterior+" -> " + actual);
			anterior = actual;
			posActual = Integer.parseInt(actual.substring(1,actual.length()));
			// if (posActual==10) {
			// 	break;
			// }
		}while(in.hasNext()&&posActual!=10);
		System.out.println("Llego al estado de aceptacion");
	}
}


//    |0	1	
// ---|------------
// q10|q2	q1
// q1 |
//    |
//    |
//    |
