package me.kariot.musify.data.model.response

import me.kariot.musify.utills.Constants

data class Songs(
    var name: String = "Arijith Sing Hits",
    var desc: String = "Top Hindi Hits of Arijith Sing",
    var songId: Int = 0,
    var imageUrl: String = Constants.ALBUM_URL
)
