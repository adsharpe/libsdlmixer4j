package io.github.libsdlmixer4j.api.mixer;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

@Structure.FieldOrder({
	"allocated",
	"abuf",
	"alen",
	"volume"
})
public class Mix_Chunk extends Structure {
    public int allocated;
    public Pointer abuf;
    public int alen;
    public byte volume;
}
