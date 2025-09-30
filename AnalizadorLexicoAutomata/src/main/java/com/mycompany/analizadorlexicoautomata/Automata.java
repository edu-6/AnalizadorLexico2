package com.mycompany.analizadorlexicoautomata;

import java.util.ArrayList;

public class Automata {
    private static final int DIGITO = 0;
    private static final int LETRA = 1;
    private static final int PUNTO = 2;
    private static final int SIGNO_DIVISION = 3;
    private static final int ASTERISCO = 4;
    private static final int SIGNO_AGRUPACION = 5;
    private static final int OPERADOR = 6;
    private static final int SIGNO_PUNTUACION = 7;
    private static final int COMILLA = 8;
    private static final int ESPACIO = 9;
    private static final int TABULACION = 10;
    private static final int SALTO_LINEA = 11;
    private static final int DESCONOCIDO = 12;
    
    private ReconocedorDeCaracter reconocedorChar = new ReconocedorDeCaracter();
    // ESTADO ERROR
    private static final int ERROR = -1;
           
    // x = estados y = simbolos
    private int[][] transiciones = new int[16][12];
    private int estadoInicial = 0;
    private int estadoActual = 0;
    private int estadoAnterior = 0;
    private ArrayList<Token> tokens = new ArrayList<>();
    private String[] palabrasReservadas = { "int" };
    // private int[] estadosAceptacion = {1,3,4};

    
    public Automata() {
        // ESTADO 0
        transiciones[0][DIGITO] = 1;
        transiciones[0][LETRA] = 4;
        transiciones[0][PUNTO] = 5;
        transiciones[0][SIGNO_DIVISION] = 11;
        transiciones[0][ASTERISCO] = 6;
        transiciones[0][SIGNO_AGRUPACION] = 7;
        transiciones[0][OPERADOR] = 6;
        transiciones[0][SIGNO_PUNTUACION] = 5;
        transiciones[0][COMILLA] = 8;
        transiciones[0][ESPACIO] = 0;
        transiciones[0][TABULACION] = 0;
        transiciones[0][SALTO_LINEA] = 0;
        transiciones[0][DESCONOCIDO] = ERROR;
        
        // ESTADO 1
        transiciones[1][DIGITO] = 1;
        transiciones[1][LETRA] = ERROR;
        transiciones[1][PUNTO] = 2;
        transiciones[1][SIGNO_DIVISION] = ERROR;
        transiciones[1][ASTERISCO] = ERROR;
        transiciones[1][SIGNO_AGRUPACION] = ERROR;
        transiciones[1][OPERADOR] = ERROR;
        transiciones[1][SIGNO_PUNTUACION] = ERROR;
        transiciones[1][COMILLA] = ERROR;
        transiciones[1][ESPACIO] = ERROR;
        transiciones[1][TABULACION] = ERROR;
        transiciones[1][SALTO_LINEA] = ERROR;
        transiciones[1][DESCONOCIDO] = ERROR;
        
        // ESTADO 2
        transiciones[2][DIGITO] = 3;
        transiciones[2][LETRA] = ERROR;
        transiciones[2][PUNTO] = ERROR;
        transiciones[2][SIGNO_DIVISION] = ERROR;
        transiciones[2][ASTERISCO] = ERROR;
        transiciones[2][SIGNO_AGRUPACION] = ERROR;
        transiciones[2][OPERADOR] = ERROR;
        transiciones[2][SIGNO_PUNTUACION] = ERROR;
        transiciones[2][COMILLA] = ERROR;
        transiciones[2][ESPACIO] = ERROR;
        transiciones[2][TABULACION] = ERROR;
        transiciones[2][SALTO_LINEA] = ERROR;
        transiciones[2][DESCONOCIDO] = ERROR;
        
        // ESTADO 3
        transiciones[3][DIGITO] = 3;
        transiciones[3][LETRA] = ERROR;
        transiciones[3][PUNTO] = ERROR;
        transiciones[3][SIGNO_DIVISION] = ERROR;
        transiciones[3][ASTERISCO] = ERROR;
        transiciones[3][SIGNO_AGRUPACION] = ERROR;
        transiciones[3][OPERADOR] = ERROR;
        transiciones[3][SIGNO_PUNTUACION] = ERROR;
        transiciones[3][COMILLA] = ERROR;
        transiciones[3][ESPACIO] = 0;
        transiciones[3][TABULACION] = 0;
        transiciones[3][SALTO_LINEA] = 0;
        transiciones[3][DESCONOCIDO] = ERROR;
        // ESTADO4
        transiciones[4][DIGITO] = 4;
        transiciones[4][LETRA] = 4;
        transiciones[4][PUNTO] = ERROR;
        transiciones[4][SIGNO_DIVISION] = ERROR;
        transiciones[4][ASTERISCO] = ERROR;
        transiciones[4][SIGNO_AGRUPACION] = ERROR;
        transiciones[4][OPERADOR] = ERROR;
        transiciones[4][SIGNO_PUNTUACION] = ERROR;
        transiciones[4][COMILLA] = ERROR;
        transiciones[4][ESPACIO] = 0;
        transiciones[4][TABULACION] = 0;
        transiciones[4][SALTO_LINEA] = 0;
        transiciones[4][DESCONOCIDO] = ERROR;
        //ESTADO 5
        transiciones[5][DIGITO] = ERROR;
        transiciones[5][LETRA] = ERROR;
        transiciones[5][PUNTO] = ERROR;
        transiciones[5][SIGNO_DIVISION] = ERROR;
        transiciones[5][ASTERISCO] = ERROR;
        transiciones[5][SIGNO_AGRUPACION] = ERROR;
        transiciones[5][OPERADOR] = ERROR;
        transiciones[5][SIGNO_PUNTUACION] = ERROR;
        transiciones[5][COMILLA] = ERROR;
        transiciones[5][ESPACIO] = 0;
        transiciones[5][TABULACION] = 0;
        transiciones[5][SALTO_LINEA] = 0;
        transiciones[5][DESCONOCIDO] = ERROR;
        
        //ESTADO 6
        transiciones[6][DIGITO] = ERROR;
        transiciones[6][LETRA] = ERROR;
        transiciones[6][PUNTO] = ERROR;
        transiciones[6][SIGNO_DIVISION] = ERROR;
        transiciones[6][ASTERISCO] = ERROR;
        transiciones[6][SIGNO_AGRUPACION] = ERROR;
        transiciones[6][OPERADOR] = ERROR;
        transiciones[6][SIGNO_PUNTUACION] = ERROR;
        transiciones[6][COMILLA] = ERROR;
        transiciones[6][ESPACIO] = 0;
        transiciones[6][TABULACION] = 0;
        transiciones[6][SALTO_LINEA] = 0;
        transiciones[6][DESCONOCIDO] = ERROR;
        
        //ESTADO 7
        transiciones[7][DIGITO] = ERROR;
        transiciones[7][LETRA] = ERROR;
        transiciones[7][PUNTO] = ERROR;
        transiciones[7][SIGNO_DIVISION] = ERROR;
        transiciones[7][ASTERISCO] = ERROR;
        transiciones[7][SIGNO_AGRUPACION] = ERROR;
        transiciones[7][OPERADOR] = ERROR;
        transiciones[7][SIGNO_PUNTUACION] = ERROR;
        transiciones[7][COMILLA] = ERROR;
        transiciones[7][ESPACIO] = 0;
        transiciones[7][TABULACION] = 0;
        transiciones[7][SALTO_LINEA] = 0;
        transiciones[7][DESCONOCIDO] = ERROR;
        
        //ESTADO 8
        transiciones[8][DIGITO] = 9;
        transiciones[8][LETRA] = 9;
        transiciones[8][PUNTO] = 9;
        transiciones[8][SIGNO_DIVISION] = 9;
        transiciones[8][ASTERISCO] = 9;
        transiciones[8][SIGNO_AGRUPACION] = 9;
        transiciones[8][OPERADOR] = ERROR;
        transiciones[8][SIGNO_PUNTUACION] = 9;
        transiciones[8][COMILLA] = 10;
        transiciones[8][ESPACIO] = 0;
        transiciones[8][TABULACION] = 0;
        transiciones[8][SALTO_LINEA] = 0;
        transiciones[8][DESCONOCIDO] = ERROR;
        
        //ESTADO 9  
        transiciones[9][DIGITO] = 9;
        transiciones[9][LETRA] = 9;
        transiciones[9][PUNTO] = 9;
        transiciones[9][SIGNO_DIVISION] = 9;
        transiciones[9][ASTERISCO] = 9;
        transiciones[9][SIGNO_AGRUPACION] = 9;
        transiciones[9][OPERADOR] = ERROR;
        transiciones[9][SIGNO_PUNTUACION] = 9;
        transiciones[9][COMILLA] = 10;
        transiciones[9][ESPACIO] = 0;
        transiciones[9][TABULACION] = 0;
        transiciones[9][SALTO_LINEA] = 0;
        transiciones[9][DESCONOCIDO] = ERROR;
        
        //ESTADO 10
        transiciones[10][DIGITO] = ERROR;
        transiciones[10][LETRA] = ERROR;
        transiciones[10][PUNTO] = ERROR;
        transiciones[10][SIGNO_DIVISION] = ERROR;
        transiciones[10][ASTERISCO] = ERROR;
        transiciones[10][SIGNO_AGRUPACION] = ERROR;
        transiciones[10][OPERADOR] = ERROR;
        transiciones[10][SIGNO_PUNTUACION] = ERROR;
        transiciones[10][COMILLA] = ERROR;
        transiciones[10][ESPACIO] = 0;
        transiciones[10][TABULACION] = 0;
        transiciones[10][SALTO_LINEA] = 0;
        transiciones[10][DESCONOCIDO] = ERROR;
        
        //ESTADO 11
        transiciones[11][DIGITO] = ERROR;
        transiciones[11][LETRA] = ERROR;
        transiciones[11][PUNTO] = ERROR;
        transiciones[11][SIGNO_DIVISION] = 12;
        transiciones[11][ASTERISCO] = 14;
        transiciones[11][SIGNO_AGRUPACION] = ERROR;
        transiciones[11][OPERADOR] = ERROR;
        transiciones[11][SIGNO_PUNTUACION] = ERROR;
        transiciones[11][COMILLA] = ERROR;
        transiciones[11][ESPACIO] = ERROR;
        transiciones[11][TABULACION] = ERROR;
        transiciones[11][SALTO_LINEA] = ERROR;
        transiciones[11][DESCONOCIDO] = ERROR;
        
        //ESTADO 12
        transiciones[12][DIGITO] = 13;
        transiciones[12][LETRA] = 13;
        transiciones[12][PUNTO] = 13;
        transiciones[12][SIGNO_DIVISION] = 13;
        transiciones[12][ASTERISCO] = 13;
        transiciones[12][SIGNO_AGRUPACION] = 13;
        transiciones[12][OPERADOR] = 13;
        transiciones[12][SIGNO_PUNTUACION] = 13;
        transiciones[12][COMILLA] = 13;
        transiciones[12][ESPACIO] = 13;
        transiciones[12][TABULACION] = 13;
        transiciones[12][SALTO_LINEA] = 0;
        transiciones[12][DESCONOCIDO] = 13;
        
        //ESTADO 13
        transiciones[13][DIGITO] = 13;
        transiciones[13][LETRA] = 13;
        transiciones[13][PUNTO] = 13;
        transiciones[13][SIGNO_DIVISION] = 13;
        transiciones[13][ASTERISCO] = 13;
        transiciones[13][SIGNO_AGRUPACION] = 13;
        transiciones[13][OPERADOR] = 13;
        transiciones[13][SIGNO_PUNTUACION] = 13;
        transiciones[13][COMILLA] = 13;
        transiciones[13][ESPACIO] = 13;
        transiciones[13][TABULACION] = 13;
        transiciones[13][SALTO_LINEA] = 0;
        transiciones[13][DESCONOCIDO] = 13;
        
        //ESTADO 14
        transiciones[14][DIGITO] = 14;
        transiciones[14][LETRA] = 14;
        transiciones[14][PUNTO] = 14;
        transiciones[14][SIGNO_DIVISION] = 14;
        transiciones[14][ASTERISCO] = 15;
        transiciones[14][SIGNO_AGRUPACION] = 14;
        transiciones[14][OPERADOR] = 14;
        transiciones[14][SIGNO_PUNTUACION] = 14;
        transiciones[14][COMILLA] = 14;
        transiciones[14][ESPACIO] = 14;
        transiciones[14][TABULACION] = 14;
        transiciones[14][SALTO_LINEA] = 14;
        transiciones[14][DESCONOCIDO] = 14;
        
        //ESTADO 15
        transiciones[15][DIGITO] = 14;
        transiciones[15][LETRA] = 14;
        transiciones[15][PUNTO] = 14;
        transiciones[15][SIGNO_DIVISION] = 16;
        transiciones[15][ASTERISCO] = 15;
        transiciones[15][SIGNO_AGRUPACION] = 14;
        transiciones[15][OPERADOR] = 14;
        transiciones[15][SIGNO_PUNTUACION] = 14;
        transiciones[15][COMILLA] = 14;
        transiciones[15][ESPACIO] = 14;
        transiciones[15][TABULACION] = 14;
        transiciones[15][SALTO_LINEA] = 14;
        transiciones[15][DESCONOCIDO] = 14;
        
        // ESTADO 16
        transiciones[16][DIGITO] = ERROR;
        transiciones[16][LETRA] = ERROR;
        transiciones[16][PUNTO] = ERROR;
        transiciones[16][SIGNO_DIVISION] = ERROR;
        transiciones[16][ASTERISCO] = ERROR;
        transiciones[16][SIGNO_AGRUPACION] = ERROR;
        transiciones[16][OPERADOR] = ERROR;
        transiciones[16][SIGNO_PUNTUACION] = ERROR;
        transiciones[16][COMILLA] = ERROR;
        transiciones[16][ESPACIO] = 0;
        transiciones[16][TABULACION] = 0;
        transiciones[16][SALTO_LINEA] = 0;
        transiciones[16][DESCONOCIDO] = ERROR;
        
    }

