package io.github.libsdlmixer4j.api.mixer;

import io.github.libsdl4j.api.error.SdlError;

public final class SdlMixerError {
	
	// Set last error message
    public static int Mix_SetError(String fmt, Object... args) {
    	return SdlError.SDL_SetError(fmt, args);
    }

	// Get last error message
    public static String Mix_GetError() {
		return SdlError.SDL_GetError();
	}

	// Clear last error message
    public static void Mix_ClearError() {
		SdlError.SDL_ClearError();
	}

	// Set "out of memory" error
    public static void Mix_OutOfMemory() {
		SdlError.SDL_SetError("Out of memory");
	}
	
	private SdlMixerError() {}
}
