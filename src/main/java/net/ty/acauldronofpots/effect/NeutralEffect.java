package net.ty.acauldronofpots.effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;

public class NeutralEffect extends MobEffect {
    protected NeutralEffect (final MobEffectCategory category, final int color) {
        super(category, color);
    }

    @Override
    public boolean applyEffectTick(ServerLevel serverLevel, LivingEntity mob, int amplification) {
        mob.addEffect(new MobEffectInstance(MobEffects.BAD_OMEN, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.GLOWING, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.RAID_OMEN, 1200));
        mob.addEffect(new MobEffectInstance(MobEffects.TRIAL_OMEN, 1200));
        mob.addEffect(new MobEffectInstance(ModEffects.CHAIN_MAIL, 1200));

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
