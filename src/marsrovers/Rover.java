package marsrovers;

    public class Rover {
    	public static final Integer N = 1;
    	public static final Integer L = 2;
    	public static final Integer S = 3;
    	public static final Integer O = 4;
    	
    	Integer x = 0;
    	Integer y = 0;
    	Integer pCardeal = N;
    	
    	public Rover() {
    	}
    	
    	public void setPosicao(Integer x, Integer y, Integer face) {
    		this.x = x;
    		this.y = y;
    		this.pCardeal = face;
    	}
    	public void printPosicao() {
    		char dir = 'N';
    		if (pCardeal == 1) {
    			dir = 'N';
    		} else if (pCardeal == 2) {
    			dir = 'L';
    		} else if (pCardeal == 3) {
    			dir = 'S';
    		} else if (pCardeal == 4) {
    			dir = 'O';
    		}
    		System.out.println(x + " " + y + " " + dir);
    	}
    	public void processo(String comandos) {
    		for (int i = 0; i < comandos.length(); i++ ) {
    			processo2(comandos.charAt(i));
    		}
    	}
    	private void processo2(Character comando) {
    		if (comando.equals('L')) {
    			vireL();
    		} else if (comando.equals('R')) {
    			vireR();
    		} else if (comando.equals('M')) {
    			move();
    		} else {
    			throw new IllegalArgumentException(
    					"Caracter errado!");
    		}
    	}
    	private void move() {
    		if (pCardeal == N) {
    			this.y++  ;
    		} else if (pCardeal == L) {
    			this.x++  ;
    		} else if (pCardeal == S) {
    			this.y--;
    		} else if (pCardeal == O) {
    			this.x--;
    		}
    	}
    	private void vireL() {
    		pCardeal = (pCardeal - 1) < N ? O : pCardeal - 1;
    	}
    	private void vireR() {
    		pCardeal = (pCardeal) > O ? N : pCardeal + 1;
    	}
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