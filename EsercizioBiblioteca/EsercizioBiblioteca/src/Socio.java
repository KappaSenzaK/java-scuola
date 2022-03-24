

public class Socio {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	public Socio(String nome, String cognome, String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	@Override
	public String toString() {
		return "Socio [nome=" + nome + ", cognome=" + cognome + ", codiceFiscale=" + codiceFiscale + "]";
	}
	
	
	
}
