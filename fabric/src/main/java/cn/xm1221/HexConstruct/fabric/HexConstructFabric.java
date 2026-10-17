package cn.xm1221.HexConstruct.fabric;

import cn.xm1221.HexConstruct.HexConstruct;
import net.fabricmc.api.ModInitializer;

public class HexConstructFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        HexConstruct.init();
    }
}
