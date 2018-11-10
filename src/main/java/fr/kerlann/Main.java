package fr.kerlann;

import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.kerlann.block.BlockShape;
import fr.kerlann.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "CustomBlock";
    public static final String VERSION = "1.0";
    @SidedProxy(clientSide = "fr.kerlann.proxy.ClientProxy", serverSide = "fr.kerlann.proxy.CommonProxy")
    public static CommonProxy proxy;

    public static Block Block_Shape;


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        //Add Block
        Block_Shape = new BlockShape(Material.leaves).setBlockName("BlockShape").setBlockTextureName("customblock:BlockShape").setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(Block_Shape, "BlockShape");


        proxy.register();
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }
}
