//This Is Meant To Be A Shortner So You Dont Have Long Code For Each String

public String ColorTranslate(String text) {
	text = ChatColor.translateAlternateColorCodes('&', text);
	return text;
}
