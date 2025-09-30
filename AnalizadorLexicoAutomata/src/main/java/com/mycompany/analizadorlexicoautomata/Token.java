/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorlexicoautomata;

/**
 *
 * @author edu
 */
class Token {
    private String lexema;
    private TipoToken tipoToken;
    

    public Token(String lexema, TipoToken tipoToken) {
        this.lexema = lexema;
        this.tipoToken = tipoToken;
    }
    public Token() {
    }
    public String getLexema() {
        return lexema;
    }
    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
    public TipoToken getTipoToken() {
        return tipoToken;
    }
    public void setTipoToken(TipoToken tipoToken) {
        this.tipoToken = tipoToken;
    }
}
