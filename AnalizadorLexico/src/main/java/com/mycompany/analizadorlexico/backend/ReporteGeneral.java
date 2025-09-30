/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.analizadorlexico.backend;

/**
 *
 * @author edu
 */
public class ReporteGeneral {
    private int cantidadErrores;
    private String porcentajeValidos;
    private String tokensNoUsados;

    public ReporteGeneral(int cantidadErrores, String porcentajeValidos) {
        this.cantidadErrores = cantidadErrores;
        this.porcentajeValidos = porcentajeValidos;
    }

    public String getReporte(){
        String reporte = "CANTIDAD ERRORES: "+ cantidadErrores +"\n"
                + "PORCENTAJE TOKENS VALIDOS: "+ porcentajeValidos+"\n";
        return reporte;
    }
    
    
    
}
