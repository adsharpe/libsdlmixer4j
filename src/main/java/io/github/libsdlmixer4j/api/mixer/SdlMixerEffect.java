package io.github.libsdlmixer4j.api.mixer;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlMixerEffect {
	
	static {
		SdlMixerNativeLibraryLoader.registerNativeMethods(SdlMixerEffect.class);
	}
	
	public interface Mix_Func_Callback extends Callback {
	    void invoke(Pointer udata, Pointer stream, int len);
	}
	
	public interface Music_Finished_Callback extends Callback {
	    void invoke();
	}
	
	public interface Channel_Finished_Callback extends Callback {
	    void invoke(int channel);
	}
	
	public interface Mix_Effect_Func extends Callback {
	    void invoke(int channel, Pointer stream, int len, Pointer udata);
	}

	public interface Mix_Effect_Done extends Callback {
	    void invoke(int channel, Pointer udata);
	}
	
	public static native void Mix_SetPostMix(Mix_Func_Callback mix_func, Pointer arg);
	public static native void Mix_HookMusic(Mix_Func_Callback mix_func, Pointer arg);
	public static native void Mix_HookMusicFinished(Music_Finished_Callback cb);
	public static native Pointer Mix_GetMusicHookData();
	public static native void Mix_ChannelFinished(Channel_Finished_Callback cb);
	public static native int Mix_RegisterEffect(int channel, Mix_Effect_Func func, Mix_Effect_Done done, Pointer arg);
	public static native int Mix_UnregisterEffect(int channel, Mix_Effect_Func func);
	public static native int Mix_UnregisterAllEffects(int channel);
	public static native int Mix_SetPanning(int channel, byte left, byte right);
	public static native int Mix_SetPosition(int channel, short angle, byte distance);
	public static native int Mix_SetDistance(int channel, byte distance);
	public static native int Mix_SetReverseStereo(int channel, int flip);
	
	private SdlMixerEffect() {}
}
