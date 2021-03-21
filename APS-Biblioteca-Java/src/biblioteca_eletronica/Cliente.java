package biblioteca_eletronica;
import java.util.ArrayList;
import java.util.Collections;

public class Cliente {
    
    private String cod_cliente;
    private String nome_cliente;
    private String sobrenome;
    private String cpf;
    private String dt_nascimento;
    private Endereco endereco;
    private String telefone;
    private String situacao;    
    
    private String strCod_cliente;
    private static int contCliente = 0; //Criando variável global para contar os clientes    
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();//Criando uma lista para os clientes   

    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    
    // Criando construtor da classe cliente
    Cliente  (String cpf, String nome_cliente, String sobrenome, String dt_nascimento, String telefone, 
            String situacao, String rua, String numero, String bairro, String complemento, String cep, 
            String cidade, String uf){
       
        
        strCod_cliente = "CC"+String.valueOf(contCliente);
        
        this.endereco = new Endereco(rua, numero, bairro, complemento, cep, cidade, uf);
        
        this.cod_cliente = strCod_cliente;
        this.cpf = cpf;
        this.nome_cliente = nome_cliente;
        this.sobrenome = sobrenome;
        this.dt_nascimento = dt_nascimento;
        this.telefone = telefone;
        this.situacao = situacao;   
        
    }    
        
    //Método static para cadastrar cliente ========================================================
    public static void cadastrar_cliente(String cpf, String nome_cliente, String sobrenome, String dt_nascimento, 
        String telefone,String situacao, String rua, String numero, String bairro, String complemento, String cep, 
        String cidade, String uf){
        
        Cliente cliente = new Cliente(cpf,  nome_cliente,  sobrenome,  dt_nascimento, telefone, 
        situacao, rua, numero, bairro, complemento, cep, cidade, uf ); 
        clientes.add(cliente);
        
        contCliente ++;        
    }
    //==============================================================================================
    
    //Método static para imprimir os clientes =====================================================
    public static void exibir_cliente(){        
        
        for (int i = 0; i < clientes.size(); i++) {
            
            System.out.println("============== Cliente =============");
            System.out.println("Código: "+ clientes.get(i).strCod_cliente);
            System.out.println("Nome: "+ clientes.get(i).nome_cliente);   
            System.out.println("Sobrenome: "+ clientes.get(i).sobrenome);
            System.out.println("CPF: "+ clientes.get(i).cpf);
            System.out.println("Data de nascimento: "+ clientes.get(i).dt_nascimento);
            System.out.println("Telefone: "+ clientes.get(i).telefone);
            System.out.println("Situação: "+ clientes.get(i).situacao);
            System.out.println("=========== Endereço Cliente =======");
            System.out.println("Rua: "+clientes.get(i).endereco.getRua());
            System.out.println("Número: "+clientes.get(i).endereco.getNumero_endereco());
            System.out.println("Bairro: "+clientes.get(i).endereco.getBairro());           
            System.out.println("Complemento: "+clientes.get(i).endereco.getComplemento());
            System.out.println("CEP: "+clientes.get(i).endereco.getCep());
            System.out.println("Cidade: "+clientes.get(i).endereco.getCidade());
            System.out.println("UF: "+clientes.get(i).endereco.getUf());
        }
    }
    //==============================================================================================
   
    //Método static para pesquisar os clientes pelo seu código =====================================
    public static void pesquisar_cod_cliente(String strCod_cliente) {        
        boolean existencia = true;
        
        for (int i = 0; i < clientes.size(); i++) {            
            if (strCod_cliente.equals(clientes.get(i).strCod_cliente)) {               
                System.out.println("============== Resultado da pesquisa =============");
                System.out.println("Código: "+ clientes.get(i).cod_cliente);
                System.out.println("Nome: "+ clientes.get(i).nome_cliente);   
                System.out.println("Sobrenome: "+ clientes.get(i).sobrenome);
                System.out.println("CPF: "+ clientes.get(i).cpf);
                System.out.println("Data de nascimento: "+ clientes.get(i).dt_nascimento);
                System.out.println("Telefone: "+ clientes.get(i).telefone);
                System.out.println("Situação: "+ clientes.get(i).situacao);
                System.out.println("=========== Endereço Cliente =======");
                System.out.println("Rua: "+clientes.get(i).endereco.getRua());
                System.out.println("Número: "+clientes.get(i).endereco.getNumero_endereco());
                System.out.println("Bairro: "+clientes.get(i).endereco.getBairro());           
                System.out.println("Complemento: "+clientes.get(i).endereco.getComplemento());
                System.out.println("CEP: "+clientes.get(i).endereco.getCep());
                System.out.println("Cidade: "+clientes.get(i).endereco.getCidade());
                System.out.println("UF: "+clientes.get(i).endereco.getUf());
                
                existencia = true;
                
                break;                               
            }else{
                existencia = false;
            }
        }        
        if (existencia == false) {
            System.out.println("============== Resultado da pesquisa =============");
            System.out.println("Cliente não encotrado");  
        }        
    }
    
