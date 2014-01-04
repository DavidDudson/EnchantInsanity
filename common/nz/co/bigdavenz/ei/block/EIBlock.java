package nz.co.bigdavenz.ei.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nz.co.bigdavenz.ei.lib.Reference;

public class EIBlock {

    public static Block eiTestBlock;
//    public static Block eiAnimatedTestBlock;

    public static void init() {

        if (Reference.debugMode) {
            eiTestBlock = new TestBlock(777, Material.field_151566_D);
        }
    }

}
