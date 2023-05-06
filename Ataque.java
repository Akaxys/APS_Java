import java.util.*;

public class Ataque {

   private String nome;
   private int dano;
   private int custoMana;
   private int probabilidade;
   private String fraseSucesso;
   private String fraseFalha;
   
   Scanner teclado = new Scanner(System.in);
   static Personagem player = JavaQuest.getPlayer();
   static Inimigo inimigo = JavaQuest.getEnemy();

   

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

      // Frase falha
      public String getFraseFalha() {
         return fraseFalha;
      }
      public void setFraseFalha(String frase) {
         this.fraseFalha = frase;
      }



      // TODOS os ataques
      static Ataque soco = new Ataque("Soco direto", 4, 0, 90,
      player.getNome() + " acertou um belo soco no " + player.getNome(), "errou o soco otario.");

      static Ataque rasteira = new Ataque("Rasteira rápida", 6, 1, 75,
      player.getNome() + " acabou escorregando ao atacar " + player.getNome(), "errou o rasteira otario.");

      static Ataque chute = new Ataque("Chute concentrado", 8, 4, 60,
      player.getNome() + " acertou um chute nas costelas do " + player.getNome(),"errou o chute otario");

      static Ataque tiro = new Ataque("Tiro", 11, 7, 50,
      player.getNome() + " acertou o tiro no busto do " + player.getNome(),"errou o tiro otario");

      static Ataque tiroAvancado = new Ataque("Tiro de Laser", 18, 12, 70,
      player.getNome() + " acertou o tiro no inimigo", "Não carregou a arma");

      static Ataque tiroCerteiro = new Ataque("Tiro Certeiro", 15, 10, 90,
      player.getNome() + " acertou em cheio o tiro no inimigo", "Sua arma falhou e acabou engasgando com munição.");

      static Ataque tiroConcentrado = new Ataque("Tiro de Franco Atirador", 20, 16, 75,
      player.getNome() + " acertou em cheio o tiro no inimigo", " + Lorax deixou a munição cair");

      static Ataque rajada = new Ataque("Tiro à queima-roupa", 18, 6, 100,
      player.getNome() + " conclui a rajada com sucesso", " + Lorax queimou a mão");

      static Ataque rajadaAvancado = new Ataque("Tiro incendiário", 20, 6, 34,
      player.getNome() + " conclui a rajada avancada com sucesso", " + Lorax errou o alvo");

      static Ataque apunhalada = new Ataque("Apunhalar", 15, 4, 60,
      player.getNome() + " apunhalou o inimigo com sucesso", " + Lorax escorregou enquanto corria");

      static Ataque apunhaladaAvancado = new Ataque("Corte profundo", 20, 9, 70,
      player.getNome() + " apunhalou o inimigo com sucesso", " + Lorax não amolou a faca suficientemente");

      static Ataque flecha = new Ataque("Flechada", 15, 4, 75,
      player.getNome() + " acertou o alvo", " + Lorax errou o alvo");

      static Ataque flechaMagica = new Ataque("Flechada Mágica", 20, 12, 50,
      player.getNome() + " lembrou as palavras mágicas e acertou o encantamento", " + Lorax esqueceu as palavras mágicas e falhou no encantamento");

      static Ataque flechaVenenosa = new Ataque("Flecha de Veneno", 25, 14, 80,
      player.getNome() + " usou o veneno na hora certa! ", " + Lorax derramou o veneno no chão");

      static Ataque tiroStun = new Ataque("Tiro Eletrizante", 20, 12, 60,
      player.getNome() + " eletrocutou o inimigo", " + Lorax esqueceu de carregar a arma");
          
      static Ataque Investida = new Ataque("Investida", 10, 7, 90,
      player.getNome() + " teve uma investida foi muito bem sucedida", " + Lorax caiu enquanto tentava aplicar o ataque");

      static Ataque cozinharGranada = new Ataque("Cozinhar Granada", 20, 14, 70,
      player.getNome() + ",A granada foi extremamente eficaz", " + Sua granada falhou");

      static Ataque granada = new Ataque("Arremessar Granada", 18, 8, 60,
      player.getNome() + ", a granada foi extremamente eficaz", " + Lorax mirrou errado");