    public static void editar_cliente(String strCod_cliente, String newNome, String newSobrenome, String newcpf, 
            String newDt_nascimento, String newTelefone,String newSituacao, String newRua, String newNumero, 
            String newBairro, String newComplemento, String newCep, String newCidade, String newUf ){
        
         for (int i = 0; i < clientes.size(); i++) {            
            if (strCod_cliente.equals(clientes.get(i).cod_cliente)) {               
                clientes.get(i).cod_cliente = strCod_cliente;
                clientes.get(i).nome_cliente = newNome;   
                clientes.get(i).sobrenome = newSobrenome;
                clientes.get(i).cpf = newcpf;
                clientes.get(i).dt_nascimento = newDt_nascimento;
                clientes.get(i).telefone = newTelefone;
                clientes.get(i).situacao = newSituacao;
                clientes.get(i).endereco.setRua(newRua);
                clientes.get(i).endereco.setNumero_endereco(newNumero);
                clientes.get(i).endereco.setBairro(newBairro);
                clientes.get(i).endereco.setComplemento(newComplemento);
                clientes.get(i).endereco.setCep(newCep);
                clientes.get(i).endereco.setCidade(newCidade);
                clientes.get(i).endereco.setUf(newUf);            
                
            }
         }
    }
    
    public static void excluir_cliente(String strCod_cliente){
        for (int i = 0; i < clientes.size(); i++) {            
            if (strCod_cliente.equals(clientes.get(i).cod_cliente)) {               
                clientes.remove(i);
            }
         }
    }
    
    //Método para alugar um livro
    public static void alocar_livro(String cod_cliente, String Cod_livro, String data_locacao){
        boolean verificacao = true;        
        
        for (int i = 0; i < clientes.size(); i++){ //For para percorrer o ArrayList "clientes"            
            
            if (cod_cliente.equals(clientes.get(i).cod_cliente)){ //Verificando se o código do cliente inserido existe no ArrayList "clientes"                
                
                if (clientes.get(i).situacao.equals("Não Pendente")){// Verificando se o cliente possui algum livro pendente
                    
                    for (int j = 0; j < Livro.getLivros().size(); j++){ //For para percorrer o ArrayList "livros" da classe Livro

                        if(Cod_livro.equals(Livro.getLivros().get(j).getStrCod_livro())){ //Verificando se o nome do livro inserido existe no ArrayList "livros" da classe Livro 
                            int estoque_livro = Livro.getLivros().get(j).getEstoque(); //Atribuindo na variável "estoque_livro"
                            

                            if(estoque_livro > 0){
                                estoque_livro --;
                                Livro.getLivros().get(j).setEstoque(estoque_livro);
                                
                                System.out.println("Livro alugado com sucesso");
                                System.out.println("Estoque atual: "+estoque_livro);
                            }else{
                                System.out.println("Livro sem estoque");
                            }

                        }else{
                            System.out.println("Livro não encontrado");
                        }
                    }
                }else{
                    System.out.println("Não é possível alugar um livro, pois este cliente possui livros pendentes");
                }
                
                verificacao = true;
                break;
                
            }else{
                verificacao = false;
                
            }
        }
        
        if (verificacao == false){
            System.out.println("Cliente não encontrado");
        }
    }
    
    
    public static void devolver_livro(String cod_cliente, String Cod_livro){
        
        boolean verificacao = true;        
        
        for (int i = 0; i < clientes.size(); i++){ //For para percorrer o ArrayList "clientes"            
            
            if (cod_cliente.equals(clientes.get(i).cod_cliente)){ //Verificando se o código do cliente inserido existe no ArrayList "clientes"                
                
                if (clientes.get(i).situacao.equals("Não Pendente")){// Verificando se o cliente possui algum livro pendente
                    
                    for (int j = 0; j < Livro.getLivros().size(); j++){ //For para percorrer o ArrayList "livros" da classe Livro

                        if(Cod_livro.equals(Livro.getLivros().get(j).getStrCod_livro())){ //Verificando se o nome do livro inserido existe no ArrayList "livros" da classe Livro 
                            int estoque_livro = Livro.getLivros().get(j).getEstoque(); //Atribuindo na variável "estoque_livro"
                            
                            

                            if(estoque_livro > 0){
                                estoque_livro ++;
                                Livro.getLivros().get(j).setEstoque(estoque_livro);
                                System.out.println("Livro devolvido com sucesso");
                                System.out.println("Estoque atual: "+estoque_livro);
                            }else{
                                System.out.println("Livro sem estoque");
                            }

                        }else{
                            System.out.println("Livro não encontrado");
                        }
                    }
                }else{
                    System.out.println("Não é possível alugar um livro, pois este cliente possui livros pendentes");
                }
                
                verificacao = true;
                break;
                
            }else{
                verificacao = false;
                
            }
        }
        
        if (verificacao == false){
            System.out.println("Cliente não encontrado");
        }
    }

    
    //Campos encapsulados=======================================================
    
    public String getCod_cliente() {
        return cod_cliente;
    }

    
    public String getCpf() {
        return cpf;
    }
    
    
    public String getNome_cliente() {
        return nome_cliente;
    }

    
    public String getSobrenome() {
        return sobrenome;
    }

    
    public String getDt_nascimento() {
        return dt_nascimento;
    }

    
    public Endereco getEndereco() {
        return endereco;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public String getSituacao() {
        return situacao;
    }
    
    
    public void setCod_cliente(String strCod_cliente) {
        this.strCod_cliente = cod_cliente;
    }
  
    public static int getContCliente() {
        return contCliente;
    }
    
    
}
