package com.elevenzon.mediaplayer;

import android.net.Uri;

public class ModelAudio {

    String audioTitle;
    String audioDuration;
    String audioArtist;
    Uri audioUri;
    Uri audioArtUri;

    public String getAudioTitle() {
        return audioTitle;
    }

    public void setAudioTitle(String audioTitle) {
        this.audioTitle = audioTitle;
    }

    public void setAudioDuration(String audioDuration) {
        this.audioDuration = audioDuration;
    }

    public String getAudioArtist() {
        return audioArtist;
    }

    public void setAudioArtist(String audioArtist) {
        this.audioArtist = audioArtist;
    }

    public Uri getAudioUri() {
        return audioUri;
    }

    public void setAudioUri(Uri audioUri) {
        this.audioUri = audioUri;
    }

    public void setAudioArtUri(Uri audioArtUri) { this.audioArtUri = audioArtUri; }

}