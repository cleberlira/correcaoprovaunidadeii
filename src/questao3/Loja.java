package questao3;

public class Loja {

	private String nome; 
	private String ramo;
	private int anoFundacao;
    private Vendedor vendedor;
	
    public Loja() {
    	vendedor = new Vendedor();
    }
    
    public void admitirVendedor() {
    	
    }
    
    
    public void demitirVendedor() {
    	
    }
    
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public int getAnoFundacao() {
		return anoFundacao;
	}
	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}
}
