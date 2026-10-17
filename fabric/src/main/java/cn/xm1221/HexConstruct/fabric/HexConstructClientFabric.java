package cn.xm1221.HexConstruct.fabric;

import cn.xm1221.HexConstruct.HexConstructClient;
import net.fabricmc.api.ClientModInitializer;

public class HexConstructClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HexConstructClient.init();
    }
}
