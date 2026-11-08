package net.ty.acauldronofpots.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;
import net.ty.acauldronofpots.block.ModBlocks;
import net.ty.acauldronofpots.block.custom.FourLeafCloverCropBlock;
import net.ty.acauldronofpots.block.custom.FourLeafCloverSproutCropBlock;
import net.ty.acauldronofpots.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {
    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        this.add(ModBlocks.FOUR_LEAF_CLOVER_SPROUT_CROP, this.createCropDrops(ModBlocks.FOUR_LEAF_CLOVER_SPROUT_CROP, ModItems.FOUR_LEAF_CLOVER_SPROUT, ModItems.FOUR_LEAF_CLOVER_SPROUT,
                MatchBlock.blockMatches(blocks, ModBlocks.FOUR_LEAF_CLOVER_CROP,
                        StatePropertiesPredicate.Builder.properties().hasProperty(FourLeafCloverSproutCropBlock.AGE, FourLeafCloverSproutCropBlock.MAX_AGE))));

        this.add(ModBlocks.FOUR_LEAF_CLOVER_CROP, this.createCropDrops(ModBlocks.FOUR_LEAF_CLOVER_CROP, ModItems.FOUR_LEAF_CLOVER, ModItems.FOUR_LEAF_CLOVER_SEEDS,
                MatchBlock.blockMatches(blocks, ModBlocks.FOUR_LEAF_CLOVER_CROP,
                        StatePropertiesPredicate.Builder.properties().hasProperty(FourLeafCloverCropBlock.AGE, FourLeafCloverCropBlock.MAX_AGE))));



    }
}
