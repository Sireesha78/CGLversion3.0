/*
 * @author P. Sireesha 2020501096
 * Took help from team mate Sai chandra.
 */
public class Conwaysgame {
//creating Conways game class 
	private int size;
	board currentgen;
	board nextgen;
//startGeneration helps to Initialise the board with the live cells and creates the board 
	public void startGeneration(int[][] arr, int size) {
		this.size = size;
		this.currentgen = new board(size);
		this.currentgen.createboard();
		for (int i = 0; i < arr.length; i++) {
			int row = arr[i][0];
			int col = arr[i][1];
			this.currentgen.cell[row][col].status = true;
		}

	}
//nextgener helps to create the next generation
	public void nextgener() {
		nextgen = new board(size);
		nextgen.createboard();
		nextgen = currentgen.generateNextGeneration(nextgen);
		currentgen = nextgen;

	}
//creates Nth Generation 
	public void nthGeneration(int n) {
		for (int i = 0; i < n; i++) {
			nextgen = new board(size);
			nextgen.createboard();
			nextgen = currentgen.generateNextGeneration(nextgen);
			if (currentgen.printBoard().equals(nextgen.printBoard())) {
				break;
			} else {
				currentgen = nextgen;
			}
		}
	}
//Creates infinite generation by comparing the current generation and the next generation
	public void infiniteGeneration() {
		for(;;) {
			nextgen=new board(size);
			nextgen.createboard();
			nextgen=currentgen.generateNextGeneration(nextgen);
			if(currentgen.printBoard().equals(nextgen.printBoard())) {
				currentgen=nextgen;
				break;
			}
			else {
				currentgen=nextgen;
			}
			
		}
	}
}

