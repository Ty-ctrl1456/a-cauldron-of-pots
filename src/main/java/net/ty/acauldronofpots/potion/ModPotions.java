package net.ty.acauldronofpots.potion;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.ty.acauldronofpots.ACauldronOfPots;
import net.ty.acauldronofpots.effect.ModEffects;

public class ModPotions {

    private static Holder<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerForHolder(
                BuiltInRegistries.POTION,
                Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name),
                potion
        );
    }

    public static final Holder<Potion> SURGING_POTION = registerPotion("surging_potion",
            new Potion("surging_potion", new MobEffectInstance(ModEffects.SURGING, 600)));
    public static final Holder<Potion> STRONG_SURGING_POTION = registerPotion("strong_surging_potion",
            new Potion("surging_potion", new MobEffectInstance(ModEffects.STRONG_SURGING, 320)));
    public static final Holder<Potion> LONG_SURGING_POTION = registerPotion("long_surging_potion",
            new Potion("surging_potion", new MobEffectInstance(ModEffects.SURGING, 1200)));

    public static final Holder<Potion> CHAIN_MAIL_POTION = registerPotion("chain_mail_potion",
            new Potion("chain_mail_potion", new MobEffectInstance(ModEffects.CHAIN_MAIL, 1200, 0, true, false)));



    public static final Holder<Potion> WEAK_INFECTIOUS_POISON_POTION = registerPotion("weak_infectious_poison",
            new Potion("infectious_poison_potion", new MobEffectInstance(ModEffects.WEAK_INFECTIOUS_POISON, 1200, 0)));
    public static final Holder<Potion> INFECTIOUS_POISON_POTION = registerPotion("infectious_poison",
            new Potion("infectious_poison_potion", new MobEffectInstance(ModEffects.INFECTIOUS_POISON, 1200, 0)));
    public static final Holder<Potion> STRONG_INFECTIOUS_POISON_POTION = registerPotion("strong_infectious_poison",
            new Potion("infectious_poison_potion", new MobEffectInstance(ModEffects.STRONG_INFECTIOUS_POISON, 1200, 0)));

    public static final Holder<Potion> CLEANSING_POTION = registerPotion("cleansing_potion",
            new Potion("cleansing_potion", new MobEffectInstance(ModEffects.CLEANSING, 20, 0)));

    public static final Holder<Potion> IMMUNE_POTION = registerPotion("immune_potion",
            new Potion("immune_potion", new MobEffectInstance(ModEffects.IMMUNE, 72000, 0)));

    public static final Holder<Potion> BENEFICIAL_POTION = registerPotion("beneficial_potion",
            new Potion("beneficial_potion", new MobEffectInstance(ModEffects.BENEFICIAL, 9600, 0)));
    public static final Holder<Potion> HARMFUL_POTION = registerPotion("harmful_potion",
            new Potion("harmful_potion", new MobEffectInstance(ModEffects.HARMFUL, 9600, 0)));
    public static final Holder<Potion> NEUTRAL_POTION = registerPotion("neutral_potion",
            new Potion("neutral_potion", new MobEffectInstance(ModEffects.NEUTRAL, 9600, 0)));
    public static final Holder<Potion> EVERY_EFFECT_POTION = registerPotion("every_effect_potion",
            new Potion("every_effect_potion", new MobEffectInstance(ModEffects.EVERY_EFFECT, 9600, 0)));
    public static final Holder<Potion> NULL_POTION = registerPotion("null_potion",
            new Potion("null_potion", new MobEffectInstance(ModEffects.NULL_EFFECT, 9600, 0)));

    public static final Holder<Potion> TOXIC_POTION = registerPotion("toxic_potion",
            new Potion("toxic_potion", new MobEffectInstance(ModEffects.TOXIC, 320)));
    public static final Holder<Potion> LONG_TOXIC_POTION = registerPotion("long_toxic_potion",
            new Potion("toxic_potion", new MobEffectInstance(ModEffects.TOXIC, 900)));
    public static final Holder<Potion> STRONG_TOXIC_POTION = registerPotion("strong_toxic_potion",
            new Potion("toxic_potion", new MobEffectInstance(ModEffects.STRONG_TOXIC, 240)));
    public static final Holder<Potion> EMISSIVE_HEALING_POTION = registerPotion("emissive_healing_potion",
            new Potion("emissive_healing_potion", new MobEffectInstance(ModEffects.EMISSIVE_HEALING, 320)));
    public static final Holder<Potion> STRONG_EMISSIVE_HEALING_POTION = registerPotion("strong_emissive_healing_potion",
            new Potion("emissive_healing_potion", new MobEffectInstance(ModEffects.STRONG_EMISSIVE_HEALING, 240)));
    public static final Holder<Potion> LONG_EMISSIVE_HEALING_POTION = registerPotion("long_emissive_healing_potion",
            new Potion("emissive_healing_potion", new MobEffectInstance(ModEffects.EMISSIVE_HEALING, 900)));



    public static final Holder<Potion> BLINDNESS_POTION = registerPotion("blindness_potion",
            new Potion("blindness_potion", new MobEffectInstance(MobEffects.BLINDNESS, 1800)));
    public static final Holder<Potion> LONG_BLINDNESS_POTION = registerPotion("long_blindness_potion",
            new Potion("blindness_potion", new MobEffectInstance(MobEffects.BLINDNESS, 9600)));
    public static final Holder<Potion> LONGER_BLINDNESS_POTION = registerPotion("2blindness_potion",
            new Potion("blindness_potion", new MobEffectInstance(MobEffects.BLINDNESS, 38800)));
    public static final Holder<Potion> LONGEST_BLINDNESS_POTION = registerPotion("3blindness_potion",
            new Potion("blindness_potion", new MobEffectInstance(MobEffects.BLINDNESS, 72000)));

    public static final Holder<Potion> WITHER_POTION = registerPotion("wither_potion",
            new Potion("wither_potion", new MobEffectInstance(MobEffects.WITHER, 320)));
    public static final Holder<Potion> STRONG_WITHER_POTION = registerPotion("strong_wither_potion",
            new Potion("wither_potion", new MobEffectInstance(MobEffects.WITHER, 320, 1)));
    public static final Holder<Potion> LONG_WITHER_POTION = registerPotion("long_wither_potion",
            new Potion("wither_potion", new MobEffectInstance(MobEffects.WITHER, 600)));

    public static final Holder<Potion> BREATH_OF_THE_NAUTILUS_POTION = registerPotion("breath_of_the_nautilus_potion",//hi
            new Potion("breath_of_the_nautilus_potion", new MobEffectInstance(MobEffects.BREATH_OF_THE_NAUTILUS, 1800)));
    public static final Holder<Potion> LONG_BREATH_OF_THE_NAUTILUS_POTION = registerPotion("long_breath_of_the_nautilus_potion",
            new Potion("breath_of_the_nautilus_potion", new MobEffectInstance(MobEffects.BREATH_OF_THE_NAUTILUS, 9600)));

    public static final Holder<Potion> DOLPHINS_GRACE_POTION = registerPotion("dolphins_potion",
            new Potion("dolphins_grace_potion", new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 320)));
    public static final Holder<Potion> LONG_DOLPHINS_GRACE_POTION = registerPotion("long_dolphins_potion",
            new Potion("dolphins_grace_potion", new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200)));

    public static final Holder<Potion> HERO_OF_THE_VILLAGE_POTION = registerPotion("hero_of_the_village_potion",
            new Potion("hero_of_the_village_potion", new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1800)));
    public static final Holder<Potion> LONG_HERO_OF_THE_VILLAGE_POTION = registerPotion("1hero_of_the_village_potion",
            new Potion("hero_of_the_village_potion", new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 9600)));
    public static final Holder<Potion> LONGER_HERO_OF_THE_VILLAGE_POTION = registerPotion("2hero_of_the_village_potion",
            new Potion("hero_of_the_village_potion", new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 28800)));
    public static final Holder<Potion> LONGEST_HERO_OF_THE_VILLAGE_POTION = registerPotion("3hero_of_the_village_potion",
            new Potion("hero_of_the_village_potion", new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 72000)));

    public static final Holder<Potion> GLOWING_POTION = registerPotion("glowing_potion",
            new Potion("glowing_potion", new MobEffectInstance(MobEffects.GLOWING, 1800)));
    public static final Holder<Potion> LONG_GLOWING_POTION = registerPotion("1glowing_potion",
            new Potion("glowing_potion", new MobEffectInstance(MobEffects.GLOWING, 9600)));
    public static final Holder<Potion> LONGER_GLOWING_POTION = registerPotion("2glowing_potion",
            new Potion("glowing_potion", new MobEffectInstance(MobEffects.GLOWING, 38800)));
    public static final Holder<Potion> LONGEST_GLOWING_POTION = registerPotion("3glowing_potion",
            new Potion("glowing_potion", new MobEffectInstance(MobEffects.GLOWING, 72000)));

    public static final Holder<Potion> NAUSEA_POTION = registerPotion("nausea_potion",
            new Potion("nausea_potion", new MobEffectInstance(MobEffects.NAUSEA, 1800)));
    public static final Holder<Potion> LONG_NAUSEA_POTION = registerPotion("1nausea_potion",
            new Potion("nausea_potion", new MobEffectInstance(MobEffects.NAUSEA, 9600)));
    public static final Holder<Potion> LONGER_NAUSEA_POTION = registerPotion("2nausea_potion",
            new Potion("nausea_potion", new MobEffectInstance(MobEffects.NAUSEA, 38800)));
    public static final Holder<Potion> LONGEST_NAUSEA_POTION = registerPotion("3nausea_potion",
            new Potion("nausea_potion", new MobEffectInstance(MobEffects.NAUSEA, 72000)));

    public static final Holder<Potion> MINING_FATIGUE_POTION = registerPotion("mining_fatigue_potion",
            new Potion("mining_fatigue_potion", new MobEffectInstance(MobEffects.MINING_FATIGUE, 400)));
    public static final Holder<Potion> STRONG_MINING_FATIGUE_POTION = registerPotion("strong_mining_fatigue_potion",
            new Potion("mining_fatigue_potion", new MobEffectInstance(MobEffects.MINING_FATIGUE, 320, 1)));
    public static final Holder<Potion> LONG_MINING_FATIGUE_POTION = registerPotion("long_mining_fatigue_potion",
            new Potion("mining_fatigue_potion", new MobEffectInstance(MobEffects.MINING_FATIGUE, 1200)));
    public static final Holder<Potion> LONGER_MINING_FATIGUE_POTION = registerPotion("longer_mining_fatigue_potion",
            new Potion("mining_fatigue_potion", new MobEffectInstance(MobEffects.MINING_FATIGUE, 3600)));

    public static final Holder<Potion> LUCK_POTION = registerPotion("luck_potion",
            new Potion("luck_potion", new MobEffectInstance(MobEffects.LUCK, 1800)));
    public static final Holder<Potion> LONG_LUCK_POTION = registerPotion("long_luck_potion",
            new Potion("luck_potion", new MobEffectInstance(MobEffects.LUCK, 9600)));

    public static final Holder<Potion> UNLUCK_POTION = registerPotion("unluck_potion",
            new Potion("unluck_potion", new MobEffectInstance(MobEffects.LUCK, 1800)));
    public static final Holder<Potion> LONG_UNLUCK_POTION = registerPotion("long_unluck_potion",
            new Potion("unluck_potion", new MobEffectInstance(MobEffects.LUCK, 9600)));

    public static final Holder<Potion> LEVITATION_POTION = registerPotion("levitation_potion",
            new Potion("levitation_potion", new MobEffectInstance(MobEffects.LEVITATION, 240)));
    public static final Holder<Potion> LONG_LEVITATION_POTION = registerPotion("long_levitation_potion",
            new Potion("levitation_potion", new MobEffectInstance(MobEffects.LEVITATION, 480)));

    public static final Holder<Potion> HASTE_POTION = registerPotion("haste_potion",
            new Potion("haste_potion", new MobEffectInstance(MobEffects.HASTE, 3600)));
    public static final Holder<Potion> STRONG_HASTE_POTION = registerPotion("strong_haste_potion",
            new Potion("haste_potion", new MobEffectInstance(MobEffects.HASTE, 3600, 1)));
    public static final Holder<Potion> LONG_HASTE_POTION = registerPotion("long_haste_potion",
            new Potion("haste_potion", new MobEffectInstance(MobEffects.HASTE, 9600)));


    //private static Holder<Potion> registerPotion(String name, Potion potion) {
    //    return Registry.registerForHolder(BuiltInRegistries.POTION, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name), potion);
    //}

    public static void registerPotions() {
        ACauldronOfPots.LOGGER.info("Registering potions for " + ACauldronOfPots.MOD_ID);
    }
}
