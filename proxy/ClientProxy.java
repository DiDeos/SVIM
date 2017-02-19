package svim.proxy;

/**
 * Created by Администратор on 19.02.2017.
 */
public class ClientProxy extends ServerProxy
{
    @Override
    public void preInit()
    {
        //Достаём регистрацию из родительского метода preInit().
        super.preInit();
    }

    @Override
    public void init()
    {
        //Тут будут наши регистрации
    }

    @Override
    public void postInit()
    {
        //Тут будут наши регистрации
    }
}
