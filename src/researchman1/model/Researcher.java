package researchman1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author LeMinh
 *
 */
public class Researcher {

	private int id;
	private String name;
	private String gender;
	private int yob; // abbreviation for year of birth
	private String nationality;
	private Set<Publication> publications;

	public Researcher(int id, String name, String gender, int yob, String nationality, Set<Publication> publications) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.yob = yob;
		this.nationality = nationality;
		this.publications = publications;
	}

	/**
	 * returns the publication of this author with specified title
	 * 
	 * @param title
	 * @return
	 */
	public Publication getPublicationByTitle(String title) throws NullPointerException{
		for (Publication p : publications) {
			if (p.getTitle().equals(title)) {
				return p;
			}
		}
		return null;
	}

	/**
	 * returns if this author has a publication with specified title or not.
	 * 
	 * @param title
	 * @return
	 */
	public boolean hasPublication(String title) {
		for (Publication p : publications) {
			if (p.getTitle().equals(title)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * adds a new publication of this researcher
	 * 
	 * @param publication
	 * @throws NullPointerException
	 */
	public void addPublication(Publication publication) throws NullPointerException {
		publications.add(publication);
	}

	/**
	 * marks (remove) the publication with specified title as not written by this
	 * researcher.
	 * 
	 * @param title
	 */
	public void removePublication(String title) {
		for (Publication p : publications) {
			if (p.getTitle().equals(title)) {
				publications.remove(p);
				break;
			}
		}
	}

	/**
	 * show all publications written by this researcher
	 */
	public void showPublications() {
		System.out.println(
				"Researcher: <" + this.id + ", \"" + this.name + "\", '" + this.gender + "', " + this.yob + ", [");
		int count = publications.size();
		for (Publication p : this.publications) {
			if (p instanceof ResearchPaper && count != 1) {
				System.out.println("     ResearchPaper: " + p.toString() + ",");
			} else if (p instanceof ResearchPaper && count == 1) {
				System.out.println("     ResearchPaper: " + p.toString() + "]>");
			}
			if (p instanceof JournalArticle && count != 1) {
				System.out.println("     JournalArticle: " + p.toString() + ",");
			} else if (p instanceof JournalArticle && count == 1) {
				System.out.println("     JournalArticle: " + p.toString() + "]>");
			}
			count--;
		}
	}

	/**
	 * sorts the publication in the descending order of the book identifier
	 */
	public List<Publication> sort() {
		List<Publication> publicationList = new ArrayList<>(publications); // convert set to list
		Collections.sort(publicationList); // sort the publication list
		return publicationList;
	}

	/**
	 * show all publications written by this researcher in the descending order of
	 * the publication identifier
	 */
	public void showSortedPublications() {
		List<Publication> sortedList = sort();
		System.out.println(
				"Researcher: <" + this.id + ", \"" + this.name + "\", '" + this.gender + "', " + this.yob + ", [");
		int count = publications.size();
		for (Publication p : sortedList) {
			// check instance type of object p
			if (p instanceof ResearchPaper && count != 1) {
				System.out.println("     ResearchPaper: " + p.toString() + ",");
			} else if (p instanceof ResearchPaper && count == 1) {
				System.out.println("     ResearchPaper: " + p.toString() + "]>");
			}
			if (p instanceof JournalArticle && count != 1) {
				System.out.println("     JournalArticle: " + p.toString() + ",");
			} else if (p instanceof JournalArticle && count == 1) {
				System.out.println("     JournalArticle: " + p.toString() + "]>");
			}
			count--;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getYob() {
		return yob;
	}

	public void setYob(int yob) {
		this.yob = yob;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public Set<Publication> getPublications() {
		return publications;
	}

	public void setPublications(Set<Publication> publications) {
		this.publications = publications;
	}

}
