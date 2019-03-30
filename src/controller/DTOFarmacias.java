package controller;

import java.util.List;
import model.Farmacia;

public class DTOFarmacias {
    
    private Farmacia farmacia;
    private List ListaFarmacias = null;
    
    public DTOFarmacias(){
        farmacia = new Farmacia();
    }
    
    public Farmacia getFarmacia(){
        return farmacia;
    }
    
    public void setFarmacia(Farmacia pFarmacia){
        this.farmacia = pFarmacia;
    }
    
    public List getListaFarmacias(){
        return ListaFarmacias;
    }
    
    public void setListaFarmacias(List pListaFarmacias){
        this.ListaFarmacias =  pListaFarmacias;
    }
    
}
