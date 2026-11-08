package net.ty.acauldronofpots.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.ty.acauldronofpots.effect.ModEffects;

public class ModFoods {
    public static final FoodProperties LIGHTNING_ESSENCE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final Consumable LIGHTNING_ESSENCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0.8f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.SURGING, 325), 0.95f)).build();

    public static final FoodProperties HARMFUL_ESSENCE = new FoodProperties.Builder().nutrition(0).saturationModifier(0.0f).build();
    public static final Consumable HARMFUL_ESSENCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.4f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.HARMFUL, 20), 1.0f)).build();

    public static final FoodProperties BENEFICIAL_ESSENCE = new FoodProperties.Builder().nutrition(20).saturationModifier(20.0f).build();
    public static final Consumable BENEFICIAL_ESSENCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.BENEFICIAL, 20), 1.0f)).build();

    public static final FoodProperties NEUTRAL_ESSENCE = new FoodProperties.Builder().nutrition(10).saturationModifier(10.0f).build();
    public static final Consumable NEUTRAL_ESSENCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1.2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.NEUTRAL, 20), 1.0f)).build();

    public static final FoodProperties NULL_ESSENCE = new FoodProperties.Builder().nutrition(0).saturationModifier(0.0f).build();
    public static final Consumable NULL_ESSENCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(0f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.NULL_EFFECT, 1), 1.0f)).build();

    public static final FoodProperties EVERY_EFFECT_ESSENCE = new FoodProperties.Builder().nutrition(20).saturationModifier(20.0f).build();
    public static final Consumable EVERY_EFFECT_ESSENCE_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.EVERY_EFFECT, 20), 1.0f)).build();
}
