package io.github.libsdlmixer4j.api;

import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlMixer {
	
	public static int Mix_Init(int flags) {
		return InternalNativeFunctions.Mix_Init(flags);
	}
    public static void Mix_Quit() {
		InternalNativeFunctions.Mix_Quit();
    }
    
    private SdlMixer() {}
	
	private static final class InternalNativeFunctions {

        static {
        	SdlMixerNativeLibraryLoader.registerNativeMethods(InternalNativeFunctions.class);
        }

        private InternalNativeFunctions() {}
        
        public static native int Mix_Init(int flags);
        public static native void Mix_Quit();
    }
}
