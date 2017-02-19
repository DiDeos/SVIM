package svim.api;

import net.minecraft.item.Item;

/**
 * Created by Администратор on 19.02.2017.
 */
public class ItemAPI extends Item {
    public ItemAPI(String name)
    {
        //Начиная с 1.9+ setRegistryName обязателен!
        setRegistryName(name);
        //Данный метод позволит нам делать перевод для предмета под разные языки.
        setUnlocalizedName(name);
    }
}
