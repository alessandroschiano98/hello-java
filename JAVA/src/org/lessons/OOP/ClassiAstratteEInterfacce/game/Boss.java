package org.lessons.OOP.ClassiAstratteEInterfacce.game;

public class Boss extends Elemento {
    private int difficultyLevel;

    public Boss(String nome, double posX, double posY, float rotation, int difficultyLevel) {
        super(nome, posX, posY, rotation);
        this.difficultyLevel = difficultyLevel;
    }

    public void gameOver(){
        System.out.println("Ti ha sconfitto questo boss, che si chiama " + this.getNome());
    }


    public int getdifficultyLevel() {
        return this.difficultyLevel;
    }

    public void setdifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
