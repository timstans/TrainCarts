package com.bergerkiller.bukkit.tc.actions;

import com.bergerkiller.bukkit.tc.controller.MinecartGroup;

public class GroupActionWaitTicks extends GroupActionWaitForever {
	private int ticks;

	public GroupActionWaitTicks(MinecartGroup group, int ticks) {
		super(group);
		this.ticks = ticks;
	}

	@Override
	public boolean update() {
		if (this.ticks <= 0) {
			return true;
		} else {
			this.ticks--;
			return super.update();
		}
	}
}
