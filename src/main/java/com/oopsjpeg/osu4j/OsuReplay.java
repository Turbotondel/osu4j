package com.oopsjpeg.osu4j;

import com.google.gson.JsonObject;
import com.oopsjpeg.osu4j.backend.Osu;

public class OsuReplay extends OsuElement {
	private String content;
	private String encoding;

	public OsuReplay(Osu api, JsonObject obj) {
		super(api);
		if (obj.has("content")) content = obj.get("content").getAsString();
		if (obj.has("encoding")) encoding = obj.get("encoding").getAsString();
	}

	public OsuReplay(OsuReplay other) {
		super(other);
		this.content = other.content;
		this.encoding = other.encoding;
	}

	public String getContent() {
		return content;
	}

	public String getEncoding() {
		return encoding;
	}
}
