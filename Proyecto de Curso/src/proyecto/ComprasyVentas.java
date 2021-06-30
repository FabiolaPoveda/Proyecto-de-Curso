package proyecto;
import java.util.Scanner;
public class ComprasyVentas {

	static Scanner lector = new Scanner(System.in);
	
	public void Compras() {
		
		System.out.println("¡Bienvenidos Hyundai!");
		System.out.println("La siguiente app reflejará el control de compras y ventas de su empresa de autos en la última semana.");
		System.out.println();
		
		String[][] Producto = new String[8][5];
		
	 		System.out.println("	     -------Control de Compras-------");
	 		System.out.println("Importe total de todas las compras->		 $17,820");
	 		
			Producto[0][0] = "Fecha	";
			Producto[0][1] = "Producto ";
			Producto[0][2] = "Precio	";
			Producto[0][3] = "Cantidad	";
			Producto[0][4] = "Importe total	";
			
			Producto[1][0] = "15/06/21";
			Producto[1][1] = "Llanta ";
			Producto[1][2] = "  $100";
			Producto[1][3] = "	 25	";
			Producto[1][4] = "	 $2,500";
			
			Producto[2][0] = "16/06/21";
			Producto[2][1] = "Motor ";
			Producto[2][2] = "   $900";
			Producto[2][3] = " 	 10		";
			Producto[2][4] = "$9,000";
			
			Producto[3][0] = "17/06/21";
			Producto[3][1] = "Frenos";
			Producto[3][2] = "   $85	";
			Producto[3][3] = "	 15	";
			Producto[3][4] = "	 $1,275";
			
			Producto[4][0] = "18/06/21";
			Producto[4][1] = "Batería";
			Producto[4][2] = "  $60	";
			Producto[4][3] = "	 10	";
			Producto[4][4] = "	 $600";
			
			Producto[5][0] = "19/06/21";
			Producto[5][1] = "Espejo";
			Producto[5][2] = "   $30	";
			Producto[5][3] = "	 15	";
			Producto[5][4] = "	 $450";
			
			Producto[6][0] = "20/06/21";
			Producto[6][1] = "Capot";
			Producto[6][2] = "    $35	";
			Producto[6][3] = "	 12	";
			Producto[6][4] = "	 $420";
			
			Producto[7][0] = "21/06/21";
			Producto[7][1] = "Embrague";
			Producto[7][2] = " $715	";
			Producto[7][3] = "	 5	";
			Producto[7][4] = "	 $3,575";
	 		
			for(int i = 0; i < Producto.length; i++){ 
				for(int j = 0; j < Producto[i].length; j++){ 
					System.out.print(Producto[i][j] + " ");
				} 
				System.out.println();
			}
	}
	
	public void Ventas() {
		 String[][] Clientes = new String[8][6];
		 	System.out.println();
	 		System.out.println("	     -------Control de Ventas-------");
	 		System.out.println("Importe total de todas las ventas->				 $140,590");
	 		
	 		Clientes[0][0] = "Fecha	";
	 		Clientes[0][1] = "Cliente ";
	 		Clientes[0][2] = "Modelo de auto ";
	 		Clientes[0][3] = "Precio	";
	 		Clientes[0][4] = "Cantidad	";
	 		Clientes[0][5] = "Importe total	";
			
	 		Clientes[1][0] = "15/06/21";
	 		Clientes[1][1] = "Namjoon ";
	 		Clientes[1][2] = "Hyundai i10";
	 		Clientes[1][3] = "    $11,200";
	 		Clientes[1][4] = "	 1	";
	 		Clientes[1][5] = "	 $11,200";
			
	 		Clientes[2][0] = "16/06/21";
	 		Clientes[2][1] = "Seokjin ";
	 		Clientes[2][2] = "Hyundai i20";
	 		Clientes[2][3] = "    $14,300	";
	 		Clientes[2][4] = "1		";
	 		Clientes[2][5] = "$14,300";
			
	 		Clientes[3][0] = "17/06/21";
	 		Clientes[3][1] = "Yoongi";
	 		Clientes[3][2] = "  Hyundai i30";
	 		Clientes[3][3] = "    $18,500	";
	 		Clientes[3][4] = "1	";
	 		Clientes[3][5] = "	 $18,500";
			
	 		Clientes[4][0] = "18/06/21";
	 		Clientes[4][1] = "Hoseok";
	 		Clientes[4][2] = "  Hyundai i40 ";
	 		Clientes[4][3] = "   $20,100	";
	 		Clientes[4][4] = "1	";
	 		Clientes[4][5] = "	 $20,100";
			
	 		Clientes[5][0] = "19/06/21";
	 		Clientes[5][1] = "Jimin";
	 		Clientes[5][2] = "	  Hyundai iX20 ";
	 		Clientes[5][3] = "  $24,600	";
	 		Clientes[5][4] = "1	";
	 		Clientes[5][5] = "	 $24,600";
			
	 		Clientes[6][0] = "20/06/21";
	 		Clientes[6][1] = "Taehyung";
	 		Clientes[6][2] = "Hyundai Tucson";
	 		Clientes[6][3] = " $26,500	";
	 		Clientes[6][4] = "1	";
	 		Clientes[6][5] = "	 $26,500";
			
	 		Clientes[7][0] = "21/06/21";
	 		Clientes[7][1] = "Jungkook";
	 		Clientes[7][2] = "Hyundai IONIQ";
	 		Clientes[7][3] = "  $25,390	";
	 		Clientes[7][4] = "1	";
	 		Clientes[7][5] = "	 $25,390";
			
			for(int i = 0; i < Clientes.length; i++){ 
				for(int j = 0; j < Clientes[i].length; j++){ 
					System.out.print(Clientes[i][j] + " ");
				} 
				System.out.println();
			}
	}
}