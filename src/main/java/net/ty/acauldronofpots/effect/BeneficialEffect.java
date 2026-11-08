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
        mob.addEffect(new MobEffectInstance(ModEffects.IMMUNE, 400));
        mob.addEffect(new MobEffectInstance(ModEffects.EMISSIVE_HEALING, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.BREATH_OF_THE_NAUTILUS, 400));;
        mob.addEffect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.HASTE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.INSTANT_HEALTH, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.JUMP_BOOST, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.LUCK, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.SATURATION, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.SPEED, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.STRENGTH, 400));
        mob.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400));

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