//@author P. Sireesha 2020501096
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestJunitcell{
	
	@Test
	public void testingcell(){
		cell c = new cell(false);
		Assertions.assertEquals("false", c.toString());
		System.out.println(c);
	}
	
	
}
