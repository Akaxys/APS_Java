import java.util.*;

public class Ataque {

   private String nome;
   private int dano;
   private int custoMana;
   private int probabilidade;
   private String fraseSucesso;
   private String fraseFalha;
   
   Scanner teclado = new Scanner(System.in);
   

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
      public static Ataque soco = new Ataque("Soco direto", 4, 0, 90,
      JavaQuest.player.getNome() + " acertou um belo soco no " + JavaQuest.player.getNome(), "errou o soco otario.");

      public static Ataque rasteira = new Ataque("Rasteira rápida", 6, 1, 75,
      JavaQuest.player.getNome() + " acabou escorregando ao atacar " + JavaQuest.player.getNome(), "errou o rasteira otario.");

      public static Ataque chute = new Ataque("Chute concentrado", 8, 4, 70,
      JavaQuest.player.getNome() + " acertou um chute nas costelas do " + JavaQuest.player.getNome(),"errou o chute otario");

      public static Ataque tiro = new Ataque("Tiro", 11, 7, 50,
      JavaQuest.player.getNome() + " acertou o tiro no busto do " + JavaQuest.player.getNome(),"errou o tiro otario");

      public static Ataque tiroAvancado = new Ataque("Tiro de Laser", 18, 12, 70,
      JavaQuest.player.getNome() + " acertou o tiro no inimigo", "Não carregou a arma");

      public static Ataque tiroCerteiro = new Ataque("Tiro Certeiro", 15, 10, 90,
      JavaQuest.player.getNome() + " acertou em cheio o tiro no inimigo", "Sua arma falhou e acabou engasgando com munição.");

      public static Ataque tiroConcentrado = new Ataque("Tiro de Franco Atirador", 20, 16, 75,
      JavaQuest.player.getNome() + " acertou em cheio o tiro no inimigo", " + Lorax deixou a munição cair");

      public static Ataque rajada = new Ataque("Tiro à queima-roupa", 18, 6, 100,
      JavaQuest.player.getNome() + " conclui a rajada com sucesso", " + Lorax queimou a mão");

      public static Ataque rajadaAvancado = new Ataque("Tiro incendiário", 20, 6, 34,
      JavaQuest.player.getNome() + " conclui a rajada avancada com sucesso", " + Lorax errou o alvo");

      public static Ataque apunhalada = new Ataque("Apunhalar", 15, 4, 60,
      JavaQuest.player.getNome() + " apunhalou o inimigo com sucesso", " + Lorax escorregou enquanto corria");

      public static Ataque apunhaladaAvancado = new Ataque("Corte profundo", 20, 9, 70,
      JavaQuest.player.getNome() + " apunhalou o inimigo com sucesso", " + Lorax não amolou a faca suficientemente");

      public static Ataque flecha = new Ataque("Flechada", 15, 4, 75,
      JavaQuest.player.getNome() + " acertou o alvo", " + Lorax errou o alvo");

      public static Ataque flechaMagica = new Ataque("Flechada Mágica", 20, 12, 50,
      JavaQuest.player.getNome() + " lembrou as palavras mágicas e acertou o encantamento", " + Lorax esqueceu as palavras mágicas e falhou no encantamento");

      public static Ataque flechaVenenosa = new Ataque("Flecha de Veneno", 25, 14, 80,
      JavaQuest.player.getNome() + " usou o veneno na hora certa! ", " + Lorax derramou o veneno no chão");

      public static Ataque tiroStun = new Ataque("Tiro Eletrizante", 20, 12, 60,
      JavaQuest.player.getNome() + " eletrocutou o inimigo", " + Lorax esqueceu de carregar a arma");
          
      public static Ataque Investida = new Ataque("Investida", 10, 7, 90,
      JavaQuest.player.getNome() + " teve uma investida foi muito bem sucedida", " + Lorax caiu enquanto tentava aplicar o ataque");

      public static Ataque cozinharGranada = new Ataque("Cozinhar Granada", 20, 14, 70,
      JavaQuest.player.getNome() + ",A granada foi extremamente eficaz", " + Sua granada falhou");

      public static Ataque granada = new Ataque("Arremessar Granada", 18, 8, 60,
      JavaQuest.player.getNome() + ", a granada foi extremamente eficaz", " + Lorax mirrou errado");

      public static Ataque impactoEletrico = new Ataque("Impacto Eletrico", 20, 15, 90,
      JavaQuest.player.getNome() + " concluiu o ataque com sucesso", " + Lorax enfiou o bastão no chão e comeu terra");

