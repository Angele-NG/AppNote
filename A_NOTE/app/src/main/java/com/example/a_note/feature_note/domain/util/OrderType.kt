package com.example.a_note.feature_note.domain.util

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()

}
