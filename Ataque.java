import java.util.*;

public class Ataque {

   private String nome;
   private int dano;
   private int custoMana;
   private int probabilidade;
   private String fraseSucesso;
   private String fraseFalha;
   
   Scanner teclado = new Scanner(System.in);
   Personagem player = new Personagem(30);
   Inimigo inimigo = new Inimigo("inimigo", 50);


      // Construtor
      public Ataque(String nome, int dano, int mana, int probabilidade, String sucesso, String falha) {
         this.nome = nome;
         this.dano = dano;
         this.custoMana = mana;
         this.probabilidade = probabilidade;
         this.fraseSucesso = sucesso;
         this.fraseFalha = falha;
         }
        
         // Nome
      public String getNome() {
         return nome;
      }
      public void setNome(String nome) {
         this.nome = nome;
      }
        
         // Dano
      public int getDano() {
         return dano;
      }
      public void setDano(int damage) {
         this.dano = damage;
      }
        
         // Custo Mana
      public int getCustoMana() {
         return custoMana;
      }
      public void setCustoMana(int mana) {
         this.custoMana = mana;
      }
        
         // Probabilidade
      public int getProbabilidade() {
         return probabilidade;
      }
      public void setProbabilidade(int range) {
         this.probabilidade = range;
      }
        
         // Frase Sucesso
      public String getFraseSucesso() {
         return fraseSucesso;
      }
      public void setFraseSucesso(String frase) {
         this.fraseSucesso = frase;
      }

      // Get e Set da frase de sucesso
      public String getFraseFalha() {
         return fraseFalha;
      }
      public void setFraseFalha(String frase) {
         this.fraseFalha = frase;
      }



      // Ataques listados um a um
      
      
      
      // ArrayLists dos todos os Ataques 
      public static List<Ataque> Ataques = new ArrayList<Ataque>();

      public static List<Ataque> AtaquesPlayer = new ArrayList<Ataque>();
  
      public static List<Ataque> AtaquesInimigo = new ArrayList<Ataque>();

     
      // Métodos para adicionar ataques em ArrayLists
      public static void adicionarAtaques(Ataque x){
         Ataques.add(x);
      }

      public static void adicionarAtaquesPlayer(Ataque x){
         AtaquesPlayer.add(x);
      }

      public static void adicionarAtaquesInimigos(Ataque x){
         AtaquesInimigo.add(x);
      }

}  

