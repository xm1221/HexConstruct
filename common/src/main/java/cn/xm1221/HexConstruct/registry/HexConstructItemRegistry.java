package cn.xm1221.HexConstruct.registry;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static cn.xm1221.HexConstruct.HexConstruct.MOD_ID;

public class HexConstructItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_KEY);

    public static void init() {
        ITEMS.register();
    }
}
