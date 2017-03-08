
public class TitleCaseThread implements Runnable {
	String summary;
	String modifiedSummary;
	
	public TitleCaseThread(String summary) {
		super();
		this.summary = summary;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getModifiedSummary() {
		return modifiedSummary;
	}

	public void setModifiedSummary(String modifiedSummary) {
		this.modifiedSummary = modifiedSummary;
	}

	@Override
	public void run() {
		String[] words = summary.split(" ");
		modifiedSummary = "";
		for(String word:words){
			char[] characterArray = word.toLowerCase().toCharArray();
	        characterArray[0] = Character.toTitleCase(characterArray[0]);
	        word =  new String(characterArray);
			modifiedSummary = modifiedSummary+ " "+ word;
		}
		modifiedSummary = modifiedSummary.trim();
	}
	
	
	
	
}
