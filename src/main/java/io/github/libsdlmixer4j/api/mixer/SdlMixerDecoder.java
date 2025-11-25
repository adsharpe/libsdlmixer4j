package io.github.libsdlmixer4j.api.mixer;

import com.sun.jna.Pointer;

import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlMixerDecoder {
	
	static {
		SdlMixerNativeLibraryLoader.registerNativeMethods(SdlMixerDecoder.class);
	}

	public static native Mix_Chunk Mix_LoadWAV_RW(Pointer rwops, int freesrc);
	public static native Mix_Chunk Mix_LoadWAV(String file);
	public static native Mix_Music Mix_LoadMUS(String file);
	public static native Mix_Music Mix_LoadMUS_RW(Pointer rwops, int freesrc);
	public static native Mix_Music Mix_LoadMUSType_RW(Pointer rwops, int type, int freesrc);
	public static native Mix_Chunk Mix_QuickLoad_WAV(Pointer mem);
	public static native Mix_Chunk Mix_QuickLoad_RAW(Pointer mem, int len);
	public static native void Mix_FreeChunk(Mix_Chunk chunk);
	public static native int Mix_GetNumChunkDecoders();
	public static native String Mix_GetChunkDecoder(int index);
	public static native boolean Mix_HasChunkDecoder(String name);
	public static native int Mix_GetNumMusicDecoders();
	public static native String Mix_GetMusicDecoder(int index);
	public static native boolean Mix_HasMusicDecoder(String name);
	
	private SdlMixerDecoder() {}
}
