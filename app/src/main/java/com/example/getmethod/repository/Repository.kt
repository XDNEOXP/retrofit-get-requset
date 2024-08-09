package com.example.getmethod.repository

import com.example.getmethod.api.RetrofitInstance
import com.example.getmethod.model.Post
import retrofit2.Response

class Repository {
    suspend fun getPost() : Response<Post>{
        return RetrofitInstance.api.getPost()
    }
}