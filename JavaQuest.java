import java.util.*;


public class JavaQuest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tBem-Vindo(a) ao JavaQuest!");

        System.out.println("A última arvore corre perigo, se apresse para salva-la!");

        System.out.println("Digite o nome do seu personagem: ");
        String nome_player = scanner.nextLine();

        // ------------------------------------------------------------------------------ //
      
        Personagem player = new Personagem(nome_player);

        // ------------------------------------------------------------------------------ //

        Inimigo soldado = new Inimigo("Soldado", 0);

        // ------------------------------------------------------------------------------ //
        
        // Ataques básicos

        Ataque soco = new Ataque("Soco direto", 4, 0, 90,
        player.getNome() + " acertou um belo soco no " + player.getNome(), "errou o soco otario.");

        Ataque rasteira = new Ataque("Rasteira rápida", 6, 1, 75,
        player.getNome() + " acabou escorregando ao atacar " + player.getNome(), "errou o rasteira otario.");

        Ataque chute = new Ataque("Chute concentrado", 8, 4, 60,
        player.getNome() + " acertou um chute nas costelas do " + player.getNome(),"errou o chute otario");

        Ataque tiro = new Ataque("Tiro", 11, 7, 50,
        player.getNome() + " acertou o tiro no busto do " + player.getNome(),"errou o tiro otario");

        Ataque tiro_avancado = new Ataque("Tiro de Laser", 18, 12, 70,
        player.getNome() + " acertou o tiro no inimigo", "Não carregou a arma");

        Ataque tiro_certeiro = new Ataque("Tiro Certeiro", 15, 10, 90,
        player.getNome() + " acertou em cheio o tiro no inimigo", "Sua arma falhou e acabou engasgando com munição.");

        Ataque tiro_concentrado = new Ataque("Tiro de Franco Atirador", 20, 16, 75,
        player.getNome() + " acertou em cheio o tiro no inimigo", " + Lorax deixou a munição cair");

        Ataque rajada = new Ataque("Tiro à queima-roupa", 18, 6, 100,
        player.getNome() + " conclui a rajada com sucesso", " + Lorax queimou a mão");

        Ataque rajada_avancado = new Ataque("Tiro incendiário", 20, 6, 34,
        player.getNome() + " conclui a rajada avancada com sucesso", " + Lorax errou o alvo");

        Ataque apunhalada = new Ataque("Apunhalar", 15, 4, 60,
        player.getNome() + " apunhalou o inimigo com sucesso", " + Lorax escorregou enquanto corria");

        Ataque apunhalada_avancado = new Ataque("Corte profundo", 20, 9, 70,
        player.getNome() + " apunhalou o inimigo com sucesso", " + Lorax não amolou a faca suficientemente");

        Ataque flecha = new Ataque("Flechada", 15, 4, 75,
        player.getNome() + " acertou o alvo", " + Lorax errou o alvo");

        Ataque flecha_magica = new Ataque("Flechada Mágica", 20, 12, 50,
        player.getNome() + " lembrou as palavras mágicas e acertou o encantamento", " + Lorax esqueceu as palavras mágicas e falhou no encantamento");

        Ataque flecha_venenosa = new Ataque("Flecha de Veneno", 25, 14, 80,
        player.getNome() + " usou o veneno na hora certa! ", " + Lorax derramou o veneno no chão");

        Ataque tiro_stun = new Ataque("Tiro Eletrizante", 20, 12, 60,
        player.getNome() + " eletrocutou o inimigo", " + Lorax esqueceu de carregar a arma");
            
        Ataque Investida = new Ataque("Investida", 10, 7, 90,
        player.getNome() + " teve uma investida foi muito bem sucedida", " + Lorax caiu enquanto tentava aplicar o ataque");

        Ataque cozinhar_granada = new Ataque("Cozinhar Granada", 20, 14, 70,
        player.getNome() + ",A granada foi extremamente eficaz", " + Sua granada falhou");

        Ataque granada = new Ataque("Arremessar Granada", 18, 8, 60,
        player.getNome() + ", a granada foi extremamente eficaz", " + Lorax mirrou errado");

        Ataque impacto_eletrico = new Ataque("Impacto Eletrico", 20, 15, 90,
        player.getNome() + " concluiu o ataque com sucesso", " + Lorax enfiou o bastão no chão e comeu terra");

        Ataque arremesso_lanca = new Ataque("Arremessar lança", 20, 9, 50,
        player.getNome() + " arremessou a lança com sucesso", " + Lorax falhou no arremesso da lança");
            
        Ataque atk_ancestral = new Ataque("Ataque Ancestral", 25, 9, 80,
        " acertou o ataque com sucesso", " + Lorax errou miseravelmente o ataque");

        Ataque fissura_ancestral = new Ataque("Fissura Ancestral", 40, 11, 90,
        player.getNome() + " realizou a fissura e feriu o inimigo", " + Lorax fez uma fissura longe demais do inimigo");

        Ataque tiro_celestial = new Ataque("Tiro Celestial", 35, 8, 70,
        player.getNome() + " acertou o tiro", " + Lorax errou o tiro");
            
        Ataque bombardeio_celestial = new Ataque("Bombardeio Celestial", 40, 13, 80,
        player.getNome() + ", O bombardeio acertou em cheio", " + O Bombardeiro acertou alguns metros distante do inimigo");

        Ataque tiro_vacuo = new Ataque("Tiro À Vácuo", 35, 7, 65,
        player.getNome() + " acertou o tiro", " + Lorax errou o tiro") ; 
    
        Ataque gravidade_30 = new Ataque("Gravidade 30", 50, 14, 90,
        player.getNome() + " conseguiu usar sua habilidade gravitacional", " + Lorax não conseguiu usar sua habilidade gravitacional!") ; 

        Ataque impacto_primordial = new Ataque("Impacto Primordial", 35, 10, 90,
        player.getNome() + " deu um golpe certeiro com o martelo", " + Lorax bateu com o martelo torto no chão") ;

        Ataque terremoto_primordial = new Ataque("Terremoto Primordial", 55, 16, 90,
        player.getNome() + " causou um tremor inesquecivel", " + Lorax não teve forças suficientes") ; 

        Ataque cortes_orientais = new Ataque("Cortes Orientais", 35, 9, 90,
        player.getNome() + " acertou o golpe", " + Lorax errou 1cm de distância ao aplicar o ataque.") ; 

        Ataque rasgar_terreno = new Ataque("Rasga-Chão", 55, 12, 95,
        player.getNome() + " teve forças suficientes para concluir o ataque", " + Lorax não usou força suficiente para rasgar o terreno.") ; 


        // Adicionando ataques a lista de ataques
        Ataque.adicionarAtaques(soco);
        Ataque.adicionarAtaques(rasteira);
        Ataque.adicionarAtaques(chute);
        

        Ataque.adicionarAtaquesPlayer(soco);
        Ataque.adicionarAtaquesPlayer(rasteira);
        Ataque.adicionarAtaquesPlayer(chute);




        for (int i = 0; i < Ataque.Ataques.size(); i++) {
            System.out.println(Ataque.Ataques.get(i).getNome());
        }
        
























































        


        // Personagem inimigo e suas atribuições
        
        HashMap<String, Object> inimigo1 = new HashMap<>();
        inimigo1.put("nome", "Soldado");
        inimigo1.put("pv", 20);
        inimigo1.put("bonus_atk", 0);
        inimigo1.put("bonus_def", 0);

        HashMap<String, Object> inimigo2 = new HashMap<>();
        inimigo2.put("nome", "Sargento");
        inimigo2.put("pv", 40);
        inimigo2.put("bonus_atk", 2);
        inimigo2.put("bonus_def", 0);

        HashMap<String, Object> inimigo3 = new HashMap<>();
        inimigo3.put("nome", "Tenente");
        inimigo3.put("pv", 60);
        inimigo3.put("bonus_atk", 2);
        inimigo3.put("bonus_def", 4);

        HashMap<String, Object> inimigo4 = new HashMap<>();
        inimigo1.put("nome", "Major");
        inimigo4.put("pv", 80);
        inimigo4.put("bonus_atk", 8);
        inimigo4.put("bonus_def", 6);

        HashMap<String, Object> inimigo_final = new HashMap<>();
        inimigo_final.put("nome", "General");
        inimigo_final.put("pv", 150);
        inimigo_final.put("bonus_atk", 10);
        inimigo_final.put("bonus_def", 10);

        // ------------------------------------------------------------------------------ //


        // ------------------------------------------------------------------------------ //

        // Personagem principal
       
        // ------------------------------------------------------------------------------ //







        // ------------------------------------------------------------------------------ //



        scanner.close();
    }
}
