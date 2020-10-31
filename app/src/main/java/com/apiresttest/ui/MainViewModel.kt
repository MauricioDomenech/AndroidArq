package com.apiresttest.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.apiresttest.data.repository.CharacterRepository

class MainViewModel @ViewModelInject constructor(repository: CharacterRepository) : ViewModel() {

    val characters = repository.getCharacters()

}