package cn.xm1221.HexConstruct.forge;

import cn.xm1221.HexConstruct.HexConstruct;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HexConstruct.MOD_ID)
public class HexConstructForge {
    public HexConstructForge() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(HexConstruct.MOD_ID, bus);
        bus.addListener(HexConstructClientForge::init);
        HexConstruct.init();
    }
}
