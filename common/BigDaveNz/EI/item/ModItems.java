package BigDaveNz.EI.item;

import BigDaveNz.EI.lib.ItemID;
import net.minecraft.item.Item;

public class ModItems {

    public static Item playerSkull;

    public static void init() {
        playerSkull = new ItemPlayerSkull(ItemID.ID_CURRENT_PLAYERHEAD);
    }

}
