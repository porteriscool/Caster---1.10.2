package com.porteriscool.caster.proxy;

import com.porteriscool.caster.init.ModelHandler;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenders()
    {
        ModelHandler.init();
    }
}
