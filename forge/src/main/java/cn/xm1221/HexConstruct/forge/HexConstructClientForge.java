package cn.xm1221.HexConstruct.forge;

import cn.xm1221.HexConstruct.HexConstructClient;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class HexConstructClientForge {
    public static void init(FMLClientSetupEvent event) {
        HexConstructClient.init();
    }
}
