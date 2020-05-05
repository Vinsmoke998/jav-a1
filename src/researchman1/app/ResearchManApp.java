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
		Publication ja1 = new JournalArticle("a", "pro vip1", 1997, "thangnd1");
		Publication ja2 = new JournalArticle("b", "pro vip2", 1998, "thangnd2");
		Publication ja3 = new JournalArticle("c", "pro vip3", 1999, "thangnd3");

		Publication rp1 = new ResearchPaper("d", "provip123", 1998);
		Publication rp2 = new ResearchPaper("e", "provip12", 1999);

		// Initialize publication set
		Set<Publication> publicationsSet1 = new HashSet<Publication>();
		publicationsSet1.add(ja1);
		publicationsSet1.add(rp1);
		
		Set<Publication> publicationsSet2 = new HashSet<Publication>();
		publicationsSet2.add(rp1);
		publicationsSet2.add(rp2);

		// Initialize researcher
		Researcher r1 = new Researcher(1, "thangnd", "F", 1998, "Viet Nam", publicationsSet1);
		Researcher r2 = new Researcher(2, "minhlm", "M", 1999, "Viet Nam", publicationsSet2);

		//r1.removePublication("pro vip1");
		//r1.addPublication(rp1);
//		if(r1.hasPublication("title")) {
//			System.out.println(r1.getName()+ " has this publication");
//		} else {
//			System.out.println(r1.getName() + " does not have this publication");
//		}
		
//		Publication pub = r1.getPublicationByTitle("pro vip1");
//		System.out.println(pub.getTitle());
		
		
		System.out.println("All publications of each researcher: \n");
		r1.showPublications();
		r2.showPublications();
		System.out.println("--------------------------------------------------------");
		System.out.println("All sorted publications of each researcher: \n");
		r1.showSortedPublications();
		r2.showSortedPublications();
		System.exit(0);
	}
}
