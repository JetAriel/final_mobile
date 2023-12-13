package com.D121211089.bluearchive.data.source.remote

import com.D121211089.bluearchive.data.response.GetCharactersResponse
import retrofit2.http.GET

interface ApiService {

    @GET("api/characters/students")
    suspend fun getCharacters(): GetCharactersResponse
}