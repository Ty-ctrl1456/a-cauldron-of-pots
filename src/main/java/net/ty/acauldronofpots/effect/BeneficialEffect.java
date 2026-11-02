package net.ty.acauldronofpots.effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class BeneficialEffect extends MobEffect {

    protected BeneficialEffect(final MobEffectCategory category, final int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {
        mob.addEffect(new MobEffectInstance(ModEffects.IMMUNE, 1200));
        mob.addEffect(new MobEffectInstance(ModEffects.EMISSIVE_HEALING, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.BREATH_OF_THE_NAUTILUS, 1200));;
        mob.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.HASTE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.LUCK, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.SATURATION, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.SPEED, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 1200));

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