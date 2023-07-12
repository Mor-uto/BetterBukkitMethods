# MorutosLib
this is a small java library for bukkit/spigot intended to make it easier to use the API

to use it create a MorutosLibrary variable

```java
public MorutosLibrary lib = new MorutosLibrary();
```

# Contents

`SendMessage`

basically its so you send a message with color codes without needing ChatColor
its typed like this 

```java
lib.SendMessage(player, "&hi");
```

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
