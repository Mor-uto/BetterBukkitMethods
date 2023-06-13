public void sendMessage(Player player, String message) {
	player.SendMessage(ChatColor.translateAlternativeColorCodes('&', message));
}

public ItemStack createItemStackGUI(Material type, String DisplayName) {
	ItemStack item = new ItemStack(type, 1);
	ItemMeta meta = item.getItemMeta();
  
	if (DisplayName != null) meta.setDisplayName(plugin.ColorTranslate(DisplayName));
  
	item.setItemMeta(meta);
  
	return item;
}
