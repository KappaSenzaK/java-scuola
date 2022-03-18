
public class Libro {
	private String titolo;
	private String isbn;
	public Libro(String titolo, String isbn) {
		this.titolo = titolo;
		this.isbn = isbn;
	}
	
	public String getTitolo() {
		return this.titolo;
	}
	
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Libro [titolo=" + titolo + ", isbn=" + isbn + "]";
	}
	
	
	
	
}
