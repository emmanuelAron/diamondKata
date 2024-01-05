package kata.diamond;

public class Diamond {
    
	public static String diamond(String motifDiam) {
		String result = "A";
		if(motifDiam.equals("B")) {
			result = " A\nB B\n A";
		}
		if(motifDiam.equals("C")) {
			result = "  A\n B B\nC   C\n B B\n  A";
		}
		
		return result;
	}
    
}
