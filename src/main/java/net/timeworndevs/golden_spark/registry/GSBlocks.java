package net.timeworndevs.golden_spark.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.timeworndevs.golden_spark.Main;

public class GSBlocks {

    public static final DeferredRegister.Blocks REGISTER_BLOCK = DeferredRegister.createBlocks(Main.MODID);
    public static final DeferredRegister.Items REGISTER_BLOCK_ITEM = DeferredRegister.createItems(Main.MODID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = REGISTER_BLOCK.registerSimpleBlock("example_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    public static final DeferredItem<BlockItem> EXAMPLE_BLOCK_ITEM = REGISTER_BLOCK_ITEM.registerSimpleBlockItem("example_block", EXAMPLE_BLOCK);


}
