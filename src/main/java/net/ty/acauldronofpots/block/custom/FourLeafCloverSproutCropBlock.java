package net.ty.acauldronofpots.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.ty.acauldronofpots.item.ModItems;

public class FourLeafCloverSproutCropBlock extends CropBlock {
    public FourLeafCloverSproutCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.FOUR_LEAF_CLOVER_SEEDS;
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockState stateBelow = level.getBlockState(pos.below());
        return stateBelow.is(Blocks.WATER);
    }
}
