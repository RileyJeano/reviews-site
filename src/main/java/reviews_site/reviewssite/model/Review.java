package reviews_site.reviewssite.model;

public class Review {
	private long id;
	private String title;
	private String image;
	private String category;
	private String content;
	private String date;

	public Review(long id, String title, String image, String category, String content, String date) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.category = category;
		this.content = content;
		this.date = date;
	}

	public Review(long id) {
		super();
		this.id = id;
		this.title = "Greg's Christmas Sweater";
		this.image = "";
		this.category = "Holidays";
		this.content = "Oh greg... oh greg... no...";
		this.date = "December 26";
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

}
