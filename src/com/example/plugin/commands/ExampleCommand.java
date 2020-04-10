package com.example.plugin.commands;

import me.wilsonhu.ozzie.Ozzie;
import me.wilsonhu.ozzie.core.command.Command;
import me.wilsonhu.ozzie.core.i18n.ParsableText;
import me.wilsonhu.ozzie.core.i18n.TranslatableText;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class ExampleCommand extends Command {
    public ExampleCommand() {
        super(new String[]{"examplecommand"}, "exampleid.examplecommanddesc", "%s");
    }

    @Override
    public void onCommand(String full, String[] args, MessageReceivedEvent event, Ozzie ozzie) throws Exception {
        event.getChannel().sendMessage(new ParsableText(new TranslatableText("exampleid.test", event), event.getAuthor().getName()).toString()).queue();
    }
}
