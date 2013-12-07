package nz.co.bigdavenz.ei.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import nz.co.bigdavenz.ei.EnchantInsanity;
import nz.co.bigdavenz.ei.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TestBlock extends Block {

    @SideOnly(Side.CLIENT)
    public Icon sideOneIcon;

    @SideOnly(Side.CLIENT)
    public Icon sideTwoIcon;

    @SideOnly(Side.CLIENT)
    public Icon sideThreeIcon;

    @SideOnly(Side.CLIENT)
    public Icon sideFourIcon;

    @SideOnly(Side.CLIENT)
    public Icon sideFiveIcon;

    @SideOnly(Side.CLIENT)
    public Icon sideSixIcon;

    public TestBlock(int id, Material material) {
        super(id, material);
        this.setHardness(0.5F);
        this.setStepSound(Block.soundStoneFootstep);
        this.setUnlocalizedName("testBlock");
        this.setCreativeTab(EnchantInsanity.tabsEI);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister icon) {
        sideOneIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side1"); // Bottom
        sideTwoIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side2"); // Top
        sideThreeIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side3"); // North
        sideFourIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side4"); // South
        sideFiveIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side5"); // West
        sideSixIcon = icon.registerIcon(Reference.MOD_RESOURCE_DOMAIN + ":Side6"); // East
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int metadata) {

        switch (side) {
            case 0:
                return sideOneIcon;
            case 1:
                return sideTwoIcon;
            case 2:
                return sideThreeIcon;
            case 3:
                return sideFourIcon;
            case 4:
                return sideFiveIcon;
            case 5:
                return sideSixIcon;
            default:
                return null;
        }

    }
}
