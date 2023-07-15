
public class Chromebook extends Item{//16	
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){//change tostring
		
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20s", output, os);
		return output;
	}
}


