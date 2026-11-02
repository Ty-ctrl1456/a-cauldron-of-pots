package net.ty.acauldronofpots.effect;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.*;
import net.minecraft.world.phys.Vec3;
import org.joml.Vector3f;

class StrongSurgingEffect extends MobEffect {

    protected StrongSurgingEffect(final MobEffectCategory category, final int color) {
        super(category, color, ParticleTypes.ELECTRIC_SPARK);
    }
    public boolean applyEffectTick(final ServerLevel level, final LivingEntity mob, final int amplification) {
        if (mob.getHealth() > 0.5F || mob.isBaby()) {
            //int damageMultiplier = amplification > 0 ? 3 : 1;
            mob.hurtServer(level, mob.damageSources().magic(), 1.0F * (amplification));
            this.spawnLightningBolt(level, mob, mob.getX(), mob.getY() + (double)mob.getBbHeight() / (double)2.0F, mob.getZ());
        }
        return true;
    }


    private void spawnLightningBolt(final ServerLevel level, final LivingEntity mob, final double x, final double y, final double z) {
        LightningBolt lightningBolt = (LightningBolt) EntityTypes.LIGHTNING_BOLT.create(level, EntitySpawnReason.TRIGGERED);
        if (lightningBolt != null) {
            RandomSource random = mob.getRandom();
            float angle = ((float)Math.PI / 2F);
            float randomAngle = Mth.randomBetween(random, (-(float)Math.PI / 2F), ((float)Math.PI / 2F));
            Vector3f viewDirection = mob.getLookAngle().toVector3f().mul(0.3F).mul(1.0F, 1.5F, 1.0F).rotateY(randomAngle);
            lightningBolt.snapTo(x, y, z, level.getRandom().nextFloat() * 360.0F, 0.0F);
            lightningBolt.setDeltaMovement(new Vec3(viewDirection));
            level.addFreshEntity(lightningBolt);
            lightningBolt.playSound(SoundEvents.LIGHTNING_BOLT_THUNDER);
        }
    }
    public boolean shouldApplyEffectTickThisTick(final int tickCount, final int amplification) {
        int rand_damage_interval = (75 - amplification) + (int)(Math.random() * (((325 - amplification) - (75 - (amplification)) + 1)));
        int interval = rand_damage_interval >> amplification;
        if (interval > 0) {
            return tickCount % interval == 0;
        } else {
            return true;
        }
    }
}
