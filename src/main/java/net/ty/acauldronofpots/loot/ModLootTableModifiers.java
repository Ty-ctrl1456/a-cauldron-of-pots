package net.ty.acauldronofpots.loot;

import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
//import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
//import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.ty.acauldronofpots.item.ModItems;

public class ModLootTableModifiers {
    public static void modifyLootTables(ResourceKey<LootTable> key, FabricLootTableBuilder builder,
                                        LootTableSource source, HolderLookup.Provider provider) {
        if (key.identifier().equals(Identifier.withDefaultNamespace("entities/skeleton_horse"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1f))
                    .add(LootItem.lootTableItem(ModItems.LIGHTNING_ESSENCE))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 18)).build());


            builder.pool(poolBuilder.build());
        }
        if (key.identifier().equals(Identifier.withDefaultNamespace("blocks/tall_grass"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER_SEEDS))
                    .when(LootItemRandomChanceCondition.randomChance(0.04f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2)).build());


            builder.pool(poolBuilder.build());
        }
        if (key.identifier().equals(Identifier.withDefaultNamespace("blocks/tall_dry_grass"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER_SEEDS))
                    .when(LootItemRandomChanceCondition.randomChance(0.06f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 2)).build());


            builder.pool(poolBuilder.build());
        }
        if (key.identifier().equals(Identifier.withDefaultNamespace("blocks/short_grass"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER_SEEDS))
                    .when(LootItemRandomChanceCondition.randomChance(0.02f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 1)).build());


            builder.pool(poolBuilder.build());
        }
        if (key.identifier().equals(Identifier.withDefaultNamespace("blocks/short_dry_grass"))) {
            LootPool.Builder poolBuilder = LootPool.lootPool()
                    .setRolls(ContextIntProviders.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(1f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER_SEEDS))
                    .when(LootItemRandomChanceCondition.randomChance(0.05f))
                    .add(LootItem.lootTableItem(ModItems.FOUR_LEAF_CLOVER))
                    .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2)).build());


            builder.pool(poolBuilder.build());
        }


    }
}
