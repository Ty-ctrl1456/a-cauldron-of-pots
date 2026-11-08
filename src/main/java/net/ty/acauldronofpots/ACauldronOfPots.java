package net.ty.acauldronofpots;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;

import net.ty.acauldronofpots.block.ModBlocks;
import net.ty.acauldronofpots.effect.ModEffects;
import net.ty.acauldronofpots.item.ModItems;
import net.ty.acauldronofpots.loot.ModLootTableModifiers;
import net.ty.acauldronofpots.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ACauldronOfPots implements ModInitializer {
	public static final String MOD_ID = "acauldronofpots";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();

		ModPotions.registerPotions();

		//ModPotionRecipes.registerPotionRecipes();

		LootTableEvents.MODIFY.register(ModLootTableModifiers::modifyLootTables);
	}
}
