package io.github.libsdlmixer4j.api;

public class MIXInitFlags {
	public static final int MIX_INIT_FLAC     = 0x00000001;
	public static final int MIX_INIT_MOD      = 0x00000002;
	public static final int MIX_INIT_MP3      = 0x00000008;
	public static final int MIX_INIT_OGG      = 0x00000010;
	public static final int MIX_INIT_MID      = 0x00000020;
	public static final int MIX_INIT_OPUS     = 0x00000040;
	public static final int MIX_INIT_WAVPACK  = 0x00000080;
	
	private MIXInitFlags() {}
}
