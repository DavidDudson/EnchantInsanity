package nz.co.bigdavenz.ei.crafting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by David J. Dudson on 5/12/13.
 * Class used for registering all Recipe's
 */
public class EIRecipeHandler {

    public static void init(){

        ItemStack skullStack = new ItemStack(Block.skull);
        GameRegistry.addRecipe(new ShapedOreRecipe(skullStack, new Object [] {"xxx", "xxx", "xxx", 'x', Item.skull}));
    }
}
