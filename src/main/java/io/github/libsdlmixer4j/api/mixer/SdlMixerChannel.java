package io.github.libsdlmixer4j.api.mixer;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;

import io.github.libsdlmixer4j.jna.SdlMixerNativeLibraryLoader;

public class SdlMixerChannel {
	
	static {
		SdlMixerNativeLibraryLoader.registerNativeMethods(SdlMixerChannel.class);
	}
	
	// Channel reservation and grouping
    public static native int Mix_ReserveChannels(int num);
    public static native int Mix_GroupChannel(int which, int tag);
    public static native int Mix_GroupChannels(int from, int to, int tag);
    public static native int Mix_GroupAvailable(int tag);
    public static native int Mix_GroupCount(int tag);
    public static native int Mix_GroupOldest(int tag);
    public static native int Mix_GroupNewer(int tag);

    // Playing sounds & music
    public static native int Mix_PlayChannel(int channel, Mix_Chunk chunk, int loops);
    public static native int Mix_PlayChannelTimed(int channel, Mix_Chunk chunk, int loops, int ticks);
    public static native int Mix_PlayMusic(Mix_Music music, int loops);
    public static native int Mix_FadeInMusic(Mix_Music music, int loops, int ms);
    public static native int Mix_FadeInMusicPos(Mix_Music music, int loops, int ms, double position);
    public static native int Mix_FadeInChannel(int channel, Mix_Chunk chunk, int loops, int ms);
    public static native int Mix_FadeInChannelTimed(int channel, Mix_Chunk chunk, int loops, int ms, int ticks);

    // Volume control
    public static native int Mix_Volume(int channel, int volume);
    public static native int Mix_VolumeChunk(Mix_Chunk chunk, int volume);
    public static native int Mix_VolumeMusic(int volume);
    public static native int Mix_GetMusicVolume(Mix_Music music);
    public static native int Mix_MasterVolume(int volume);

    // Halting playback
    public static native int Mix_HaltChannel(int channel);
    public static native int Mix_HaltGroup(int tag);
    public static native int Mix_HaltMusic();
    public static native int Mix_ExpireChannel(int channel, int ticks);
    public static native int Mix_FadeOutChannel(int which, int ms);
    public static native int Mix_FadeOutGroup(int tag, int ms);
    public static native int Mix_FadeOutMusic(int ms);

    // Fading state
    public static native int Mix_FadingMusic();    // returns Mix_Fading enum ordinal
    public static native int Mix_FadingChannel(int which); // returns Mix_Fading enum ordinal

    // Pause/Resume
    public static native void Mix_Pause(int channel);
    public static native void Mix_Resume(int channel);
    public static native int Mix_Paused(int channel);
    
    // Music playback control
    public static native void Mix_PauseMusic();
    public static native void Mix_ResumeMusic();
    public static native void Mix_RewindMusic();
    public static native int Mix_PausedMusic();
    public static native int Mix_ModMusicJumpToOrder(int order);
    public static native int Mix_StartTrack(Mix_Music music, int track);
    public static native int Mix_GetNumTracks(Mix_Music music);
    public static native int Mix_SetMusicPosition(double position);
    public static native double Mix_GetMusicPosition(Mix_Music music);
    public static native double Mix_MusicDuration(Mix_Music music);
    public static native double Mix_GetMusicLoopStartTime(Mix_Music music);
    public static native double Mix_GetMusicLoopEndTime(Mix_Music music);
    public static native double Mix_GetMusicLoopLengthTime(Mix_Music music);

    // Music & Channel Playing State
    public static native int Mix_Playing(int channel);
    public static native int Mix_PlayingMusic();

    // External Music Command (for MUS_CMD type)
    public static native int Mix_SetMusicCMD(String command);
    
    // --- SoundFont management ---
    public static native int Mix_SetSoundFonts(String paths);
    public static native String Mix_GetSoundFonts();

    // Callback for each soundfont: int func(const char* path, void* data)
    interface Each_SoundFont_Callback extends Callback {
        int invoke(String path, Pointer data);
    }

    public static native int Mix_EachSoundFont(Each_SoundFont_Callback function, Pointer data);
    public static native int Mix_SetTimidityCfg(String path);
    public static native String Mix_GetTimidityCfg();

    // --- Get channel Mix_Chunk ---
    public static native Mix_Chunk Mix_GetChunk(int channel);
	
	private SdlMixerChannel() {}
}
