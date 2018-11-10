package fr.kerlann.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.kerlann.TileEntity.TileBlockShape;
import fr.kerlann.render.RenderBlockShape;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy{


    public static int RenderID;
    @Override
    public void register() {
        RenderID = RenderingRegistry.getNextAvailableRenderId();
        GameRegistry.registerTileEntity(TileBlockShape.class, "TileBlockShape");
        ClientRegistry.bindTileEntitySpecialRenderer(TileBlockShape.class, new RenderBlockShape());
    }

}
