package br.damous.dictionaryapp.feature_dictionary.presentation.util

sealed class UiEvent {
    data class ShowSnackBar(val message: String) : UiEvent()
}
