package net.ty.acauldronofpots.block;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.ty.acauldronofpots.ACauldronOfPots;
import net.ty.acauldronofpots.block.custom.FourLeafCloverCropBlock;
import net.ty.acauldronofpots.block.custom.FourLeafCloverSproutCropBlock;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModBlocks {

    public static final Block FOUR_LEAF_CLOVER_CROP = registerBlockWithoutBlockItem("four_leaf_clover_crop",
            properties -> new FourLeafCloverCropBlock(properties.noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED)));

    public static final Block FOUR_LEAF_CLOVER_SPROUT_CROP = registerBlockWithoutBlockItem("four_leaf_clover_sprout_crop",
            properties -> new FourLeafCloverSproutCropBlock(properties.noCollision().randomTicks().instabreak().sound(SoundType.CROP)
                    .pushReaction(PushReaction.POPPED)));


    public static ResourceKey<Block> getRK(Block block) {
        return BuiltInRegistries.BLOCK.getResourceKey(block).get();
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, Component... tooltips) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name))));
        registerBlockItem(name, toRegister, tooltips);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block, Component... tooltips) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name)))) {
                    @Override
                    public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                        for(var component : tooltips) {
                            builder.accept(component);
                        }
                        super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
                    }
                });
    }

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name), toRegister);
    }

    //private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
    //    Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name))));
    //    registerBlockItem(name, toRegister);
    //    return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name), toRegister);
    //}

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        ACauldronOfPots.LOGGER.info("Registering Mod Blocks for " + ACauldronOfPots.MOD_ID);
    }
}
