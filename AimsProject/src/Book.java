
public class Book {
	private String title;
	private String type;
	private String author;
	public int pageNumber;
	public int volume;
	public float cost;
	
	public Book() {

	}

	public Book(String title) {
		super();
		this.title = title;
	}

	public Book(String title, String type, String author, int pageNumber, int volume, float cost) {
		this.title = title;
		this.type = type;
		this.author = author;
		this.pageNumber = pageNumber;
		this.volume = volume;
		this.cost = cost;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

}
