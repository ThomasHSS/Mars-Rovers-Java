package marsrovers;

public class TesteRover {
	
	public static final Integer N = 1;
	public static final Integer L = 2;
	public static final Integer S = 3;
	public static final Integer O = 4;
	
	public static void main(String args[]) {
		
		Rover rover = new Rover();
		rover.setPosicao(1, 2, N);
		rover.processo("LMLMLMLMM");
		rover.printPosicao(); 
		rover.setPosicao(3, 3, L);
		rover.processo("MMRMMRMRRM");
		rover.printPosicao(); 
		
	}
}
