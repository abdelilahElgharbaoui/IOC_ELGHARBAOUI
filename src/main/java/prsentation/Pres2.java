package prsentation;

import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao idao = (IDao) cDao.getConstructor().newInstance();

        System.out.println("res:"+ idao.getData());

        String MetierClassName = scanner.nextLine();
        Class cMetier = Class.forName(MetierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(idao);
        //metier.setDao(idao);
//        Method setDao = cMetier.getMethod("setDao",IDao.class);
//        setDao.invoke(metier,idao);

        System.out.println("res:"+ metier.calcul());


    }
}
