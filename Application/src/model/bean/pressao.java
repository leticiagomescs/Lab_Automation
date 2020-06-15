/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Letícia Gomes
 */
public class pressao {
    
private int idpress ;
private float valorpress;
private String amostra;

    public String getAmostra() {
        return amostra;
    }

    public void setAmostra(String amostra) {
        this.amostra = amostra;
    }
private DataInputStream datatemp;

    public int getIdpress() {
        return idpress;
    }

    public void setIdpress(int idpress) {
        this.idpress = idpress;
    }

    public float getValorpress() {
        return valorpress;
    }

    public void setValorpress(float valorpress) {
        this.valorpress = valorpress;
    }

    public DataInputStream getDatatemp() {
        return datatemp;
    }

    public void setDatatemp(DataInputStream datatemp) {
        this.datatemp = datatemp;
    }
 
// public String salvartxt() {
//    try {   
//        FileWriter fw = new FileWriter("C:\\Users\\Letícia Gomes\\Desktop\\TCC\\ARQUIVOS DE TESTE\\teste.txt");
//        PrintWriter pw = new PrintWriter (fw);
//        pw.println("\n"+this.valorpress);
//        pw.flush();
//        pw.close();
//        fw.close();
//    } catch (IOException ex) {
//        Logger.getLogger(pressao.class.getName()).log(Level.SEVERE, null, ex);
//    }
// 
// return null;
// }
}   

    