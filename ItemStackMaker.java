//This is Meant To Make Items Faster For GUIS So U Do
//ItemStack item1 = createItemStackGUI(Material.STONE, "test name");
//instead of making a new itemstack then itemmeta then doing displayname
//then setting the item's meta, this is soo much better and way faster
  
public ItemStack createItemStackGUI(Material type, String DisplayName) {
	ItemStack item = new ItemStack(type, 1);
	ItemMeta meta = item.getItemMeta();
  
	if (DisplayName != null) meta.setDisplayName(plugin.ColorTranslate(DisplayName));
  
	item.setItemMeta(meta);
  
	return item;
}