      static Ataque impactoEletrico = new Ataque("Impacto Eletrico", 20, 15, 90,
      player.getNome() + " concluiu o ataque com sucesso", " + Lorax enfiou o bastão no chão e comeu terra");

      static Ataque arremessoLanca = new Ataque("Arremessar lança", 20, 9, 50,
      player.getNome() + " arremessou a lança com sucesso", " + Lorax falhou no arremesso da lança");
          
      static Ataque ataqueAncestral = new Ataque("Ataque Ancestral", 25, 9, 80,
      " acertou o ataque com sucesso", " + Lorax errou miseravelmente o ataque");

      static Ataque fissuraAncestral = new Ataque("Fissura Ancestral", 40, 11, 90,
      player.getNome() + " realizou a fissura e feriu o inimigo", " + Lorax fez uma fissura longe demais do inimigo");

      static Ataque tiroCelestial = new Ataque("Tiro Celestial", 35, 8, 70,
      player.getNome() + " acertou o tiro", " + Lorax errou o tiro");
          
      static Ataque bombardeioCelestial = new Ataque("Bombardeio Celestial", 40, 13, 80,
      player.getNome() + ", O bombardeio acertou em cheio", " + O Bombardeiro acertou alguns metros distante do inimigo");

      static Ataque tiroVacuo = new Ataque("Tiro À Vácuo", 35, 7, 65,
      player.getNome() + " acertou o tiro", " + Lorax errou o tiro") ; 
  
      static Ataque gravidade30 = new Ataque("Gravidade 30", 50, 14, 90,
      player.getNome() + " conseguiu usar sua habilidade gravitacional", " + Lorax não conseguiu usar sua habilidade gravitacional!") ; 

      static Ataque impactoPrimordial = new Ataque("Impacto Primordial", 35, 10, 90,
      player.getNome() + " deu um golpe certeiro com o martelo", " + Lorax bateu com o martelo torto no chão") ;

      static Ataque terremotoPrimordial = new Ataque("Terremoto Primordial", 55, 16, 90,
      player.getNome() + " causou um tremor inesquecivel", " + Lorax não teve forças suficientes") ; 

      static Ataque cortesOrientais = new Ataque("Cortes Orientais", 35, 9, 90,
      player.getNome() + " acertou o golpe", " + Lorax errou 1cm de distância ao aplicar o ataque.") ; 

      static Ataque rasgarTerreno = new Ataque("Rasga-Chão", 55, 12, 95,
      player.getNome() + " teve forças suficientes para concluir o ataque", " + Lorax não usou força suficiente para rasgar o terreno.") ; 

 
      // ArrayLists dos todos os Ataques 
      public static List<Ataque> Ataques = new ArrayList<>(Arrays.asList(soco, rasteira, chute, tiro, tiroAvancado, tiroCerteiro, 
      tiroConcentrado, rajada, rajadaAvancado, apunhalada, apunhaladaAvancado, flecha, flechaMagica, flechaVenenosa, tiroStun, 
      Investida, cozinharGranada, granada,impactoEletrico, arremessoLanca, ataqueAncestral, fissuraAncestral, tiroCelestial,
      bombardeioCelestial, tiroVacuo, gravidade30, impactoPrimordial, terremotoPrimordial, cortesOrientais, rasgarTerreno));

      public static List<Ataque> AtaquesPlayer = new ArrayList<>(Arrays.asList(soco, rasteira, chute));

      public static List<Ataque> AtaquesInimigos = new ArrayList<Ataque>();


      // Métodos para mexer nas ArrayLists 
      public static void adicionarAtaquesPlayer(Ataque x){
         AtaquesPlayer.add(x);
      }

      public static void limparAtaquesInimigos(){
         AtaquesPlayer.clear();
      }

      public static void adicionarAtaquesInimigos(Ataque x, Ataque y, Ataque z){
         AtaquesInimigos.add(x);
         AtaquesInimigos.add(y);
         AtaquesInimigos.add(z);
      }

      public static void adicionarAtaquesInimigos(Ataque v, Ataque w, Ataque x, Ataque y, Ataque z){
         AtaquesInimigos.add(v);
         AtaquesInimigos.add(w);
         AtaquesInimigos.add(x);
         AtaquesInimigos.add(y);
         AtaquesInimigos.add(z);
      }

}  

