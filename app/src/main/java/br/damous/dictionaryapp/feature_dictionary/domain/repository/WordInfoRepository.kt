package br.damous.dictionaryapp.feature_dictionary.domain.repository

import br.damous.dictionaryapp.core.util.Resource
import br.damous.dictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}