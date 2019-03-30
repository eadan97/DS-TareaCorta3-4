package controller;

import java.util.List;
import model.Farmacia;


public class GestorFarmacias {
    
    private  DAO_Imp_Farmacia elDAO;
    
    public GestorFarmacias(){
        this.elDAO = new DAO_Imp_Farmacia();
    }
    
    public boolean crearFarmacia (Farmacia pFarmacia ){
        System.out.println("en el Gestor de farmacias solicitando registro de farmacia");
        return elDAO.registrar(pFarmacia);
    }

    
     public List recuperar(){
        return elDAO.recuperar();
    }

    public Farmacia consultarFarmacia(int codigo) {
        return (Farmacia) elDAO.recuperar(codigo);
    }
    
}
