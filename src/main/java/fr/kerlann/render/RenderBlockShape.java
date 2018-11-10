package fr.kerlann.render;

import fr.kerlann.TileEntity.TileBlockShape;
import fr.kerlann.model.ModelShape;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderBlockShape extends TileEntitySpecialRenderer {

    public static ModelShape model = new ModelShape();
    public static ResourceLocation shape = new ResourceLocation("customblock", "textures/models/Skin_Block_Shape.png");

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float partialRenderTick)
    {
        this.renderTileEntityEssenceAt((TileBlockShape)tile, x, y, z, partialRenderTick);
    }

    private void renderTileEntityEssenceAt(TileBlockShape tile, double x, double y, double z, float partialRenderTick)
    {
        GL11.glPushMatrix();
        switch(tile.getBlockMetadata() % 4) {
            case 0:
                GL11.glTranslated(x, y, z+1F);
                GL11.glRotatef(0F, 0F, 1F, 0.0F);
                break;
            case 3:
                GL11.glTranslated(x+1F, y, z+1F);
                GL11.glRotatef(90F, 0F, 1F, 0.0F);
                break;
            case 2:
                GL11.glTranslated(x+1F, y, z);
                GL11.glRotatef(180F, 0F, 1F, 0.0F);
                break;
            case 1:
                GL11.glTranslated(x, y, z);
                GL11.glRotatef(270F, 0F, 1F, 0.0F);
                break;
        }
        GL11.glRotatef(180F, 1F, 0F, 0.0F);
        this.bindTexture(shape);
        model.render();
        GL11.glPopMatrix();
    }
}
