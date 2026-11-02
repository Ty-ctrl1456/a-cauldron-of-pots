package net.ty.acauldronofpots.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class NullEffect extends MobEffect {
    public NullEffect(MobEffectCategory category, int color) {
        super(category, color);
    }
    //lollllllllll

    @Override
    public void onEffectStarted(LivingEntity mob, int amplifier) {
        super.onEffectStarted(mob, amplifier);
    }
}