      public static Ataque arremessoLanca = new Ataque("Arremessar lança", 20, 9, 50,
      JavaQuest.player.getNome() + " arremessou a lança com sucesso", " + Lorax falhou no arremesso da lança");
          
      public static Ataque ataqueAncestral = new Ataque("Ataque Ancestral", 25, 9, 80,
      " acertou o ataque com sucesso", " + Lorax errou miseravelmente o ataque");

      public static Ataque fissuraAncestral = new Ataque("Fissura Ancestral", 40, 11, 90,
      JavaQuest.player.getNome() + " realizou a fissura e feriu o inimigo", " + Lorax fez uma fissura longe demais do inimigo");

      public static Ataque tiroCelestial = new Ataque("Tiro Celestial", 35, 8, 70,
      JavaQuest.player.getNome() + " acertou o tiro", " + Lorax errou o tiro");
          
      public static Ataque bombardeioCelestial = new Ataque("Bombardeio Celestial", 40, 13, 80,
      JavaQuest.player.getNome() + ", O bombardeio acertou em cheio", " + O Bombardeiro acertou alguns metros distante do inimigo");

      public static Ataque tiroVacuo = new Ataque("Tiro À Vácuo", 35, 7, 65,
      JavaQuest.player.getNome() + " acertou o tiro", " + Lorax errou o tiro") ; 
  
      public static Ataque gravidade30 = new Ataque("Gravidade 30", 50, 14, 90,
      JavaQuest.player.getNome() + " conseguiu usar sua habilidade gravitacional", " + Lorax não conseguiu usar sua habilidade gravitacional!") ; 

      public static Ataque impactoPrimordial = new Ataque("Impacto Primordial", 35, 10, 90,
      JavaQuest.player.getNome() + " deu um golpe certeiro com o martelo", " + Lorax bateu com o martelo torto no chão") ;

      public static Ataque terremotoPrimordial = new Ataque("Terremoto Primordial", 55, 16, 90,
      JavaQuest.player.getNome() + " causou um tremor inesquecivel", " + Lorax não teve forças suficientes") ; 

      public static Ataque cortesOrientais = new Ataque("Cortes Orientais", 35, 9, 90,
      JavaQuest.player.getNome() + " acertou o golpe", " + Lorax errou 1cm de distância ao aplicar o ataque.") ; 

      public static Ataque rasgarTerreno = new Ataque("Rasga-Chão", 55, 12, 95,
      JavaQuest.player.getNome() + " teve forças suficientes para concluir o ataque", " + Lorax não usou força suficiente para rasgar o terreno.") ; 

 
      // ArrayLists dos todos os Ataques 
      public static List<Ataque> Ataques = new ArrayList<>(Arrays.asList(soco, rasteira, chute, tiro, tiroAvancado, tiroCerteiro, 
      tiroConcentrado, rajada, rajadaAvancado, apunhalada, apunhaladaAvancado, flecha, flechaMagica, flechaVenenosa, tiroStun, 
      Investida, cozinharGranada, granada,impactoEletrico, arremessoLanca, ataqueAncestral, fissuraAncestral, tiroCelestial,
      bombardeioCelestial, tiroVacuo, gravidade30, impactoPrimordial, terremotoPrimordial, cortesOrientais, rasgarTerreno));

      public static List<Ataque> AtaquesPlayer = new ArrayList<>(Arrays.asList(soco, rasteira, chute, tiro));

      public static List<Ataque> AtaquesInimigos = new ArrayList<Ataque>();


      // Métodos para mexer nas ArrayLists 
      public static void adicionarAtaquesPlayer(Ataque x){
         AtaquesPlayer.add(x);
      }

      public static void adicionarAtaquesInimigos(Ataque w, Ataque x, Ataque y, Ataque z){
         AtaquesInimigos.clear();
         AtaquesInimigos.add(w);
         AtaquesInimigos.add(x);
         AtaquesInimigos.add(y);
         AtaquesInimigos.add(z);
      }

      public static void adicionarAtaquesInimigos(Ataque u, Ataque v, Ataque w, Ataque x, Ataque y, Ataque z){
         AtaquesInimigos.clear();
         AtaquesInimigos.add(u);
         AtaquesInimigos.add(v);
         AtaquesInimigos.add(w);
         AtaquesInimigos.add(x);
         AtaquesInimigos.add(y);
         AtaquesInimigos.add(z);
      }

}  

