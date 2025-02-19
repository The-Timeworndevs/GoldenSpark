package net.timeworndevs.golden_spark.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.golden_spark.Main;

public class GSItemGroups {

    public static final DeferredRegister<CreativeModeTab> REGISTER = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GS_ITEMS = REGISTER.register("gs_main_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.gs.main")) //The language key for the title of your CreativeModeTab
            .icon(() -> GSItems.GS_ICON.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(GSItems.PATENT_MANUAL.get());
                output.accept(GSItems.SUPER_BERRY.get());
            }).build());
}
