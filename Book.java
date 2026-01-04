public class Book{
	private String title;
	private Author author;
	private int pages;

	public Book(String title , Author author, int pages){
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	public String getTitle(){
		return this.title;
	}

	public int getPages(){
		return this.pages;
	}
	
	public Author getAuthor(){
		return this.author;
	}
	
	public void setTitle(String title){
		this.title=title;
	}

	public void setPage(int pages){
		this.pages=pages;
	}
	
	public String toString(){
		return "Name of the book : "+this.getTitle()+"\nAuthor of the book : "+author.toString()+"\nNumber of pages in the book : "+this.getPages();
	}
}