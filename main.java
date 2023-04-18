public String ColorTranslate(String text) {
	text = ChatColor.translateAlternateColorCodes('&', text);
	return text;
}
