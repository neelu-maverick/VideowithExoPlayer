package com.example.videowithexoplayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.StyledPlayerView

class MainActivity : AppCompatActivity() {

    val url1: String =
        "https://s3.ca-central-1.amazonaws.com/codingwithmitch/media/VideoPlayerRecyclerView/SwipingViewPager+Tutorial.mp4"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exoplayer: ExoPlayer = ExoPlayer.Builder(this).build()
        val playerview: StyledPlayerView = findViewById(R.id.exoplayerView)
        playerview.player = exoplayer

        val mediaItem: MediaItem =
            MediaItem.fromUri(url1)
        exoplayer.addMediaItem(mediaItem)

        exoplayer.prepare()
        exoplayer.play()

        //AIU,DEB,WES recognitions
    }
}