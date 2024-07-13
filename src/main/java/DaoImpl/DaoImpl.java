package DaoImpl;
import IDao.IDao;
import org.springframework.stereotype.Component;


@Component("IDao")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        /*
        get temperature from the DB
         */
          System.out.println("Database Version");
        return Math.random()*40 ;
    }
}
