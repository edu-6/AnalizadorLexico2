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
    
    // ESTADO ERROR 
    private static final int ERROR = -1;
           
    // x = estados y = simbolos
    private int[][] transiciones = new int[16][12];
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
