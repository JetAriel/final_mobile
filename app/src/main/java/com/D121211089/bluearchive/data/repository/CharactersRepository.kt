package com.D121211089.bluearchive.data.repository

import com.D121211089.bluearchive.data.response.GetCharactersResponse
import com.D121211089.bluearchive.data.source.remote.ApiService

class CharactersRepository(private val apiService: ApiService) {

    suspend fun getCharacters(): GetCharactersResponse {
        return apiService.getCharacters()
    }
}