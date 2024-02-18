package Presentation;

import DAO.DaoImpl;
import Extention.DaoImpl2;
import Metier.Metier;

public class Presentation {

    public static void main(String[] args) {
        //Injection des dependances par instanciation statique
        DaoImpl2 daoImpl2=new DaoImpl2();
        Metier metierImp= new Metier();
        metierImp.setDao(daoImpl2);
        //System.out.println("Result = " +metierImp.calcul());
        System.out.println("Result = "+metierImp.calcul());
    }
}
