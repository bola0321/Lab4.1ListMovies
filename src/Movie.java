
public class Movie {
	private String title;
	private String category;
	
	public Movie (String title, String category) {
		this.setTitle(title);
		this.setCategory(category);
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Movie List Application!" + "\n");
		System.out.println("There are 100 movies in this list.");
		System.out.print("What category are you interested in? ");
	//TODO: grab movie list from GrandCircus Github, for loop to iterate through movie list
	//(loop located in exercise Car from 5/5/22 lecture
	// switch block using numbers rather than entering name for movie selection

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
