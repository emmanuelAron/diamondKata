package kata.diamond;

import static org.assertj.core.api.Assertions.assertThat;
import static kata.diamond.Diamond.*;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void A_shouldDraw_A() {
       assertThat(diamond("A")).isEqualTo("A");
    }
    @Test
    public void B_shouldDraw_A_bb_A() {
    	assertThat(diamond("B")).isEqualTo(" A\nB B\n A");
    	//System.out.println(diamond("B"));
    	
    }
    @Test
    public void C_shouldDraw_A_B_B_C__C_BB_A() {
    	assertThat(diamond("C")).isEqualTo("  A\n B B\nC   C\n B B\n  A");
    	System.out.println("  A\n B B\nC   C\n B B\n  A");
    	
    }
	

}
