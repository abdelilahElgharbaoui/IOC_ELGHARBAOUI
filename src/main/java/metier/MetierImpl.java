package metier;

import dao.IDao;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements IMetier{

    private IDao dao;
    public MetierImpl(IDao dao){
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double data = dao.getData();
        double res = data*4;
        return res;
    }

    public IDao getDao() {
        return dao;
    }
    /*
    * Pour injecter dans la variable dao d'un class qui implimente IDao
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

}
