package net.ty.acauldronofpots.effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class HarmfulEffect extends MobEffect {
    protected HarmfulEffect(final MobEffectCategory category, final int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {
        mob.addEffect(new MobEffectInstance(ModEffects.STRONG_INFECTIOUS_POISON, 1200));
        mob.addEffect(new MobEffectInstance(ModEffects.SURGING, 1200));
        mob.addEffect(new MobEffectInstance(ModEffects.TOXIC, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 1200));;
        mob.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.HUNGER, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.INFESTED, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.MINING_FATIGUE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.OOZING, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.POISON, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.WEAVING, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.WITHER, 1200));

        return super.applyEffectTick(serverLevel, mob, amplification);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplification) {
        int interval = 300 >> amplification;
        if (interval > 0) {
            return tickCount % interval == 0;
        } else {
            return true;
        }
    }
}
