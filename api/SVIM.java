package svim.api;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Created by Администратор on 19.02.2017.
 */
@Mod(modid = "svim", name = "SVIM", version = "1.0.0 ALPHA")
public class SVIM {
    //Используется для извлечения экземпляров из других модов
    @Mod.Instance
    public static SVIM INSTANCE;

    @SidedProxy(clientSide = "svim.proxy.ClientProxy", serverSide = "svim.proxy.ServerProxy")
    public static ServerProxy proxy;

    //Данный метод нужен для настройки логирования, загрузка данных конфигов, поиск данных для version.properties и последующая загрузка, настройки ModMetaData программно, регистрация блоков, предметов и сущностей.
    @EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        GameRegistry.register(ItemAPI);
        proxy.preInit();
    }

    //Данный метод нужен для регистрации рецептов, генерации руд, отправки запросов другим модам о том, что мы хотим с ними делать. Так же здесь у нас будут: регистрация событий, рендеров для блоков и предметов.
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.Init();
    }

    //Данный метод нужен для взаимодействия с другими модами
    @EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.postInit();
    }
}
