package com.porteriscool.caster.proxy;

import com.porteriscool.caster.init.ModelHandler;
import com.porteriscool.caster.reference.Reference;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ModelHandler.init();
    }

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);

        //ModRenderers.preInit();

        OBJLoader.INSTANCE.addDomain(Reference.MOD_ID);
    }
}