    public void Analizar2(String texto) {
        int linea = 0;
        int columna = 0;
        String lexema = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int tipo = reconocedorChar.getTipoCaracter(c);
            if (tipo == SALTO_LINEA) {
                linea++;
                columna = 0;
            }else{
                columna++;
            }
            estadoAnterior = estadoActual; // guardar estado anterior
            estadoActual = transiciones[estadoActual][tipo];  // moverse con el estado
            
            if(estadoActual == ERROR){
                // sumar caracter
                // GUARDAR EL ERROR
                // REINICIAR EL AUTOMATA
            }
            
            //GUARDAR EL lexema O NO 
            if (estadoActual == estadoInicial) { // si volvió o está en el estado inicial
                if (estadoAnterior == estadoInicial) { // si dió vueltas sobre si mismo
                    // no guardar nada
                } else {
                    // si venía de otro estado (quiere decir que era final)
                    //guardar el lexema (menos el ultimo caracter de salida)
                }
            } else {
                // esta en estados medios
                // sumar caracter
            }
            
            // PARA UN  ULTIMO SI QUEDA SIN GUARDAR PORQUE NO LLEGÓ AL INICIO 
            // (PUEDE SER FINAL, PUEDO NO SERLO, O PUEDE ESTAR EN EL ESTADO ERROR)
            if(i == texto.length()-1){
                // SI ES FINAL GUARDAR
                // si no es estado final guardar como error (quedo incompleto)
            }

        }
    }

    public void Analizar(String texto) {
        String lexema = "";
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int tipo = getTipoCaracter(c);
            if (tipo != 3) {
                lexema = lexema + c;
            }
            if (tipo == 3) {
                System.out.println("ES UN ESPACIO HAY QUE REINICIAR EL AUTOMATA");
                reiniciarAutomata(lexema);
                lexema = "";
            } else if (tipo == -1) {
                System.out.println("ERROR EL CARACTER NO ESTA EN EL ALFABETO");
                estadoActual = -1;
                reiniciarAutomata(lexema);
                lexema = "";
            } else {

                estadoAnterior = estadoActual;
                estadoActual = transiciones[estadoActual][tipo];
                if (estadoActual == -1) {
                    System.out.println("ERROR");
                    reiniciarAutomata(lexema);
                    lexema = "";
                } else {
                    System.out.println(
                            "me movi del estado: " + estadoAnterior + " al estado: " + estadoActual + " con un: "
                                    + c);
                }

            }
        }
        reiniciarAutomata(lexema);
        ImprimirTokens();
        tokens = new ArrayList<>();
    }

    public void reiniciarAutomata(String lexema) {
        System.out.println("LEXEMA: " + lexema);
        if (!lexema.equals("")) {
            Token nuevoToken = new Token(lexema, getTipoToken(estadoActual, lexema));
            tokens.add(nuevoToken);
            estadoActual = 0;
            estadoAnterior = 0;
        }

    }

    public void ImprimirTokens() {
        System.out.println("TOKENS ENCONTRADOS");
        for (Token i : tokens) {
            System.out.println("Lexema: " + i.getLexema() + " tipo Token: " + i.getTipoToken());
        }
    }

    public TipoToken getTipoToken(int estadoActual, String lexema) {
        switch (estadoActual) {
            case 1:
                return TipoToken.ENTERO;
            case 3:
                return TipoToken.DECIMAL;
            case 4:
                return verificarPalabraReservada(lexema);
            case -1:
                return TipoToken.ERROR;
            default:
                break;
        }
        return TipoToken.ERROR;
    }

    public TipoToken verificarPalabraReservada(String lexema) {
        for (String tmp : palabrasReservadas) {
            if (lexema.equals(tmp))
                return TipoToken.PALABRARESERVADA;
        }
        return TipoToken.IDENTIFICADOR;
    }

    // numeros = 0
    // letras = 1
    // punto = 2
    // Espacio = 3
    public int getTipoCaracter(char tmp) {
        int valor = -1;
        if (Character.isDigit(tmp))
            return 0;
        if (Character.isLetter(tmp))
            return 1;
        if (tmp == '.')
            return 2;
        if (Character.isWhitespace(tmp))
            return 3;
        return valor;

    }

}
