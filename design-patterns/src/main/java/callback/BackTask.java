package callback;

/**
 * @Author:xuantuo
 * @Date: Created on 2020/5/19
 **/
public abstract class BackTask {


    void execute(IBack iBack) {
        iBack.run();
    }
}
