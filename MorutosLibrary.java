//You will have to add in the imports and the package manually

public class MorutosLibrary {

	public void sendMessage(Player player, String message) {
		player.SendMessage(ChatColor.translateAlternativeColorCodes('&', message));
	}

	public ItemStack createIS(Material type, String DisplayName) {
		ItemStack item = new ItemStack(type, 1);
		ItemMeta meta = item.getItemMeta();

		if (DisplayName != null) meta.setDisplayName(plugin.ColorTranslate(DisplayName));

		item.setItemMeta(meta);

		return item;
	}

	public String transColor(String text) {
		return ChatColor.translateAlternateColorCodes('&', text);
	}
}
