package biblioteca_eletronica;

public class Endereco {
    
    private String rua;
    private String numero_endereco;
    private String bairro;
    private String complemento;
    private String cep;
    private String cidade;
    private String uf;

    Endereco(String rua, String numero, String bairro, String complemento, String cep, String cidade, String uf){
        
        this.rua = rua;
        this.numero_endereco = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        
    }
    public static void cadastrarEndereco(String rua, String numero, String bairro, String complemento, 
        String cep, String cidade, String uf){
        
        Endereco endereco = new Endereco(rua, numero, bairro, complemento, cep, cidade, uf);
        
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero_endereco(String numero_endereco) {
        this.numero_endereco = numero_endereco;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
        
    public String getRua() {
        return rua;
    }    
    public String getNumero_endereco() {
        return numero_endereco;
    }    
    public String getBairro() {
        return bairro;
    }    
    public String getComplemento() {
        return complemento;
    }    
    public String getCep() {
        return cep;
    }    
    public String getCidade() {
        return cidade;
    }
    public String getUf() {
        return uf;
    }
}
