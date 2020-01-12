package com.example.plugin;

import me.wilsonhu.ozzie.Ozzie;
import me.wilsonhu.ozzie.core.i18n.TranslatableText;
import me.wilsonhu.ozzie.core.plugin.Plugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExamplePlugin extends Plugin {

    private static final Logger log = LogManager.getLogger(ExamplePlugin.class);

    public void onEnable(Ozzie ozzie){
        log.info("Example Plugin coming...");
        log.info(new TranslatableText("exampleid.test", "en_US").toString());
        log.info(new TranslatableText("exampleid.test2", "en_US").toString());
        log.info(new TranslatableText("exampleid.test", "es_MX").toString());
        log.info(new TranslatableText("exampleid.test2", "es_MX").toString());
    }

    public void onDisable(Ozzie ozzie){
        log.info("Example Plugin leaving...");
    }
}
