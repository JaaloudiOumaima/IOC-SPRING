package Presentation;

import DAO.IDao;
import Metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2   {
    public static void main(String[] args) throws Exception {

        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();
        //System.out.println(dao.getData());

        String docClassMetier=scanner.nextLine();
        Class CMetier=Class.forName(docClassMetier);
        IMetier metier= (IMetier) CMetier.newInstance();
        Method method=CMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao)
        method.invoke(metier,dao);
        System.out.println("Resultat = "+metier.calcul());

    }
}
