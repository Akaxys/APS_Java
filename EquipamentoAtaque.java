import java.util.*;

public class EquipamentoAtaque {

    private String nome;
    private int bonusAtaque;
    private Object ataque1;
    private Object ataque2;


    // Construtor
    public EquipamentoAtaque(String nome, int bonusAtk, Object atk1, Object atk2) {
        this.nome = nome;
        this.bonusAtaque = bonusAtk;
        this.ataque1 = atk1;
        this.ataque2 = atk2;
    }


        // Nome
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

        // Bonus de Ataque
    public int getBonusAtaque(){
        return bonusAtaque;
    }
    public void setBonusAtaque(int bonusAtk) {
        this.bonusAtaque = bonusAtk;
    }

        // Ataque adicional 1
    public Object getAtaque1(){
        return ataque1;
    }
    public void setAtaque1(Object atk1) {
        this.ataque1 = atk1;
    }

        // Ataque adicional 1
    public Object getAtaque2(){
        return ataque2;
    }
    public void setAtaque2(Object atk2) {
        this.ataque2 = atk2;
    }

}
