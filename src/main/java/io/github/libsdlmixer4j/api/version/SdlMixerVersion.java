package io.github.libsdlmixer4j.api.version;

import io.github.libsdl4j.api.version.SDL_version;
import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlMixerVersion {
	
	static {
		SdlMixerNativeLibraryLoader.registerNativeMethods(SdlMixerVersion.class);
	}
	
	public static native SDL_version Mix_Linked_Version();
	
	private SdlMixerVersion() {}

}
