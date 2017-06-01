
/*Written by Veera - https://veerasundar.com/blog/2010/06/mars-rover-in-java/
 Modified by Thomás Henrique - https://github.com/ThomasHSS/  

Esse código é uma modificação do codigo de Verra. Nele foi implementado o tratamento de dados

*/
package marsrovers;



public class TesteRover {
	
	public static final Integer N = 1;
	public static final Integer L = 2;
	public static final Integer S = 3;
	public static final Integer O = 4;
	
	public static void main(String args[]) {
		
		int corX = 0; //Posição
		int corY = 0;
		int inX = 0;
		int inY = 0;
		
		
	
		Rover rover = new Rover();
		rover.setPosicao(-1, 2, N);
		rover.processo("LMLRMLMLMM");
		rover.printPosicao(); 
		rover.setPosicao(3, 3, L);
		rover.processo("MMRMMRMRRM");
		rover.printPosicao(); 
		
	}
}
