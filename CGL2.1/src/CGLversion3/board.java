package CGLversion3;
//@author P. Sireesha 2020501096
//Create board class
public class board {								
	public cell[][] cell;
	private int n;
	private int m;

	public board(int n, int m) {
		this.n = n;
		this.m = m;
		this.cell = new cell[n][m];
	}
//Creating board method
	public void createboard() {

		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.m; j++) {
				this.cell[i][j] = new cell(false);

			}
		}
		

	}
//Printing the board
	public String printBoard() {
		String con = "";
		for (int i = 0; i < this.n; i++) {
			for (int j = 0; j < this.m; j++) {
				if (cell[i][j].status==true) {

					con += "*";

				} else {

					con += ".";

					if (j == this.m - 1 && i < this.n - 1) {
						con = con + "\n";
					}
				}

			}

		}
		return con;
	}
	// modular division for corner cases  (Took help from team mate Sai chandra)
	public int modularDiv(int mod) {
		
		return (((mod % n) + n) % n);
	}
	public int modular1(int mod) {
		
		return (((mod % m) + m) % m);
	}
	//Generating Next Generation board by checking 8 neighbours of the cell
	public board generateNextGeneration(board gen) {
        for(int i=0;i<this.n;i++){
            for(int j=0;j<this.m;j++){
            	//statusing all the conditions for the cells to status for the next generations. 
                int count=0;
                if(this.cell[modularDiv(i-1)][modular1(j-1)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i-1)][modular1(j)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i-1)][modular1(j+1)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i)][modular1(j-1)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i)][modular1(j+1)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i+1)][modular1(j-1)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i+1)][modular1(j)].status) {
                	
                	count+=1;
                }
                if(this.cell[modularDiv(i+1)][modular1(j+1)].status){
                    count+=1;
                }
                if(this.cell[modularDiv(i)][modular1(j)].status){
                    if(count==2 || count==3){
                        gen.cell[i][j].status=true;
                        
                    }
                }
                else{
                    if(count==3){
                        gen.cell[i][j].status=true;
                    }
                }
            }
        }
        return gen;

    }
	public String toString() {
		
		return this.printBoard();
	}

	 
}
