package net.ty.acauldronofpots.effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.phys.AABB;

import java.util.List;

class InfectiousPoisonEffect extends MobEffect {

    public InfectiousPoisonEffect(MobEffectCategory category, int color) {
        super(category, color, ParticleTypes.WITCH);

    }

    @Override
    public void onEffectStarted(LivingEntity mob, int amplifier) {
        if (mob.hasEffect(ModEffects.IMMUNE)){
            mob.removeEffect(ModEffects.INFECTIOUS_POISON);
        }
        super.onEffectStarted(mob, amplifier);
    }

    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {

        AABB boundingBox = mob.getBoundingBox().inflate(amplification + 9);
        List<Entity> entities = serverLevel.getEntities(mob, boundingBox);
        for(Entity entity : entities) {
            if(entity instanceof LivingEntity livingEntity && !livingEntity.hasEffect(ModEffects.STRONG_INFECTIOUS_POISON) && !livingEntity.hasEffect(ModEffects.INFECTIOUS_POISON)) {
                livingEntity.addEffect(new MobEffectInstance(ModEffects.INFECTIOUS_POISON, 900));
            }
        }

        if (mob.hasEffect(ModEffects.STRONG_INFECTIOUS_POISON) && mob.hasEffect(ModEffects.INFECTIOUS_POISON)){
            mob.removeEffect(ModEffects.STRONG_INFECTIOUS_POISON);
        } else if (mob.hasEffect(ModEffects.WEAK_INFECTIOUS_POISON) && mob.hasEffect(ModEffects.INFECTIOUS_POISON)) {
            mob.removeEffect(ModEffects.WEAK_INFECTIOUS_POISON);
        }


        if (mob.getHealth() > 1.0F) {
            mob.hurtServer(serverLevel, mob.damageSources().magic(), 1.0F);
        }

        int randShift = (int) (Math.random()*1000) + 1;
        if (randShift <= 4){
            mob.addEffect(new MobEffectInstance(ModEffects.WEAK_INFECTIOUS_POISON, 900));
        }else if (randShift <= 6){
            mob.addEffect(new MobEffectInstance(ModEffects.STRONG_INFECTIOUS_POISON, 900));
        }else if (randShift <= 8){
            mob.removeEffect(ModEffects.INFECTIOUS_POISON);
            mob.addEffect(new MobEffectInstance(ModEffects.IMMUNE, 1200));
        }
        return true;
    }


    @Override
    public boolean shouldApplyEffectTickThisTick(final int tickCount, final int amplification) {
        int interval = 50 >> amplification;
        if (interval > 0) {
            return tickCount % interval == 0;
        } else {
            return true;
        }
    }


}
