package ext;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("daoA")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("web services");
        double data = 99;
        return data;
    }
}
