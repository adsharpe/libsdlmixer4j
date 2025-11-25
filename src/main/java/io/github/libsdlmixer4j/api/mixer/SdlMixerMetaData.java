package io.github.libsdlmixer4j.api.mixer;

import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlMixerMetaData {
	
	static {
		SdlMixerNativeLibraryLoader.registerNativeMethods(SdlMixerMetaData.class);
	}
	
	public static native int Mix_GetMusicType(Mix_Music music);
	public static native String Mix_GetMusicTitle(Mix_Music music);
	public static native String Mix_GetMusicTitleTag(Mix_Music music);
	public static native String Mix_GetMusicArtistTag(Mix_Music music);
	public static native String Mix_GetMusicAlbumTag(Mix_Music music);
	public static native String Mix_GetMusicCopyrightTag(Mix_Music music);
	
	private SdlMixerMetaData() {}
}
