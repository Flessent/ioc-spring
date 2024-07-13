package new_features;
import IDao.IDao;

public class DaoImpl2 implements IDao{

    @Override
    public double getData() {
        /*
        get temperature from  a sensor
         */
        System.out.println("Sensor Version");
        return Math.random()*40 ;
    }
}

