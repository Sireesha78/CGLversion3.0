//@author P. Sireesha 2020501096
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitboard {
	@Test
	public void testcreate() {
		board c = new board(10);
		c.createboard();
		Assertions.assertEquals("..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........", c.toString());
	}
	@Test
	public void testnextgen() {
		board b=new board(10);
		board b1=new board(10);
		b.createboard();
		b1.createboard();
		b.cell[1][3].status=true;
		b.cell[1][4].status=true;
		b.cell[2][4].status=true;
		b.cell[5][3].status=true;
		b.cell[5][4].status=true;
		b.cell[6][2].status=true;
		b.cell[6][3].status=true;
		b.cell[7][5].status=true;
		b.cell[8][4].status=true;
		b1=b.generateNextGeneration(b1);
		Assertions.assertEquals("..........\n"
				+ "...**.....\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "..........\n"
				+ "..***.....\n"
				+ "..**......\n"
				+ "...**.....\n"
				+ "..........\n"
				+ "..........", b1.toString());
	}

}
