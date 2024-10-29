package com.dom.lab07.ui.categories.repository

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import com.dom.lab07.networking.MealsWebService
import com.dom.lab07.networking.responce.categories_D

class MealsCategoriesRepository(private val webService: MealsWebService= MealsWebService()){
    fun getMealCategories(successCallback: (response: categories_D?) -> Unit){
        return webService.getMealCategories().enqueue(object: Callback<categories_D>{
            override fun onResponse(
                call: Call<categories_D>,
                response: Response<categories_D>
            ){
                if (response.isSuccessful)
                    successCallback(response.body())
            }

            override fun onFailure(call: Call<categories_D>, t: Throwable) {
                TODO("Not yet implemented")
            }
        }
        )
    }
}