package com.srp.common.core;

import com.srp.common.lib.LibMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

/**
 * Created by Joseph on 2/16/2018.
 */
public final class SRPCreativeTabs {
	public static final ItemsAndBlocksTab ITEMS_AND_BLOCKS_TAB = new ItemsAndBlocksTab();

	private SRPCreativeTabs() {
	}

	private static class CreativeTab extends CreativeTabs {

		@Nonnull
		NonNullList<ItemStack> list;

		CreativeTab(String name) {
			super(LibMod.MOD_ID + name);
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return getIconItemStack();
		}
	}

	private static class ItemsAndBlocksTab extends CreativeTab {

		ItemsAndBlocksTab() {
			super("_itemsandblocks");
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getIconItemStack() {
			return new ItemStack(Items.CARROT);
		}
	}
}
