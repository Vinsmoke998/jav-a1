package researchman1.app;

import java.util.HashSet;
import java.util.Set;

import researchman1.model.JournalArticle;
import researchman1.model.Publication;
import researchman1.model.ResearchPaper;
import researchman1.model.Researcher;

/**
 * 
 * @author LeMinh
 *
 */
public class ResearchManApp {

	public static void main(String[] args) {

		// Initialize 5 publications(2 research paper and 3 journal articles)
		Publication ja1 = new JournalArticle("JNA-1", "pro vip1", 1997, "thangnd1");
		Publication ja2 = new JournalArticle("JNA-2", "pro vip2", 1998, "thangnd2");
		Publication ja3 = new JournalArticle("JNA-3", "pro vip3", 1999, "thangnd3");

		Publication rp1 = new ResearchPaper("RSP-1", "provip1", 1998);
		Publication rp2 = new ResearchPaper("RSP-2", "provip2", 1999);

		// Initialize publication set
		Set<Publication> publicationsSet1 = new HashSet<Publication>();
		publicationsSet1.add(ja1);
		publicationsSet1.add(rp1);

		Set<Publication> publicationsSet2 = new HashSet<Publication>();
		publicationsSet2.add(rp1);
		publicationsSet2.add(rp2);

		if(rp1 instanceof JournalArticle) {
			System.out.println("Djt me m");
		} else {
			System.out.println(" deo phai");
		}
		// Initialize researcher
		Researcher r1 = new Researcher(1, "thangnd", "F", 1998, "Viet Nam", publicationsSet1);
		Researcher r2 = new Researcher(2, "minhlm", "M", 1999, "Viet Nam", publicationsSet2);

		r1.showPublications();
		r2.showPublications();
	}
}
