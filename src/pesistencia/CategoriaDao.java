/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesistencia;

import entidades.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author christhofer.vieira
 */
public class CategoriaDao {

    public static boolean inserir(Categoria categoria) {
        try {
            Connection conexao = Conexao.getConexao();
            String sql = "INSERT INTO categoria (nome, tipo)"
                    + "VALUES (?, ?)";
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, categoria.getNome());
            comando.setString(2, String.valueOf(categoria.getTipo()));
            comando.execute();
            comando.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean alterar(Categoria categoria) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE categoria SET"
                    + "nome = ?,"
                    + "tipo = ? "
                    + "WHERE id =?";
            PreparedStatement comando = con.prepareStatement(sql);
            comando.setString(1, categoria.getNome());
            comando.setString(2, String.valueOf(categoria.getTipo()));
            comando.setInt(3, categoria.getId());

            int nrLinhas = comando.executeUpdate();
            comando.close();

            return nrLinhas > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static boolean excluir (int id) {
    try {
    Connection con = Conexao.getConexao();
    String sql = "DELETE FROM categoria WHERE id = ?";
    PreparedStatement comando = con.prepareStatement(sql);
    comando.setInt (1, id);
    int nrLinhas = comando.executeUpdate();
    comando.close();
    return nrLinhas > 0;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }
    }
}
    
