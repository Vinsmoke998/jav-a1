package researchman1.model;
/**
 * 
 * @author LeMinh
 *
 */
public class JournalArticle extends Publication {

	private String journal_title;

	
	public JournalArticle(String doi, String title, int yob, String journal_title) {
		super(doi, title, yob);
		this.journal_title = journal_title;
	}

	public String getJournal_title() {
		return journal_title;
	}

	public void setJournal_title(String journal_title) {
		this.journal_title = journal_title;
	}

}
