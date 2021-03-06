package com.jkbff.ao.tyrlib.packets.server;

import java.io.DataInputStream;
import java.io.IOException;

import sk.sigp.aobot.client.types.AbstractType;
import sk.sigp.aobot.client.types.Text;

public class LoginSeed extends BaseServerPacket {
	
	public static final int TYPE = 0;

	protected final Text seed;

	public LoginSeed(DataInputStream input) {
		this.seed = new Text(input);
	}
	
	public LoginSeed(String seed) {
		this.seed = new Text(seed);
	}
	
	public String getSeed() {
		return this.seed.getData();
	}

	public int getPacketType() {
		return LoginSeed.TYPE;
	}

	@Override
	public AbstractType[] getParameters() {
		return new AbstractType[]{seed};
	}
}
