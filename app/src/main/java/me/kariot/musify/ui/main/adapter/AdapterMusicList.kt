package me.kariot.musify.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import me.kariot.musify.data.model.response.Songs
import me.kariot.musify.databinding.RecyclerSongItemBinding
import me.kariot.musify.utills.extensions.loadImage

class AdapterMusicList : ListAdapter<Songs, AdapterMusicList.SongVH>(Companion) {

    inner class SongVH(val bindingView: RecyclerSongItemBinding) :
        RecyclerView.ViewHolder(bindingView.root) {
        fun bind(dataItem: Songs) {
            bindingView.apply {
                txtSong.text = dataItem.name
                txtDesc.text = dataItem.desc
                imgAlbum.loadImage(dataItem.imageUrl)
            }
        }
    }

    companion object : DiffUtil.ItemCallback<Songs>() {
        override fun areItemsTheSame(oldItem: Songs, newItem: Songs) =
            oldItem.songId == newItem.songId

        override fun areContentsTheSame(oldItem: Songs, newItem: Songs) = oldItem == newItem

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SongVH {
        val view =
            RecyclerSongItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SongVH(view)
    }

    override fun onBindViewHolder(holder: SongVH, position: Int) {
        val dataItem = currentList[position]
        holder.bind(dataItem)
    }
}