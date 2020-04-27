package cx.wasabi.gcatan;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.block.Biome;

public class Main extends JavaPlugin implements Listener {
	
	@Override
    public void onEnable() {
		System.out.println("[GCatan] Blip Bloop Bleep, I am ON!");
		getServer().getPluginManager().registerEvents(this, this);
		System.out.println("[GCatan] Events registered.");
	}
	
	@Override
    public void onDisable() {
		System.out.println("[GCatan] Bye Bye");
	}
	
	@SuppressWarnings("serial")
	Hashtable<Material, List<Biome>> matLookup = new Hashtable<Material, List<Biome>>(){{
		put(Material.OAK_LOG, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.PLAINS);
		}});
		put(Material.OAK_SAPLING, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.PLAINS);
		}});
		put(Material.ICE, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.ICE_SPIKES);
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.FROZEN_RIVER);
		}});
		put(Material.SPRUCE_LOG, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.GIANT_SPRUCE_TAIGA);
		}});
		put(Material.SPRUCE_SAPLING, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.GIANT_SPRUCE_TAIGA);
		}});
		put(Material.RABBIT, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.ICE_SPIKES);
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.SNOWY_BEACH);
		}});
		put(Material.RABBIT_FOOT, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TUNDRA);
			add(Biome.ICE_SPIKES);
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.SNOWY_BEACH);
		}});
		put(Material.SWEET_BERRIES, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
		}});
		put(Material.SWEET_BERRY_BUSH, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
		}});
		put(Material.BEETROOT, new ArrayList<Biome>() {{
			add(Biome.SNOWY_TAIGA);
			add(Biome.SNOWY_TAIGA_HILLS);
			add(Biome.SNOWY_TAIGA_MOUNTAINS);
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
			add(Biome.TAIGA);
			add(Biome.TAIGA_MOUNTAINS);
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.GIANT_SPRUCE_TAIGA);
		}});
		put(Material.BEETROOT_SEEDS, get(Material.BEETROOT));
		put(Material.CLAY, new ArrayList<Biome>() {{
			add(Biome.FROZEN_RIVER);
		}});
		put(Material.BRICKS, new ArrayList<Biome>() {{
			add(Biome.FROZEN_RIVER);
		}});
		put(Material.SEAGRASS, new ArrayList<Biome>() {{
			add(Biome.FROZEN_RIVER);
			add(Biome.STONE_SHORE);
		}});
		put(Material.SALMON, new ArrayList<Biome>() {{
			add(Biome.FROZEN_RIVER);
		}});
		put(Material.SAND, new ArrayList<Biome>() {{
			add(Biome.FROZEN_RIVER);
			add(Biome.SNOWY_BEACH);
			add(Biome.STONE_SHORE);
		}});
		put(Material.EMERALD, new ArrayList<Biome>() {{
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
		}});
		put(Material.POTATO, new ArrayList<Biome>() {{
			add(Biome.MODIFIED_GRAVELLY_MOUNTAINS);
			add(Biome.MOUNTAINS);
			add(Biome.WOODED_MOUNTAINS);
			add(Biome.GRAVELLY_MOUNTAINS);
			
		}});
		put(Material.POTATOES, get(Material.POTATO));
		put(Material.POISONOUS_POTATO, get(Material.POTATO));
		put(Material.PODZOL, new ArrayList<Biome>() {{
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.GIANT_SPRUCE_TAIGA);
			
		}});
		put(Material.MOSSY_COBBLESTONE, new ArrayList<Biome>() {{
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.GIANT_SPRUCE_TAIGA);
		}});
		put(Material.BROWN_MUSHROOM, new ArrayList<Biome>() {{
			add(Biome.GIANT_TREE_TAIGA);
			add(Biome.GIANT_SPRUCE_TAIGA);
			add(Biome.DARK_OAK_FOREST);
		}});
		put(Material.RED_MUSHROOM, get(Material.BROWN_MUSHROOM));
		put(Material.TURTLE_EGG, new ArrayList<Biome>() {{
			add(Biome.STONE_SHORE);
		}});
		put(Material.HONEY_BOTTLE, new ArrayList<Biome>() {{
			add(Biome.PLAINS);
		}});
		put(Material.HONEYCOMB, get(Material.HONEY_BOTTLE));
		put(Material.HONEYCOMB_BLOCK, get(Material.HONEY_BOTTLE));
		put(Material.BEEHIVE, get(Material.HONEY_BOTTLE));
		put(Material.WHEAT, new ArrayList<Biome>() {{
			add(Biome.PLAINS);
		}});
		put(Material.WHEAT_SEEDS, get(Material.WHEAT));
		put(Material.PUMPKIN, new ArrayList<Biome>() {{
			add(Biome.PLAINS);
			add(Biome.FOREST);
			add(Biome.BIRCH_FOREST);
			
		}});
		put(Material.CARROT, new ArrayList<Biome>(){{
      add(Biome.FOREST);
      add(Biome.BIRCH_FOREST);
    }});

	}};
	
	Hashtable<Integer, Boolean> itemOwnerAssoc = new Hashtable<Integer, Boolean>();
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onEntityPickupItemEvent(EntityPickupItemEvent e) {
		LivingEntity ent = e.getEntity();
		if (ent instanceof Player) {
			Player ply = (Player) ent;
			if (ply.getLocation().getWorld().getName().contains("world") == false) return;
			Item evtItem = e.getItem();
			Material toCheck = evtItem.getItemStack().getType();
			System.out.println("[GCatan] Item (" + toCheck + ") picked up by " + ply.getName());
			Biome plBiome = ply.getLocation().getBlock().getBiome();
			boolean canProceed = true;
			if (matLookup.containsKey(toCheck)) {
				canProceed = (canProceed && matLookup.get(toCheck).contains(plBiome));
			}
			if (canProceed == false) {
				int itemID = evtItem.getEntityId();
				if (itemOwnerAssoc.containsKey(itemID)) {
					if (itemOwnerAssoc.get(itemID)) {
						itemOwnerAssoc.remove(itemID);
						System.out.println("[GCatan] Item belongs to Player");
						return;
					}
				}
				System.out.println("[GCatan] Pickup (" + toCheck + ") blocked!");
				ply.sendMessage(ChatColor.DARK_RED + "You can't harvest this resource (" + toCheck.toString().replaceAll("_"," ") + ") in the current biome!");
				evtItem.remove();
				e.setCancelled(true);
			}
		}
	}
	
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerDropItemEvent(PlayerDropItemEvent e) {
		if (e.isCancelled()) return;
		itemOwnerAssoc.put(e.getItemDrop().getEntityId(), true);
		System.out.println("[GCatan] Item (" + e.getItemDrop().getItemStack().getType() + ") assigned to " + e.getPlayer().getName());
	}
	
}
