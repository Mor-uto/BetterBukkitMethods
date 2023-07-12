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
lib.SendMessage(player, "&6hi");
```

`createIS`

its a way to make an itemStack without having to make meta for it so to use it

```java
ItemStack simpleSword = lib.createIS(Material.DIAMOND_SWORD, "DisplayName");
```

`transColor`

its like ChatColor.translateAlternativeColorCodes but much shorter to use it, its like sendMessage but its for translating only the color codes and not send anything

```java
lib.transColor(YourTestHere);
```
}
