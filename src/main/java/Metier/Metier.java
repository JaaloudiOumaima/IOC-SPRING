package Metier;

import DAO.IDao;

public class Metier implements IMetier{

    //Couplage Faible
    private IDao Dao;
    @Override
    public double calcul() {
        double Temp=Dao.getData();
        double Resultat=Temp*540/Math.cos(Temp*Math.PI);
        return Resultat;
    }
    /*
    Injecter dans la variable Dao un object qui implemente l'interface Idao
    */
    public void setDao(IDao dao) {
        Dao = dao;
    }
}
