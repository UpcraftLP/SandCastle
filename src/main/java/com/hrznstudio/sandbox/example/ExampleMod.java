package com.hrznstudio.sandbox.example;

import com.hrznstudio.sandbox.api.SandboxAPI;
import com.hrznstudio.sandbox.api.addon.Addon;

public class ExampleMod implements Addon {
    @Override
    public void init(SandboxAPI api) {
        api.getLog().info("Loading Example Addon");
    }

    @Override
    public void register() {

    }
}
