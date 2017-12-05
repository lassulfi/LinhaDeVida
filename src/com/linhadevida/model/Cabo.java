/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linhadevida.model;

/**
 *
 * @author luis.assulfi
 */
public class Cabo {

    private float bitola;
    private float fator;
    private float flecha;
    private float forca;
    private float area;

    //Construtor
    public Cabo() {
    }

    //Getters & Setters
    public float getFlecha() {
        return flecha;
    }

    public void setFlecha(float flecha) {
        this.flecha = flecha;
    }

    public float getForca() {
        return forca;
    }

    public void setForca(float forca) {
        this.forca = forca;
    }

    public float getBitola() {
        return bitola;
    }

    public void setBitola(float bitola) {
        this.bitola = bitola;
    }

    public float getFator() {
        return fator;
    }

    public void setFator(float fator) {
        this.fator = fator;
    }

    public void setArea(float bitola, float fator) {
        float a = fator * sqr(bitola, 2);
        this.area = a;
    }

    public float getArea() {
        return area;
    }

    //Métodos
    private float sqr(float a, int i) {
        float b = a;
        for (int j = 1; j < i; j++) {
            b *= a;
        }
        return b;
    }

}
