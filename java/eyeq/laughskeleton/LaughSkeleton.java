package eyeq.laughskeleton;

import eyeq.laughskeleton.event.LaughSkeletonEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static eyeq.laughskeleton.LaughSkeleton.MOD_ID;

@Mod(modid = MOD_ID, version = "1.0", dependencies = "after:eyeq_util")
public class LaughSkeleton {
    public static final String MOD_ID = "eyeq_laughskeleton";

    @Mod.Instance(MOD_ID)
    public static LaughSkeleton instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new LaughSkeletonEventHandler());
    }
}
