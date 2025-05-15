package org.lessons.OOP.ClassiAstratteEInterfacce.game;

public abstract class Elemento {
    private String nome;
    private double posX;
    private double posY;
    private float rotation;

    public Elemento(String nome, double posX, double posY, float rotation) {
        this.nome = nome;
        this.posX = posX;
        this.posY = posY;
        this.rotation = rotation;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPosX() {
        return this.posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return this.posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public float getRotation() {
        return this.rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

}