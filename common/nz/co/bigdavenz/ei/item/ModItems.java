package nz.co.bigdavenz.ei.item;

import net.minecraft.item.Item;
import nz.co.bigdavenz.ei.lib.ItemID;

public class ModItems {

    public static Item playerSkull;

    public static void init() {
        playerSkull = new ItemPlayerSkull(ItemID.ID_CURRENT_PLAYERHEAD);
    }

}
