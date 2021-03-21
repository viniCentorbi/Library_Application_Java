package biblioteca_eletronica;
import java.util.ArrayList;
import java.util.Collections;

public class Livro {
    
    private String cod_livro;
    private String titulo;
    private String subtitulo;
    private String isbn;
    private String cdd;
    private String cod_autor;
    private String nome_autor;
    private String edicao;
    private String serie;
    private String volume;
    private int estoque;
    
    private String strCod_livro;
    private static int contLivro = 0; //Criando variável global para contar os livros

    
    
    private static ArrayList<Livro> livros = new ArrayList<>(); //Criando uma lista para os livros 
    
    public static ArrayList<Livro> getLivros() {
        return livros;
    }
    
    Livro (String titulo, String subtitulo, String isbn, String cdd, String cod_autor, String nome_autor, 
            String edicao, String serie, String volume, int estoque){
        
        
        strCod_livro = "CL"+String.valueOf(contLivro);
        
        this.cod_livro = strCod_livro;
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.isbn = isbn;
        this.cdd = cdd;
        this.cod_autor = cod_autor;
        this.nome_autor = nome_autor;
        this.edicao = edicao;
        this.serie = serie;
        this.volume = volume;
        this.estoque = estoque;        
    }
    
    public static void cadastrar_livro(String titulo, String subtitulo, String isbn, 
            String cdd, String cod_autor, String nome_autor, 
            String edicao, String serie, String volume, int estoque){
        
        Livro livro = new Livro(titulo,  subtitulo,  isbn,  cdd,  cod_autor,  nome_autor, 
             edicao,  serie,  volume,  estoque);
        
        livros.add(livro);
        
        contLivro ++;
    }
    
    public static void exibir_livros(){
        for (int i = 0; i < livros.size(); i++) {            
            System.out.println("============== Livro =============");
            System.out.println("Código: "+ livros.get(i).cod_livro);
            System.out.println("Título: "+ livros.get(i).titulo);   
            System.out.println("Subtítulo: "+ livros.get(i).subtitulo);
            System.out.println("ISBN: "+ livros.get(i).isbn);
            System.out.println("CDD: "+ livros.get(i).cdd);   
            System.out.println("Código autor: "+ livros.get(i).cod_autor);
            System.out.println("Nome autor: "+ livros.get(i).nome_autor);
            System.out.println("Edição: "+ livros.get(i).edicao);   
            System.out.println("Série: "+ livros.get(i).serie);
            System.out.println("Volume: "+ livros.get(i).volume);
            System.out.println("Estoque: "+ livros.get(i).estoque);     
        }
    }
    
    public static void pesquisar_cod_livro(String strCod_livro){
        
        boolean existencia = true;
        
        for (int i = 0; i < livros.size(); i++) {            
            if (strCod_livro.equals(livros.get(i).cod_livro)) {               
                System.out.println("============== Resultado da pesquisa =============");
                System.out.println("Código: "+ livros.get(i).cod_livro);
                System.out.println("Título: "+ livros.get(i).titulo);   
                System.out.println("Subtítulo: "+ livros.get(i).subtitulo);
                System.out.println("ISBN: "+ livros.get(i).isbn);
                System.out.println("CDD: "+ livros.get(i).cdd);   
                System.out.println("Código autor: "+ livros.get(i).cod_autor);
                System.out.println("Nome autor: "+ livros.get(i).nome_autor);
                System.out.println("Edição: "+ livros.get(i).edicao);   
                System.out.println("Série: "+ livros.get(i).serie);
                System.out.println("Volume: "+ livros.get(i).volume);
                System.out.println("Estoque: "+ livros.get(i).estoque);
                existencia = true;
                
                break;                               
            }else{
                existencia = false;
            }
        }        
        if (existencia == false) {
            System.out.println("============== Resultado da pesquisa =============");
            System.out.println("Livro não encontrado");  
        }
    }
    
    public static void editar_livro(String strCod_livro, String newTitulo, String newSubtitulo, String newIsbn, 
            String newCdd, String newCod_autor, String newNome_autor, String newEdicao, 
            String newSerie, String newVolume, int newEstoque){
        
        for (int i = 0; i < livros.size(); i++) {            
            if (strCod_livro.equals(livros.get(i).cod_livro)) {               
                
                livros.get(i).cod_livro = strCod_livro;
                livros.get(i).titulo = newTitulo;
                livros.get(i).subtitulo = newSubtitulo;
                livros.get(i).isbn = newIsbn;
                livros.get(i).cdd = newCdd;
                livros.get(i).cod_autor = newCod_autor;
                livros.get(i).nome_autor = newNome_autor;
                livros.get(i).edicao = newEdicao;
                livros.get(i).serie = newSerie;
                livros.get(i).volume = newVolume;
                livros.get(i).estoque = newEstoque;
                
            }
         }
    }
        
    public static void excluir_livro(String strCod_livro){
        for (int i = 0; i < livros.size(); i++) {            
            if (strCod_livro.equals(livros.get(i).cod_livro)) {               
                livros.remove(i);
            }
         }
    }
    
    // Campos encapsulados ================================================
    public void setCod_livro(String strCod_livro) {
        this.strCod_livro = cod_livro;
    }

    public String getStrCod_livro() {
        return strCod_livro;
    }
    
    
    
    public String getTitulo() {
        return titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    
    public String getIsbn() {
        return isbn;
    }

   
    public String getCdd() {
        return cdd;
    }

    
    public String getCod_autor() {
        return cod_autor;
    }

    
    public String getNome_autor() {
        return nome_autor;
    }

    
    public String getEdicao() {
        return edicao;
    }

    
    public String getSerie() {
        return serie;
    }

    
    public String getVolume() {
        return volume;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
      
}
