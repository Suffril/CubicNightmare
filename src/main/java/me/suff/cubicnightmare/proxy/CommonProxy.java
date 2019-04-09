package me.suff.cubicnightmare.proxy;

import me.suff.cubicnightmare.common.dimensions.CNDimensions;

public class CommonProxy implements IProxy {
	@Override
	public void pre() {
	
	}
	
	@Override
	public void init() {
	
	}
	
	@Override
	public void post() {
		CNDimensions.register();
	}
}
