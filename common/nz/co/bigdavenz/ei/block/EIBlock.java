package nz.co.bigdavenz.ei.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import nz.co.bigdavenz.ei.creativetab.CreativeTabEI;
import nz.co.bigdavenz.ei.lib.Reference;

public class EIBlock {

    public static Block eiTestBlock;
    public static Block eiAnimatedTestBlock;

    public static void init() {

        if (Reference.debugMode) {
            eiTestBlock = new TestBlock(777, Material.ground).setHardness(0.5F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("testBlock").setCreativeTab(CreativeTabEI.tabBlock).setTextureName("enchantinsanity:Side1");
            // eiAnimatedTestBlock = new AnimatedTestBlock
        }
    }
}
