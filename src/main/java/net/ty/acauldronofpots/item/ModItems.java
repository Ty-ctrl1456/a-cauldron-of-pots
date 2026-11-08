package net.ty.acauldronofpots.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.ty.acauldronofpots.ACauldronOfPots;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorType;
import net.ty.acauldronofpots.ACauldronOfPots;
import net.ty.acauldronofpots.block.ModBlocks;
import net.ty.acauldronofpots.food.ModFoods;

import java.util.function.Consumer;
import java.util.function.Function;

public class ModItems {
    public static final Item LIGHTNING_ESSENCE = registerItem("lightning_essence", properties -> new Item(properties
            .food(ModFoods.LIGHTNING_ESSENCE, ModFoods.LIGHTNING_ESSENCE_CONSUMABLE)));
    public static final Item BENEFICIAL_ESSENCE = registerItem("beneficial_essence", properties -> new Item(properties
            .food(ModFoods.BENEFICIAL_ESSENCE, ModFoods.BENEFICIAL_ESSENCE_CONSUMABLE)));
    public static final Item HARMFUL_ESSENCE = registerItem("harmful_essence", properties -> new Item(properties
            .food(ModFoods.HARMFUL_ESSENCE, ModFoods.HARMFUL_ESSENCE_CONSUMABLE)));
    public static final Item NEUTRAL_ESSENCE = registerItem("neutral_essence", properties -> new Item(properties
            .food(ModFoods.NEUTRAL_ESSENCE, ModFoods.NEUTRAL_ESSENCE_CONSUMABLE)));
    public static final Item EVERY_EFFECT_ESSENCE = registerItem("every_effect_essence", properties -> new Item(properties
            .food(ModFoods.EVERY_EFFECT_ESSENCE, ModFoods.EVERY_EFFECT_ESSENCE_CONSUMABLE)));
    public static final Item NULL_ESSENCE = registerItem("null_essence", properties -> new Item(properties
            .food(ModFoods.NULL_ESSENCE, ModFoods.NULL_ESSENCE_CONSUMABLE)));

    public static final Item FOUR_LEAF_CLOVER = registerItem("four_leaf_clover", Item::new);

    public static final Item FOUR_LEAF_CLOVER_SEEDS = registerItem("four_leaf_clover_seeds",
            properties -> new PlaceOnWaterBlockItem(ModBlocks.FOUR_LEAF_CLOVER_SPROUT_CROP, properties.useItemDescriptionPrefix()));
    public static final Item FOUR_LEAF_CLOVER_SPROUT = registerItem("four_leaf_clover_sprout",
            properties -> new BlockItem(ModBlocks.FOUR_LEAF_CLOVER_CROP, properties.useItemDescriptionPrefix()));

    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name)))));
    }

    public static void registerModItems() {
        ACauldronOfPots.LOGGER.info("Registering Mod Items for " + ACauldronOfPots.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(LIGHTNING_ESSENCE);
            output.accept(BENEFICIAL_ESSENCE);
            output.accept(HARMFUL_ESSENCE);
            output.accept(NEUTRAL_ESSENCE);
            output.accept(EVERY_EFFECT_ESSENCE);
            output.accept(NULL_ESSENCE);
            output.accept(FOUR_LEAF_CLOVER);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(FOUR_LEAF_CLOVER_SEEDS);
            output.accept(FOUR_LEAF_CLOVER_SPROUT);
        });
    }
}
