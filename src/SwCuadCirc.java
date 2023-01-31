import java.util.Scanner;
public class SwCuadCirc {
	public static void main(String[] argumentos){
	while(true) {
		String figcuad = "cuadrado";
		String figcirc = "circulo";
		Scanner scan = new Scanner(System.in);
		System.out.println("¿Que figura eliges, "+figcuad+" o "+figcirc+"?. Recueda no usar acentos\n");
		String inline=scan.nextLine();
		System.out.println("Elegiste "+inline+"\n");
		String fig=inline;
		//////////////
		if(fig.equals("cuadrado")) {
			System.out.println("Si quieres calcular la diagonal, ingresa 1\nSi quieres calcular perimetro, ingresa 2\nSi quieres calcular area, ingresa 3\n\nPara salir, ingresar 4"); 
			Scanner sca= new Scanner(System.in);
			int opc =sca.nextInt();
			int operacion = opc;
			//////////
			System.out.println("Quieres usar el lado que esta por default?. Escribe 1 si sí, y si no, escribe 0");
			Scanner sc= new Scanner(System.in);
			int bo =sc.nextInt();
			int resp=bo;
			//////////
			switch (opc) {
				case 1:
						if(resp==1) {
							Ejcuadrado df= new Ejcuadrado();
							df.calcDiago();
							System.out.println("La diagonal del cuadrado es "+df.calcDiago());
						}
						else {
							if(resp==0);
							System.out.println("Ahora, ingresa lado\n");
							int lado=scan.nextInt();
							int l=lado;
							double c=l;
							System.out.println("El lado de tu cuadrado es "+c+"\n");
							Ejcuadrado df= new Ejcuadrado(c);//Aquí funciona con this.
							//df.ladoDife(c);
							df.calcDiago();
							System.out.println("La diagonal del cuadrado es "+df.calcDiago());
						}
				break;
				case 2:
						if(resp==1) {
							Ejcuadrado df= new Ejcuadrado();
							df.calcPeri();
							System.out.println("El perimetro del cuadrado es "+df.calcPeri());
						}
						else {
							if(resp==0);
							System.out.println("Ahora, ingresa lado\n");
							int lado=scan.nextInt();
							int l=lado;
							double c=l;
							System.out.println("El lado de tu cuadrado es "+c+"\n");
							Ejcuadrado df= new Ejcuadrado(c);//Aquí funciona con this.
							//df.ladoDife(c);
							df.calcPeri();
							System.out.println("El perimetro del cuadrado es "+df.calcPeri());
						}
				break;
				case 3:
						if(resp==1) {
							Ejcuadrado df= new Ejcuadrado();
							df.calcArea();
							System.out.println("El perimetro del cuadrado es "+df.calcArea());
						}
						else {
							if(resp==0);
							System.out.println("Ahora, ingresa lado\n");
							int lado=scan.nextInt();
							int l=lado;
							double c=l;
							System.out.println("El lado de tu cuadrado es "+c+"\n");
							Ejcuadrado df= new Ejcuadrado(c);//Aquí funciona con this.
							//df.ladoDife(c);
							df.calcArea();
							System.out.println("El perimetro del cuadrado es "+df.calcArea());
						}
				break;
				case 4:
					System.out.println("Saliendo");
					System.exit(0);
				default:
					System.out.println("Operacion invalida. Seleccione de nuevo");
				break;
					
			}
		}	
		if(fig.equals("circulo")) {
			System.out.println("Si quieres calcular perimetro, ingresa 1\nSi quieres calcular area, ingresa 2\n\nPara salir, ingresar 3"); 
			Scanner sca= new Scanner(System.in);
			int opc =sca.nextInt();
			int operacion = opc;
			//////////
			System.out.println("Quieres usar el lado que esta por default?. Escribe 1 si sí, y si no, escribe 0");
			Scanner sc= new Scanner(System.in);
			int bo =sc.nextInt();
			int resp=bo;
			//////////
			switch (opc) {
				case 1:
						if(resp==1) {
							ElCirculo df= new ElCirculo();
							df.calcCirc();
							System.out.println("El perimetro del circulo es "+df.calcCirc());
						}
						else {
							if(resp==0);
							System.out.println("Ahora, ingresa radio\n");
							int radio=scan.nextInt();
							int r=radio;
							double c=r;
							System.out.println("El radio de tu circulo es "+c+"\n");
							ElCirculo dfc= new ElCirculo();
							dfc.radioDife(c);
							dfc.calcCirc();
							System.out.println("El perimetro del circulo es "+dfc.calcCirc());
						}
				break;
				case 2:
						if(resp==1) {
							ElCirculo df= new ElCirculo();
							df.calcAreac();
							System.out.println("El area del circulo es "+df.calcAreac());
						}
						else {
							if(resp==0);
							if(resp==0);
							System.out.println("Ahora, ingresa radio\n");
							int radio=scan.nextInt();
							int r=radio;
							double c=r;
							System.out.println("El radio de tu circulo es "+c+"\n");
							ElCirculo dfc= new ElCirculo();
							dfc.radioDife(c);
							dfc.calcAreac();
							System.out.println("El area del circulo es "+dfc.calcAreac());
						}
				break;
				case 3:
					System.out.println("Saliendo");
					System.exit(0);

				default:
					System.out.println("Operacion invalida. Seleccione de nuevo");
				break;
			}
		}
	}
	}
}
	
