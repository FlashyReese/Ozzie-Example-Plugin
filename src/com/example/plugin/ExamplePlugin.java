package com.example.plugin;

import com.example.plugin.commands.ExampleCommand;
import me.wilsonhu.ozzie.Ozzie;
import me.wilsonhu.ozzie.core.plugin.Plugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExamplePlugin extends Plugin {

    private static final Logger log = LogManager.getLogger(ExamplePlugin.class);

    public void onEnable(Ozzie ozzie){
        log.info("Example Plugin coming...");
        getCommands().add(new ExampleCommand());
    }

    public void onDisable(Ozzie ozzie){
        log.info("Example Plugin leaving...");
    }
}
