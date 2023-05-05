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

        Defesa DefesaBasica = new Defesa("Defesa básica", 3, 1, 90, 
        "Concluiu a defesa com sucesso", "Fracassou na defesa!");

        Defesa LevantarEscudo = new Defesa("Levantar Escudo", 5, 5, 75, 
        "Lorax levantou o escudo no tempo certo", "Lorax não levantou o escudo a tempo!");

        Defesa Esquiva = new Defesa("Esquiva", 0, 1, 90, 
        "Concluiu a esquiva com sucesso", "Lorax scorregou enquanto tentava esquivar!");

        Defesa Barreira = new Defesa("Conjurar Barreira", 20, 10, 60, 
        "Lorax conjurou a barreira a tempo", "Lorax foi impedido de conjurar barreira!");

        Defesa Meditação = new Defesa("Paz Interior", 50, 3, 10, 
        "Lorax conseguiu meditar e se concentrar para o próximo ataque", "Lorax teve sua paz afetada e não conseguiu meditar!");

        Defesa BarreiraAvançada = new Defesa("Conjurar Muralha", 30, 17, 60, 
        "Lorax conjurou a barreira com perfeição!", "Lorax se atrapalhou durante o processo!");

        Defesa ArmaduraAvançado = new Defesa("Armadura Militar", 18, 9, 80, 
        "A nanotecnologia agiu com eficácia", "A nanotecnologia não foi ativada rapidamente");

        Defesa DefesaMágica = new Defesa("Proteção Mágica", 15, 8, 85, 
        "Lorax agiu como um mago profissional!", "Lorax esqueceu as palavrinhas mágicas!");

        Defesa DefesaRapidaAvançada = new Defesa("Movimentos Agéis", 36, 18, 70, 
        "Lorax foi agil e concluiu a defesa com sucesso", "Lorax caiu envergonhosamente enquanto tentava se defender!");

        Defesa Juggernaut = new Defesa("Esfera de proteção", 40, 12, 60, 
        "Esfera de proteção criada com successo", "Não conseguiu resistir ao ataque!");

        // Defesas Lendárias 
        Defesa AuraCosmica = new Defesa("Proteção Estelar", 80, 10, 80, 
        "Lorax se defendeu com sucesso", "Lorax não conseguiu carregar a aura a tempo!");

        Defesa ArmaduraEspectral = new Defesa("Defesa Espectral", 70, 15, 85, 
        "Lorax convocou espectros suficientes para a defesa", "Não conseguiu convocar espectros suficientes para a defesa!");

        Defesa KryptoDefesa = new Defesa("Krypto Defesa", 60, 10, 90, 
        "A Kryptonita agiu perfeitamente!", "A armadura crypto atrapalhou na defesa de Lorax!");

        Defesa Exoesqueleto = new Defesa("Imunidade Subatômica", 75, 10, 85, 
        "O exosqueleto agiu com eficácia", "O exoesqueleto não o deixou vulneravel a tempo!");

        Defesa Netherite = new Defesa("Blindagem de Netherite", 75, 15, 95, 
        "A blindagem de Netherite  defendeu o ataque", "Lorax não percebeu o ataque!");

        
        public static ArrayList<Object> Defesa = new ArrayList<Object>();

        public static ArrayList<Object> DefesaPlayer = new ArrayList<Object>();

        public static ArrayList<Object> DefesaInimigo = new ArrayList<Object>();



        
}

