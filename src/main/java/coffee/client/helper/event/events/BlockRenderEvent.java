/*
 * Copyright (c) 2022 Coffee client, 0x150 and contributors. See copyright file in project root.
 */

package coffee.client.helper.event.events;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;

public class BlockRenderEvent extends RenderEvent {

    final BlockPos bp;
    final BlockState state;

    public BlockRenderEvent(MatrixStack stack, BlockPos pos, BlockState state) {
        super(stack);
        this.bp = pos;
        this.state = state;
    }

    @SuppressWarnings("unused")
    public BlockPos getPosition() {
        return bp;
    }

    public BlockState getBlockState() {
        return state;
    }
}
