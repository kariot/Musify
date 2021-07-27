package me.kariot.musify.utills.extensions

import android.widget.ImageView
import coil.load
import coil.transform.RoundedCornersTransformation

fun ImageView.loadImage(url: String) {
    this.load(url) {
        crossfade(true)
        transformations(RoundedCornersTransformation(12.0F))
    }
}