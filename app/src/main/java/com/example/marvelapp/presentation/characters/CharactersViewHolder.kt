package com.example.marvelapp.presentation.characters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.marvelapp.databinding.ItemCharacterBinding
import com.example.core.domain.model.Character
import com.example.marvelapp.R

class CharactersViewHolder(
    itemCharcterBinding:ItemCharacterBinding
): RecyclerView.ViewHolder(itemCharcterBinding.root) {
    private val textName = itemCharcterBinding.textName
    private val imageCharacter = itemCharcterBinding.imageCharacter

    fun bind(character: Character){
        textName.text = character.name
        Glide.with(itemView)
            .load(character.imageUrl)
            .fallback(R.drawable.ic_img_loading_error)
            .into(imageCharacter)
    }

    companion object{
        fun create(parent: ViewGroup) : CharactersViewHolder{
            val inflater = LayoutInflater.from(parent.context)
            val itemBinding = ItemCharacterBinding.inflate(inflater,parent,false)
            return CharactersViewHolder(itemBinding)
        }
    }

}