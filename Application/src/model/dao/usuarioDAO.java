/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.usuario;

/**
 *
 * @author Letícia Gomes
 */


public class usuarioDAO {
    
    public boolean save2 (usuario u) {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
   
    try {
        stmt = con.prepareStatement("INSERT INTO usuario (cpf,nome,email,login,senha) VALUES (?,?,?,?,?) ");
        stmt.setDouble(1,u.getCpf());
        stmt.setString(2,u.getNome());
        stmt.setString(3,u.getEmail());
        stmt.setString(4,u.getLogin());
        stmt.setString(5,u.getSenha());
        
        stmt.executeUpdate();
        return true;
        
    } catch (SQLException ex) {
     
        System.err.println("Erro ao salvar: "+ex);       
        return false;
    } finally{
        ConnectionFactory.closeConnection(con, stmt);
        }
    } 
    

   public static void main(String[] args) {
       
       usuario us = new usuario();
       
       us.setCpf(00000000000000);
       us.setNome("adm");
       us.setEmail("email");
       us.setLogin("login");
       us.setSenha("senha");
       
     
        usuarioDAO dao2 = new usuarioDAO();
        if (dao2.save2(us)){
            System.out.println("Salvo com sucesso!");
        }else{
            System.err.println("Erro ao salvar!");
        }
        
    }
   
 
    public boolean checkLogin (String login,String senha)
    
    {
  
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    boolean check = false;
    
    
        try {
            stmt = con.prepareStatement("SELECT * FROM usuario WHERE login = ? and senha = ? ");

            stmt.setString(1,login);
            stmt.setString(2,senha);

            rs = stmt.executeQuery();
            
            if(rs.next()){
                
            check = true;
                    
            }
                    
                    } catch (SQLException ex) {
            Logger.getLogger(usuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        ConnectionFactory.closeConnection(con,stmt,rs);
        }
   return check;
   
}}
