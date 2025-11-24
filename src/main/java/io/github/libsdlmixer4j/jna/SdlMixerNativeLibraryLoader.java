package io.github.libsdlmixer4j.jna;

import java.util.HashMap;
import java.util.Map;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;

import static com.sun.jna.Library.OPTION_CLASSLOADER;
import static com.sun.jna.Library.OPTION_STRING_ENCODING;

public class SdlMixerNativeLibraryLoader {

    public static final String SDL_MIXER_LIBRARY_NAME = "SDL2_mixer";

    // This field keeps the reference to the loaded JNA library object to prevent it from being garbage collected.
    private static NativeLibrary libSDL2Mixer;

    private SdlMixerNativeLibraryLoader() {
    }

    public static synchronized void registerNativeMethods(Class<?> nativeClass) {
        if (libSDL2Mixer == null) {
        	libSDL2Mixer = loadLibSDL2Mixer();
        }
        Native.register(nativeClass, libSDL2Mixer);
    }

    private static NativeLibrary loadLibSDL2Mixer() {
        Map<String, Object> options = new HashMap<>();
        options.put(OPTION_STRING_ENCODING, "UTF-8");
        options.put(OPTION_CLASSLOADER, SdlMixerNativeLibraryLoader.class.getClassLoader());
        return NativeLibrary.getInstance(SDL_MIXER_LIBRARY_NAME, options);
    }

    public static <T extends Library> T loadLibSDL2MixerInterfaceInstance(Class<T> libraryInterface) {
        Map<String, Object> options = new HashMap<>();
        options.put(OPTION_STRING_ENCODING, "UTF-8");
        options.put(OPTION_CLASSLOADER, SdlMixerNativeLibraryLoader.class.getClassLoader());
        return Native.load(SDL_MIXER_LIBRARY_NAME, libraryInterface, options);
    }

}
