package by.epam.library.entity;

public class Book extends PrintedEdition {
	public String author;
	private int publishedYear;

	public Book(String title, double price, String author, int publishedYear) {
		super(title, price);
		this.author = author;
		this.publishedYear = publishedYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + publishedYear;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (publishedYear != other.publishedYear)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getTitle() + ", " + getPrice() + ", " + author + ", " + publishedYear;
	}
}
