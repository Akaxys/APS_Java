import java.util.*;

public class Defesa {

    private String nome;
    private int defesa;
    private int custoVigor;
    private int probabilidade;
    private String fraseSucesso;
    private String fraseFalha;

    Scanner teclado = new Scanner(System.in); 


        // Construtor
        public Defesa(String nome, int def, int vigor, int probabilidade, String sucesso, String falha) {
            this.nome = nome;
            this.defesa = def;
            this.custoVigor = vigor;
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
        public int getDefesa() {
            return defesa;
        }
        public void setDefesa(int def) {
            this.defesa = def;
        }
        
            // Custo Mana
        public int getCustoVigor() {
            return custoVigor;
        }
        public void setCustoVigor(int vigor) {
            this.custoVigor = vigor;
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

            // Frase Sucesso
        public String getFraseFalha() {
            return fraseFalha;
        }
        public void setFraseFalha(String frase) {
            this.fraseFalha = frase;
        }



        // TODOS as defesas
        public static Defesa defesaBasica = new Defesa("Defesa básica", 3, 1, 90, 
        "Concluiu a defesa com sucesso", "Fracassou na defesa!");

        public static Defesa levantarEscudo = new Defesa("Levantar Escudo", 5, 5, 75, 
        "Lorax levantou o escudo no tempo certo", "Lorax não levantou o escudo a tempo!");

        public static Defesa esquiva = new Defesa("Esquiva", 0, 1, 90, 
        "Concluiu a esquiva com sucesso", "Lorax scorregou enquanto tentava esquivar!");

        public static Defesa barreira = new Defesa("Conjurar Barreira", 20, 10, 60, 
        "Lorax conjurou a barreira a tempo", "Lorax foi impedido de conjurar barreira!");

        public static Defesa meditacao = new Defesa("Paz Interior", 50, 3, 10, 
        "Lorax conseguiu meditar e se concentrar para o próximo Defesa", "Lorax teve sua paz afetada e não conseguiu meditar!");

        public static Defesa barreiraAvancada = new Defesa("Conjurar Muralha", 30, 17, 60, 
        "Lorax conjurou a barreira com perfeição!", "Lorax se atrapalhou durante o processo!");

        public static Defesa armaduraAvancada = new Defesa("Armadura Militar", 18, 9, 80, 
        "A nanotecnologia agiu com eficácia", "A nanotecnologia não foi ativada rapidamente");

        public static Defesa defesaMagica = new Defesa("Proteção Mágica", 15, 8, 85, 
        "Lorax agiu como um mago profissional!", "Lorax esqueceu as palavrinhas mágicas!");

        public static Defesa defesaRapidaAvancada = new Defesa("Movimentos Agéis", 36, 18, 70, 
        "Lorax foi agil e concluiu a defesa com sucesso", "Lorax caiu envergonhosamente enquanto tentava se defender!");

        public static Defesa juggernaut = new Defesa("Esfera de proteção", 40, 12, 60, 
        "Esfera de proteção criada com successo", "Não conseguiu resistir ao Defesa!");
 
        public static Defesa auraCosmica = new Defesa("Proteção Estelar", 80, 10, 80, 
        "Lorax se defendeu com sucesso", "Lorax não conseguiu carregar a aura a tempo!");

        public static Defesa armaduraEspectral = new Defesa("Defesa Espectral", 70, 15, 85, 
        "Lorax convocou espectros suficientes para a defesa", "Não conseguiu convocar espectros suficientes para a defesa!");

        public static Defesa kryptoDefesa = new Defesa("Krypto Defesa", 60, 10, 90, 
        "A Kryptonita agiu perfeitamente!", "A armadura crypto atrapalhou na defesa de Lorax!");

        public static Defesa exoesqueleto = new Defesa("Imunidade Subatômica", 75, 10, 85, 
        "O exosqueleto agiu com eficácia", "O exoesqueleto não o deixou vulneravel a tempo!");

        public static Defesa netherite = new Defesa("Blindagem de Netherite", 75, 15, 95, 
        "A blindagem de Netherite  defendeu o Defesa", "Lorax não percebeu o Defesa!");

        
        
        public static ArrayList<Defesa> Defesa = new ArrayList<>(Arrays.asList(defesaBasica, levantarEscudo, esquiva, barreira, 
        meditacao, barreiraAvancada, armaduraAvancada, defesaMagica, defesaRapidaAvancada, juggernaut, auraCosmica, armaduraEspectral,
        kryptoDefesa, exoesqueleto, netherite));

        public static ArrayList<Defesa> DefesasPlayer = new ArrayList<>(Arrays.asList(defesaBasica, levantarEscudo, esquiva));

        public static ArrayList<Defesa> DefesasInimigos = new ArrayList<>(Arrays.asList(defesaBasica, levantarEscudo, esquiva));


        // Métodos para mexer nas ArrayLists 
      public static void adicionarDefesasPlayer(Defesa x){
        DefesasPlayer.add(x);
     }

     public static void limparDefesasInimigos(){
        DefesasPlayer.clear();
     }

     public static void adicionarDefesasInimigos(Defesa x, Defesa y, Defesa z){
        DefesasInimigos.add(x);
        DefesasInimigos.add(y);
        DefesasInimigos.add(z);
     }

     public static void adicionarDefesasInimigos(Defesa v, Defesa w, Defesa x, Defesa y, Defesa z){
        DefesasInimigos.add(v);
        DefesasInimigos.add(w);
        DefesasInimigos.add(x);
        DefesasInimigos.add(y);
        DefesasInimigos.add(z);
     }



    public static ArrayList<Defesa> getDefesasPlayer() {
        return DefesasPlayer;
    }

    public static ArrayList<Defesa> getDefesasInimigos() {
        return DefesasInimigos;
    }   
}

