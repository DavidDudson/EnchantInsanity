package nz.co.bigdavenz.ei.core.registry;

import nz.co.bigdavenz.ei.block.EIBlock;
import cpw.mods.fml.common.registry.GameRegistry;

public class EIGameRegistry {

    public static void init() {
        GameRegistry.registerBlock(EIBlock.eiTestBlock, "EITestBlock");
    }
}
