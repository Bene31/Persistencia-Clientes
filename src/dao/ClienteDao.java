/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbc.ConectionFactory;
import model.Clientes;

/**
 *
 * @author terra
 */
public class ClienteDao {
    private Connection conecta;
    
    public ClienteDao() {
        this.conecta = new ConectionFactory().conecta();
    }
    
    public void cadastrarCliente(Clientes obj){
       
       try {
           String cmdsql="insert into cliente(nome, apelido, telefone, celular, cep, categoria, desconto) values(?,?,?,?,?,?,?)";
           PreparedStatement stmt = conecta.prepareStatement(cmdsql);
           stmt.setString(1, obj.getNome());
           stmt.setString(2, obj.getApelido());
           stmt.setString(3, obj.getTelefone());
           stmt.setString(4, obj.getCelular());
           stmt.setString(5, obj.getCep());
           stmt.setString(6, obj.getCategoria());
           stmt.setString(7, obj.getDesconto());
       
           stmt.execute();
           
           stmt.close();
           
       } catch (SQLException erro) {
           throw new RuntimeException(erro);
       }
    }

    public List<Clientes>listarClientes(){
        
        try{
            List<Clientes> lista = new ArrayList<Clientes>();
            String Sql="SELECT * FROM CLIENTE";
            PreparedStatement stmt=conecta.prepareStatement(Sql);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Clientes c = new Clientes();
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setApelido(rs.getString("apelido"));
                c.setTelefone(rs.getString("telefone"));
                c.setCelular(rs.getString("celular"));
                c.setCep(rs.getString("cep"));
                c.setCategoria(rs.getString("categoria"));
                c.setDesconto(rs.getString("desconto"));
                
                lista.add(c);
            }
            return lista;
        }catch(SQLException erro){
            throw new RuntimeException(erro);
        }
    }
     
     public void excluirCliente(Clientes obj){
         try{
             String cmdsql = "delete from cliente where id=?";
             PreparedStatement stmt = conecta.prepareStatement(cmdsql);
             stmt.setInt(1, obj.getId());
             stmt.execute();
             
             stmt.close();
         }catch(SQLException erro){
             throw new RuntimeException(erro);
         }
     }
     
     public void alterarCliente(Clientes obj){
         try{
             String cmdsql = "update cliente set nome=?, apelido=?, telefone=?, celular=?, cep=?, categoria=?, desconto=? where id=?";
             PreparedStatement stmt = conecta.prepareStatement(cmdsql);
             stmt.setString(1, obj.getNome());
             stmt.setString(2, obj.getApelido());
             stmt.setString(3, obj.getTelefone());
             stmt.setString(4, obj.getCelular());
             stmt.setString(5, obj.getCep());
             stmt.setString(6, obj.getCategoria());
             stmt.setString(7, obj.getDesconto());
             stmt.setInt(8, obj.getId());
             stmt.execute();
             
             stmt.close();

         }catch(SQLException erro){
             throw new RuntimeException(erro);
         }
     }
}

