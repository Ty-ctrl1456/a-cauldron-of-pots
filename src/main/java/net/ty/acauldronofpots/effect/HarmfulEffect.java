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
        mob.addEffect(new MobEffectInstance(ModEffects.STRONG_INFECTIOUS_POISON, 400));
        mob.addEffect(new MobEffectInstance(ModEffects.SURGING, 400));
        mob.addEffect(new MobEffectInstance(ModEffects.TOXIC, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 400));;
        mob.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.HUNGER, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.INFESTED, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.INSTANT_DAMAGE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.MINING_FATIGUE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.NAUSEA, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.OOZING, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.POISON, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.WEAVING, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.WIND_CHARGED, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.WITHER, 400));

        return super.applyEffectTick(serverLevel, mob, amplification);
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int tickCount, int amplification) {
        int interval = 20 >> amplification;
        if (interval > 0) {
            return tickCount % interval == 0;
        } else {
            return true;
        }
    }
}
