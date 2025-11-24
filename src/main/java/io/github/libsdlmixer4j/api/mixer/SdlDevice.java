package io.github.libsdlmixer4j.api.mixer;

import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.ShortByReference;
import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlDevice {
	
	static {
		SdlMixerNativeLibraryLoader.registerNativeMethods(SdlDevice.class);
	}
	
	public static native int Mix_OpenAudio(int frequency, short format, int channels, int chunksize);
	public static native int Mix_OpenAudioDevice(int frequency, short format, int channels, int chunksize, String device, int allowed_changes);
	public static native void Mix_PauseAudio(int pause_on);
	public static native int Mix_QuerySpec(IntByReference frequency, ShortByReference format, IntByReference channels);
	public static native int Mix_AllocateChannels(int numchans);
	
	private SdlDevice() {}

}
