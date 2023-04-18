package com.example.a_note.feature_note.domain.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.a_note.ui.theme.*


@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val  id: Int? = null
){
    companion object{
        val noteColors =listOf(Purple700,Purple200,White,Yellow,Orange,Violet,Blue,Pink,Teal200, )
    }

}
class InvalidNoteException(message: String): Exception(message)