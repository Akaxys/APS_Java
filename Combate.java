import java.util.*;

public class Combate {

    static Scanner teclado = new Scanner(System.in);

    public static void turnoAliado(){

        while (true) {
            
            System.out.println("Qual ataque deseja usar?");
            int i;
            
            for (i=0; i<Ataque.AtaquesPlayer.size(); i++) {
                System.out.println("[" + i + "] " + ((Ataque) Ataque.AtaquesPlayer.get(i)).getNome() + ": Causa " + ((Ataque) Ataque.AtaquesPlayer.get(i)).getDano() + " de dano no inimigo");
            }

            int escolha = teclado.nextInt();
            
            if (escolha == 1){
                break;
            }
            else{
                continue;
            }

        }
        
    }
    
}
