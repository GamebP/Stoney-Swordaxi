package lol.skydash.stoneyswordaxi.utils;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class SwordaxiTabSword extends CreativeTabs {

    public SwordaxiTabSword(String label) {
        super(label);
    }

    @Override
    public String getTranslatedTabLabel() {
        return "Stoney Swordaxi";
    }

    @Override
    public Item getTabIconItem() {
        return Items.stone_sword;
    }
}
