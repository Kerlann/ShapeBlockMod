package fr.kerlann.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fr.kerlann.TileEntity.TileBlockShape;
import fr.kerlann.proxy.ClientProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockShape extends Block {

    public BlockShape(Material material)
    {
        super(material);
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new TileBlockShape();
    }

    @Override
    public boolean hasTileEntity(int metadata)
    {
        return true;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    @SideOnly(Side.CLIENT)
    public int getRenderType()
    {
        return ClientProxy.RenderID;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z)
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
    }


    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityliving, ItemStack itemStack)
    {
        int blockSet = world.getBlockMetadata(x, y, z) / 4;
        int direction = MathHelper.floor_double((entityliving.rotationYaw * 4F) / 360F + 0.5D) & 3;
        int newMeta = (blockSet * 4) + direction;
        world.setBlockMetadataWithNotify(x, y, z, newMeta, 0);
    }
}
