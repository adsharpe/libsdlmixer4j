package io.github.libsdlmixer4j.api;

import java.nio.ByteOrder;

public final class SdlMixerConst {
	public static final int MIX_CHANELS = 8; 
	public static final int MIX_DEFAULT_FREQUENCY = 44100;
	public static final int MIX_DEFAULT_FORMAT = (ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN))
													? 0x9010 : 0x8010; // AUDIO_S16SYS is either AUDIO_S16MSB(0x9010) for big endian
																	   // or AUDIO_S16LSB (0x8010) for little endian
	public static final int MIX_DEFAULT_CHANNELS = 2;
	public static final int MIX_MAX_VOLUME = 128; // SDL_MIX_MAXVOLUME
}
