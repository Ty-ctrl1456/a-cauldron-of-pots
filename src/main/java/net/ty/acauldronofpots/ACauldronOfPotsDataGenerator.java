package net.ty.acauldronofpots;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.ty.acauldronofpots.datagen.ModBlockLootTableProvider;
import net.ty.acauldronofpots.datagen.ModBlockTagsProvider;
import net.ty.acauldronofpots.datagen.ModModelProvider;
import net.ty.acauldronofpots.datagen.ModRecipeProvider;

public class ACauldronOfPotsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		var pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
		pack.addProvider(ModBlockTagsProvider::new);
		pack.addProvider(ModBlockLootTableProvider::new);
	}
	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {

	}
}
