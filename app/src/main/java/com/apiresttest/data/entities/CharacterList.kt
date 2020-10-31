package com.apiresttest.data.entities

import com.apiresttest.data.entities.Character

data class CharacterList(
    val info: Info,
    val results: List<Character>
)