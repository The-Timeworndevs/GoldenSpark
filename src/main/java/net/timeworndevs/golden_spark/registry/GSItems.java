package net.timeworndevs.golden_spark.registry;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.golden_spark.Main;

public class GSItems {
    public static final DeferredRegister.Items REGISTER_ITEM = DeferredRegister.createItems(Main.MODID);

    public static final DeferredItem<Item> GS_ICON = REGISTER_ITEM.registerSimpleItem("butter_spark", new Item.Properties());
    public static final DeferredItem<Item> PATENT_MANUAL = REGISTER_ITEM.registerSimpleItem("patent_manual", new Item.Properties());
    public static final DeferredItem<Item> SUPER_BERRY = REGISTER_ITEM.registerSimpleItem("super_berry", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(8).saturationModifier(0.6f).build()));
}