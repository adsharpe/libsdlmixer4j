package io.github.libsdlmixer4j.api.version;

public final class SdlMixerVersionConst {
	public static final int SDL_MIXER_MAJOR_VERSION = 2;
	public static final int SDL_MIXER_MINOR_VERSION = 8;
	public static final int SDL_MIXER_PATCHLEVEL = 0;

	/* Backwards compatibility */
	public static final int MIX_MAJOR_VERSION = SDL_MIXER_MAJOR_VERSION;
	public static final int MIX_MINOR_VERSION = SDL_MIXER_MINOR_VERSION;
	public static final int MIX_PATCHLEVEL = SDL_MIXER_PATCHLEVEL;
	
	private SdlMixerVersionConst() {}

}
