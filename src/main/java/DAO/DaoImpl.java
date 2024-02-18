package DAO;

public class DaoImpl implements IDao{
    @Override
    public double getData() {

        /*Se connecter a la base de donnees pour recuperer la temp */
        System.out.println("Version BD");
        double Temp=Math.random()*40;
        return Temp;
    }
}
