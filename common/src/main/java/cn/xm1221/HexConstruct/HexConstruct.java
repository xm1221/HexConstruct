package cn.xm1221.HexConstruct;

import cn.xm1221.HexConstruct.registry.HexConstructIotaTypeRegistry;
import cn.xm1221.HexConstruct.registry.HexConstructItemRegistry;
import cn.xm1221.HexConstruct.registry.HexConstructPatternRegistry;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HexConstruct {
    public static final String MOD_ID = "hexconstruct";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {
        HexConstructItemRegistry.init();
        HexConstructIotaTypeRegistry.init();
        HexConstructPatternRegistry.init();
    }

    public static Identifier id(String path) {
        return new Identifier(MOD_ID, path);
    }
}
