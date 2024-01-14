package lol.skydash.stoneyswordaxi.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import lol.skydash.stoneyswordaxi.StoneySwordaxi;
import lol.skydash.stoneyswordaxi.tools.StoneySwordaxiSword;
import lol.skydash.stoneyswordaxi.utils.Reference;

public class RegisterItems {

    // items
    public static Item stoneySwordaxi;

    public static Item.ToolMaterial STONEY_TOOLS_MATERIAL = EnumHelper
        .addToolMaterial("STONEY_TOOLS_MATERIAL", 1, 791, 4.0F, 2.0F, 30);

    public static void init() {
        // Kit tools
        stoneySwordaxi = new StoneySwordaxiSword(RegisterItems.STONEY_TOOLS_MATERIAL)
            .setUnlocalizedName("stoney_swordaxi")
            .setCreativeTab(StoneySwordaxi.StoneySwordaxiTab)
            .setTextureName(Reference.MOD_ID + ":stoneyswordaxi");

    }

    // register items/blocks + make recipes
    public static void register() {
        // register names
        GameRegistry.registerItem(stoneySwordaxi, "stoneyswordaxi");

        GameRegistry.addRecipe(
            new ItemStack(stoneySwordaxi, 1),
            "CSC",
            "IFI",
            "FIF",
            'I',
            Items.stick,
            'S',
            Blocks.stone,
            'C',
            Blocks.cobblestone,
            'F',
            Items.flint);
    }
}
