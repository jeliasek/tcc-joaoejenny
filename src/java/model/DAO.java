package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
    public static ArrayList<Pergunta> listarPerguntas(){
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        String sql = ("SELECT * FROM tcc.pergunta p JOIN tcc.resposta r ON p.pk_pergunta = r.fk_pergunta");
        try {
            Connection c = Conexao.getConnection();
            PreparedStatement stmt = c.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                Pergunta p = new Pergunta(rs.getInt("pk_pergunta"), rs.getInt("pk_resposta"), rs.getString("pergunta_per"), rs.getString("respostaA"), rs.getString("respostaB"), rs.getString("respostaC"));
                perguntas.add(p);
            }
            return perguntas;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
