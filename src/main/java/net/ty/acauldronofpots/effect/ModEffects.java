package net.ty.acauldronofpots.effect;

import net.ty.acauldronofpots.ACauldronOfPots;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

public class ModEffects {
    public static final Holder<MobEffect> SURGING = registerMobEffect("surging",
            new SurgingEffect(MobEffectCategory.HARMFUL, 0xFFFF82));
    public static final Holder<MobEffect> STRONG_SURGING = registerMobEffect("strong_surging",
            new StrongSurgingEffect(MobEffectCategory.HARMFUL, 0xFFFF82));

    public static final Holder<MobEffect> CHAIN_MAIL = registerMobEffect("chain_mail",
            new ChainMailEffect(MobEffectCategory.NEUTRAL, 0xff00c2));

    public static final Holder<MobEffect> BENEFICIAL = registerMobEffect("beneficial",
            new BeneficialEffect(MobEffectCategory.BENEFICIAL, 0x44ff00));
    public static final Holder<MobEffect> HARMFUL = registerMobEffect("harmful",
            new HarmfulEffect(MobEffectCategory.HARMFUL, 0xff0000));
    public static final Holder<MobEffect> NEUTRAL = registerMobEffect("neutral",
            new NeutralEffect(MobEffectCategory.NEUTRAL, 0xffc900));
    public static final Holder<MobEffect> EVERY_EFFECT = registerMobEffect("every_effect",
            new EveryEffectEffect(MobEffectCategory.NEUTRAL, 0x000000));
    public static final Holder<MobEffect> NULL_EFFECT = registerMobEffect("null",
            new NullEffect(MobEffectCategory.NEUTRAL, 0xffffff));

    public static final Holder<MobEffect> IMMUNE = registerMobEffect("immune",
            new ImmuneEffect(MobEffectCategory.BENEFICIAL, 0x3ffdff));

    public static final Holder<MobEffect> TOXIC = registerMobEffect("toxic",
            new ToxicEffect(MobEffectCategory.HARMFUL, 0x13291D));
    public static final Holder<MobEffect> STRONG_TOXIC = registerMobEffect("strong_toxic",
            new StrongToxicEffect(MobEffectCategory.HARMFUL, 0x13291D));

    public static final Holder<MobEffect> EMISSIVE_HEALING = registerMobEffect("emissive_healing",
            new EmissiveHealingEffect(MobEffectCategory.BENEFICIAL, 0xFFF13B));
    public static final Holder<MobEffect> STRONG_EMISSIVE_HEALING = registerMobEffect("strong_emissive_healing",
            new StrongEmissiveHealingEffect(MobEffectCategory.BENEFICIAL, 0xFFF13B));

    public static final Holder<MobEffect> CLEANSING = registerMobEffect("cleansing",
            new CleansingEffect(MobEffectCategory.NEUTRAL, 0x86ffe1));

    public static final Holder<MobEffect> WEAK_INFECTIOUS_POISON = registerMobEffect("weak_infectious_poison",
            new WeakInfectiousPoisonEffect(MobEffectCategory.HARMFUL, 0x284227));
    public static final Holder<MobEffect> INFECTIOUS_POISON = registerMobEffect("infectious_poison",
            new InfectiousPoisonEffect(MobEffectCategory.HARMFUL, 0x284227));
    public static final Holder<MobEffect> STRONG_INFECTIOUS_POISON = registerMobEffect("strong_infectious_poison",
            new StrongInfectiousPoisonEffect(MobEffectCategory.HARMFUL, 0x284227));


    private static Holder<MobEffect> registerMobEffect(String name, MobEffect effect) {
        return Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(ACauldronOfPots.MOD_ID, name), effect);
    }

    public static void registerEffects() {
        ACauldronOfPots.LOGGER.info("Registering effects for " + ACauldronOfPots.MOD_ID);
    }
}
