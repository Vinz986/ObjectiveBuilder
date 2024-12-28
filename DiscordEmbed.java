package de.neolands.discord;

import net.dv8tion.jda.api.EmbedBuilder;

import java.awt.*;

public class DiscordEmbed {
    private EmbedBuilder embed;

    public DiscordEmbed(){
        embed = new EmbedBuilder();
    }
    public DiscordEmbed setTitle(String title){
        embed.setTitle(title);
        return this;
    }
    public DiscordEmbed setAuthor(String author){
        embed.setAuthor(author);
        return this;
    }
    public DiscordEmbed setDescription(String description){
        embed.setDescription(description);
        return this;
    }
    public DiscordEmbed setFooter(String footer){
        embed.setFooter(footer);
        return this;
    }
    public DiscordEmbed setColor(Color color) {
        embed.setColor(color);
        return this;
    }
    public DiscordEmbed setColor(int color) {
        embed.setColor(color);
        return this;
    }
    public DiscordEmbed setImage(String url) {
        embed.setImage(url);
        return this;
    }
    public DiscordEmbed setThumbnail(String url) {
        embed.setThumbnail(url);
        return this;

    }
    public EmbedBuilder build(){
        embed.build();
        return embed;
    }
}
