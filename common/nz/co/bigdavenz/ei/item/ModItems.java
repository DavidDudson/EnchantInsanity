package nz.co.bigdavenz.ei.item;

import net.minecraft.item.Item;
import nz.co.bigdavenz.ei.core.handler.EIDebugHandler;
import nz.co.bigdavenz.ei.debug.DebugMessage;
import nz.co.bigdavenz.ei.debug.DebugType;
import nz.co.bigdavenz.ei.lib.ItemID;

public class ModItems {

    public static Item playerSkull;

    public static void init() {
        playerSkull = new ItemPlayerSkull(ItemID.ID_CURRENT_PLAYERHEAD);
        EIDebugHandler.sendDebugInfoToConsole(new DebugMessage("Item's initialized",DebugType.ITEM));
    }

}
