package net.ty.acauldronofpots.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.ty.acauldronofpots.block.ModBlocks;
import net.ty.acauldronofpots.block.custom.FourLeafCloverCropBlock;
import net.ty.acauldronofpots.block.custom.FourLeafCloverSproutCropBlock;
import net.ty.acauldronofpots.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createCropBlock(ModBlocks.FOUR_LEAF_CLOVER_CROP, FourLeafCloverCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
        blockModelGenerators.createCropBlock(ModBlocks.FOUR_LEAF_CLOVER_SPROUT_CROP, FourLeafCloverSproutCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.LIGHTNING_ESSENCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NEUTRAL_ESSENCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.BENEFICIAL_ESSENCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.HARMFUL_ESSENCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EVERY_EFFECT_ESSENCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.NULL_ESSENCE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.FOUR_LEAF_CLOVER, ModelTemplates.FLAT_ITEM);
    }
}
