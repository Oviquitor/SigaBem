/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Connection.ConnectionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;

import Model.EmpresaModel;




/**
 *
 * @author Usuario
 */
public class EmpresaDao {
    
    //java.sql.Connection con;
    private Connection con;
    
    public EmpresaDao(){
        this.con = new ConnectionFactory().conexao();
    }
    
    public void cadastrarEmpresa(EmpresaModel empresa){
        
        try {
            
            String sql = "insert into empresa (razo_social, nome_fantasia, cnpj) values (?,?,?)";
            
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,empresa.getRasao());
            stmt.setString(2, empresa.getFantasia());
            stmt.setString(3, empresa.getCnpj());
            
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro" + e);   
        }        
    }

    public List<EmpresaModel> listarEmpresa(){
        
        try {
            List<EmpresaModel> listaEmpresa = new ArrayList<>();
            
            String sql = "select * from empresa";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                EmpresaModel empresaModel = new EmpresaModel();
                
                empresaModel.setId(rs.getInt("id"));
                empresaModel.setRasao(rs.getString("razo_social"));
                empresaModel.setFantasia(rs.getString("nome_fantasia"));
                empresaModel.setCnpj(rs.getString("cnpj"));
               
                listaEmpresa.add(empresaModel);
            }
            
            return listaEmpresa;
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Erro: " + e);
            return null;
        }  
        
    }
}
