package net.ty.acauldronofpots.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.BrewingRecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.block.Blocks;
import net.ty.acauldronofpots.ACauldronOfPots;
import net.ty.acauldronofpots.item.ModItems;
import net.ty.acauldronofpots.potion.ModPotions;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancement) {
        return new RecipeProvider(recipes, advancement) {
            @Override
            public void buildRecipes() {

                shaped(RecipeCategory.BREWING, ModItems.BENEFICIAL_ESSENCE)
                        .pattern("GMF")
                        .pattern("RES")
                        .pattern("CPT")
                        .define('E', Items.ENCHANTED_GOLDEN_APPLE)
                        .define('G', Items.GLISTERING_MELON_SLICE)
                        .define('M', Items.MAGMA_CREAM)
                        .define('P', Items.PUFFERFISH)
                        .define('R', Items.RABBIT_FOOT)
                        .define('T', Items.GHAST_TEAR)
                        .define('C', Items.GOLDEN_CARROT)
                        .define('S', Items.TURTLE_SCUTE)
                        .define('F', Items.FEATHER)
                        .unlockedBy(getHasName(Items.ENCHANTED_GOLDEN_APPLE), has(Items.ENCHANTED_GOLDEN_APPLE))
                        .unlockedBy(getHasName(Items.GLISTERING_MELON_SLICE), has(Items.GLISTERING_MELON_SLICE))
                        .unlockedBy(getHasName(Items.MAGMA_CREAM), has(Items.MAGMA_CREAM))
                        .unlockedBy(getHasName(Items.PUFFERFISH), has(Items.PUFFERFISH))
                        .unlockedBy(getHasName(Items.RABBIT_FOOT), has(Items.RABBIT_FOOT))
                        .unlockedBy(getHasName(Items.GHAST_TEAR), has(Items.GHAST_TEAR))
                        .unlockedBy(getHasName(Items.GOLDEN_CARROT), has(Items.GOLDEN_CARROT))
                        .unlockedBy(getHasName(Items.TURTLE_SCUTE), has(Items.TURTLE_SCUTE))
                        .unlockedBy(getHasName(Items.BLAZE_POWDER), has(Items.FEATHER))
                        .group("essences")
                        .save(output);

                shaped(RecipeCategory.BREWING, ModItems.HARMFUL_ESSENCE)
                        .pattern("123")
                        .pattern("456")
                        .pattern("789")
                        .define('1', Items.SLIME_BLOCK)
                        .define('2', Items.SPIDER_EYE)
                        .define('3', Items.FERMENTED_SPIDER_EYE)
                        .define('4', Items.ROTTEN_FLESH)
                        .define('5', Items.WITHER_SKELETON_SKULL)
                        .define('6', Items.STONE)
                        .define('7', ModItems.LIGHTNING_ESSENCE)
                        .define('8', Items.CREEPER_HEAD)
                        .define('9', Items.SHULKER_SHELL)
                        .unlockedBy(getHasName(Items.SLIME_BLOCK), has(Items.SLIME_BLOCK))
                        .unlockedBy(getHasName(Items.SPIDER_EYE), has(Items.SPIDER_EYE))
                        .unlockedBy(getHasName(Items.FERMENTED_SPIDER_EYE), has(Items.FERMENTED_SPIDER_EYE))
                        .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                        .unlockedBy(getHasName(Items.WITHER_SKELETON_SKULL), has(Items.WITHER_SKELETON_SKULL))
                        .unlockedBy(getHasName(Items.STONE), has(Items.STONE))
                        .unlockedBy(getHasName(ModItems.LIGHTNING_ESSENCE), has(ModItems.LIGHTNING_ESSENCE))
                        .unlockedBy(getHasName(Items.CREEPER_HEAD), has(Items.CREEPER_HEAD))
                        .unlockedBy(getHasName(Items.SHULKER_SHELL), has(Items.SHULKER_SHELL))
                        .group("essences")
                        .save(output);

                shaped(RecipeCategory.BREWING, ModItems.NEUTRAL_ESSENCE)
                        .pattern("123")
                        .pattern("456")
                        .pattern("789")
                        .define('1', Items.GLOWSTONE)
                        .define('2', Items.OMINOUS_BOTTLE)
                        .define('3', Items.OMINOUS_TRIAL_KEY)
                        .define('4', Items.CROSSBOW)
                        .define('5', Items.TOTEM_OF_UNDYING)
                        .define('6', Items.COPPER_INGOT)
                        .define('7', Items.GLOWSTONE_DUST)
                        .define('8', Items.MILK_BUCKET)
                        .define('9', Items.TRIAL_KEY)
                        .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                        .unlockedBy(getHasName(Items.OMINOUS_BOTTLE), has(Items.OMINOUS_BOTTLE))
                        .unlockedBy(getHasName(Items.OMINOUS_TRIAL_KEY), has(Items.OMINOUS_TRIAL_KEY))
                        .unlockedBy(getHasName(Items.CROSSBOW), has(Items.CROSSBOW))
                        .unlockedBy(getHasName(Items.TOTEM_OF_UNDYING), has(Items.TOTEM_OF_UNDYING))
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                        .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                        .unlockedBy(getHasName(Items.TRIAL_KEY), has(Items.TRIAL_KEY))
                        .group("essences")
                        .save(output);

                shaped(RecipeCategory.BREWING, ModItems.EVERY_EFFECT_ESSENCE)
                        .pattern("121")
                        .pattern("444")
                        .pattern("323")
                        .define('1', ModItems.BENEFICIAL_ESSENCE)
                        .define('2', ModItems.NEUTRAL_ESSENCE)
                        .define('3', ModItems.HARMFUL_ESSENCE)
                        .define('4', Items.GLASS_BOTTLE)
                        .unlockedBy(getHasName(Items.GLOWSTONE), has(Items.GLOWSTONE))
                        .unlockedBy(getHasName(Items.OMINOUS_BOTTLE), has(Items.OMINOUS_BOTTLE))
                        .unlockedBy(getHasName(Items.OMINOUS_TRIAL_KEY), has(Items.OMINOUS_TRIAL_KEY))
                        .unlockedBy(getHasName(Items.CROSSBOW), has(Items.CROSSBOW))
                        .unlockedBy(getHasName(Items.TOTEM_OF_UNDYING), has(Items.TOTEM_OF_UNDYING))
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .unlockedBy(getHasName(Items.GLOWSTONE_DUST), has(Items.GLOWSTONE_DUST))
                        .unlockedBy(getHasName(Items.MILK_BUCKET), has(Items.MILK_BUCKET))
                        .unlockedBy(getHasName(Items.TRIAL_KEY), has(Items.TRIAL_KEY))
                        .group("essences")
                        .save(output);

                shapeless(RecipeCategory.BREWING, ModItems.NULL_ESSENCE)
                        .requires(ModItems.EVERY_EFFECT_ESSENCE)
                        .unlockedBy(getHasName(ModItems.EVERY_EFFECT_ESSENCE), has(ModItems.EVERY_EFFECT_ESSENCE))
                        .group("essences")
                        .save(output);

                shapeless(RecipeCategory.BREWING, ModItems.LIGHTNING_ESSENCE)
                        .requires(Items.SLIME_BALL)
                        .unlockedBy(getHasName(ModItems.EVERY_EFFECT_ESSENCE), has(ModItems.EVERY_EFFECT_ESSENCE))
                        .group("essences")
                        .save(output);

                for(Item potion : List.of(Items.POTION, Items.SPLASH_POTION, Items.LINGERING_POTION)) {
                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.LIGHTNING_ESSENCE.asItem(), ModPotions.SURGING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_lightning_essence");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.SURGING_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_SURGING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_surging_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.SURGING_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_SURGING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_surging_glowstone_dust");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.BENEFICIAL_ESSENCE.asItem(), ModPotions.BENEFICIAL_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_beneficial_essence");
                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.NEUTRAL_ESSENCE.asItem(), ModPotions.NEUTRAL_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_neutral_essence");
                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.HARMFUL_ESSENCE.asItem(), ModPotions.HARMFUL_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_harmful_essence");
                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.NULL_ESSENCE.asItem(), ModPotions.NULL_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_null_essence");
                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.EVERY_EFFECT_ESSENCE.asItem(), ModPotions.EVERY_EFFECT_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_every_effect_essence");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.IRON_CHAIN.asItem(), ModPotions.CHAIN_MAIL_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_iron_chain");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.POISONOUS_POTATO.asItem(), ModPotions.WEAK_INFECTIOUS_POISON_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_poisonous_potato");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.WEAK_INFECTIOUS_POISON_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.INFECTIOUS_POISON_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_weak_infectious_poison_glowstone_dust");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.INFECTIOUS_POISON_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_INFECTIOUS_POISON_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_infectious_poison_glowstone_dust");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.MILK_BUCKET.asItem(), ModPotions.CLEANSING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_milk_bucket");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE.asItem(), ModPotions.IMMUNE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_netherite_upgrade_smithing_template");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.POISON, Items.SPIDER_EYE.asItem(), ModPotions.TOXIC_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_poison_spider_eye");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.TOXIC_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_TOXIC_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_toxic_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.TOXIC_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_TOXIC_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_toxic_glowstone_dust");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.REGENERATION, Items.GHAST_TEAR.asItem(), ModPotions.EMISSIVE_HEALING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_regeneration_ghast_tear");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.EMISSIVE_HEALING_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_EMISSIVE_HEALING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_emissive_healing_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.EMISSIVE_HEALING_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_EMISSIVE_HEALING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_emissive_healing_glowstone_dust");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.ECHO_SHARD.asItem(), ModPotions.BLINDNESS_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_echo_shard");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.BLINDNESS_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_BLINDNESS_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_blindness_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONG_BLINDNESS_POTION, Items.REDSTONE.asItem(), ModPotions.LONGER_BLINDNESS_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_long_blindness_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONGER_BLINDNESS_POTION, Items.REDSTONE.asItem(), ModPotions.LONGEST_BLINDNESS_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_longer_blindness_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.WITHER_ROSE.asItem(), ModPotions.WITHER_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_ghast_tear");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.WITHER_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_WITHER_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_wither_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.WITHER_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_WITHER_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_wither_glowstone_dust");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.EMERALD_BLOCK.asItem(), ModPotions.HERO_OF_THE_VILLAGE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_emerald_block");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.HERO_OF_THE_VILLAGE_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_HERO_OF_THE_VILLAGE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_hero_of_the_village_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONG_HERO_OF_THE_VILLAGE_POTION, Items.REDSTONE.asItem(), ModPotions.LONGER_HERO_OF_THE_VILLAGE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_long_hero_of_the_village_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONGER_HERO_OF_THE_VILLAGE_POTION, Items.REDSTONE.asItem(), ModPotions.LONGEST_HERO_OF_THE_VILLAGE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_longer_hero_of_the_village_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.GLOWSTONE.asItem(), ModPotions.GLOWING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_glowstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.GLOWING_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_GLOWING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_glowing_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONG_GLOWING_POTION, Items.REDSTONE.asItem(), ModPotions.LONGER_GLOWING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_long_glowing_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONGER_GLOWING_POTION, Items.REDSTONE.asItem(), ModPotions.LONGEST_GLOWING_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_longer_glowing_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.SULFUR.asItem(), ModPotions.NAUSEA_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_sulphur");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.NAUSEA_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_NAUSEA_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_nausea_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONG_NAUSEA_POTION, Items.REDSTONE.asItem(), ModPotions.LONGER_NAUSEA_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_long_nausea_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONGER_NAUSEA_POTION, Items.REDSTONE.asItem(), ModPotions.LONGEST_NAUSEA_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_longer_nausea_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.NAUTILUS_SHELL.asItem(), ModPotions.BREATH_OF_THE_NAUTILUS_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_nautilus_shell");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.BREATH_OF_THE_NAUTILUS_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_BREATH_OF_THE_NAUTILUS_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_breath_of_the_nautilus_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.TROPICAL_FISH.asItem(), ModPotions.DOLPHINS_GRACE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_tropical_fish");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.DOLPHINS_GRACE_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_DOLPHINS_GRACE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_dolphins_grace_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.PRISMARINE_CRYSTALS.asItem(), ModPotions.MINING_FATIGUE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_prismarine_crystal");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.MINING_FATIGUE_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_MINING_FATIGUE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_mining_fatigue_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LONG_MINING_FATIGUE_POTION, Items.REDSTONE.asItem(), ModPotions.LONGER_MINING_FATIGUE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_long_mining_fatigue_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.MINING_FATIGUE_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_MINING_FATIGUE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_mining_fatigue_glowstone_dust");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, ModItems.FOUR_LEAF_CLOVER.asItem(), ModPotions.LUCK_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_four_leaf_clover");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LUCK_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_LUCK_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_luck_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LUCK_POTION, ModItems.FOUR_LEAF_CLOVER.asItem(), ModPotions.UNLUCK_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_luck_four_leaf_clover");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.UNLUCK_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_UNLUCK_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_unluck_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.SHULKER_SHELL.asItem(), ModPotions.LEVITATION_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_shulker_shell");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.LEVITATION_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_LEVITATION_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_levitation_redstone");

                    BrewingRecipeBuilder.brewingMix(potion, Potions.AWKWARD, Items.GOLDEN_PICKAXE.asItem(), ModPotions.HASTE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_awkward_golden_pickaxe");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.HASTE_POTION, Items.REDSTONE.asItem(), ModPotions.LONG_HASTE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_haste_redstone");
                    BrewingRecipeBuilder.brewingMix(potion, ModPotions.HASTE_POTION, Items.GLOWSTONE_DUST.asItem(), ModPotions.STRONG_HASTE_POTION)
                            .save(output, ACauldronOfPots.MOD_ID + ":brewing/" + getItemName(potion) + "_haste_glowstone_dust");
                }
            }
        };
    }

    @Override
    public String getName() {
        return "ACauldronOfPots Recipes";
    }
}
