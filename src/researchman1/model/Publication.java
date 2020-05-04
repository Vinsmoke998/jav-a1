package researchman1.model;

/**
 * 
 * @author LeMinh
 *
 */
public class Publication {

	private String doi; // Digital ObjectIdentifier
	private String title;
	private int yop; // abbreviation for year of publication

	public Publication(String doi, String title, int yop) {
		super();
		this.doi = doi;
		this.title = title;
		this.yop = yop;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYop() {
		return yop;
	}

	public void setYop(int yop) {
		this.yop = yop;
	}

	@Override
	public String toString() {
		return "<\"" + doi + "\", \"" + title + ", " + yop + ">";
	}

}
