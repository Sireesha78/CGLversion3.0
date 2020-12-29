//@author P. Sireesha 2020501096
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitconways {
	@Test
	
	public void conwaytest1() {
		Conwaysgame con=new Conwaysgame();
		int[][] arr={{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		con.startGeneration(arr, 10);
		con.nextgener();
		Assertions.assertEquals("..........\n"
				+ "...**.....\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "..........\n"
				+ "..***.....\n"
				+ "..**......\n"
				+ "...**.....\n"
				+ "..........\n"
				+ ".........."
				+ "",con.currentgen.printBoard());
		con.nextgener();
		Assertions.assertEquals("..........\n"
				+ "...**.....\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "...*......\n"
				+ "..*.*.....\n"
				+ "..........\n"
				+ "..***.....\n"
				+ "..........\n"
				+ "..........",con.currentgen.printBoard());
		
		
		
		con.nthGeneration(3);
				Assertions.assertEquals("..........\n"
						+ "...**.....\n"
						+ "..*.*.....\n"
						+ ".**.......\n"
						+ ".*..*.....\n"
						+ ".*..*.....\n"
						+ ".*...*....\n"
						+ "..*.*.....\n"
						+ "...*......\n"
						+ ".........."
						+ "", con.currentgen.printBoard());
				con.nthGeneration(25);
				Assertions.assertEquals("..........\n"
						+ "..........\n"
						+ "..........\n"
						+ "..........\n"
						+ "..........\n"
						+ "..........\n"
						+ ".**.......\n"
						+ ".**.......\n"
						+ "..........\n"
						+ ".........."
						+ "", con.currentgen.toString());
				
				
				
			}
	@Test
	public void conwaytest2() {
		Conwaysgame con=new Conwaysgame();
		int[][] arr={{1,3},{1,4},{2,4},{5,3},{5,4},{6,2},{6,3},{7,5},{8,4}};
		con.startGeneration(arr, 10);
		con.infiniteGeneration();
		Assertions.assertEquals("..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ ".**.......\n"
				+ ".**.......\n"
				+ "..........\n"
				+ ".........."
				+ "", con.currentgen.toString());
	}


}
