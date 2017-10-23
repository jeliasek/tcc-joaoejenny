package control;

import java.util.ArrayList;

public class Sistema {
    public static ArrayList<model.Pergunta> listarPerguntas(){
        return model.DAO.listarPerguntas();
        
    }
}
