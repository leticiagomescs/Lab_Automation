/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.bean.pressao;

/**
 *
 * @author Letícia Gomes
 */
public class pressaoDAO {
    
public boolean save (pressao p)

    {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
   
    
    try {
        stmt = con.prepareStatement("INSERT INTO pressao (valorpress, amostra) VALUES (?,?) ");
        
        stmt.setFloat(1, p.getValorpress());
        stmt.setString(2, p.getAmostra());
        
        stmt.executeUpdate();
        return true;
        
    } catch (SQLException ex) {
     
        System.err.println("Erro ao salvar: "+ ex);  
        JOptionPane.showMessageDialog(null, "Erro ao Salvar!");
        return false;
    } finally{
        ConnectionFactory.closeConnection(con, stmt);
        }
    } 


//    public static void main(String[] args) {
//       
//        pressao pre = new pressao();
//        pre.setValorpress(34.12345678910);
//        pre.setAmostra("Amostra 2");
//        
//        pressaoDAO dao = new pressaoDAO();
//        if (dao.save(pre)){
//            System.out.println("Salvo com sucesso!");
//        }else{
//            System.err.println("Erro ao salvar!");
//        }
//        
//    }
}
