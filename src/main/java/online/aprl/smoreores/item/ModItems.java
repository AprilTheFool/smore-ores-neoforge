package online.aprl.smoreores.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("smoreores");

    public static final DeferredItem<Item> BAZINGIUM = ITEMS.register("bazingium",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BAZINGIUM = ITEMS.register("raw_bazingium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
