package LogicImpl;

import IDao.IDao;
import ILogic.ILogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ILogic")
public class LogicImpl implements ILogic {

    //@Autowired
    private IDao idao;

    public LogicImpl(IDao idao) {
        this.idao = idao;
    }



    @Override
    public double compute() {
        double tmp=idao.getData();
        double result=tmp*540/Math.cos(tmp*Math.PI);
        return result;
    }

    // inject a class object that the IDAO-Interface implements into the DAO
    /*public void setIdao(IDao idao) {
        this.idao = idao;
    }*/ // Injection of dependence through setter
}
