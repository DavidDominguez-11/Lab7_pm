package com.dom.lab07.ui.categories.viewmodel

import androidx.lifecycle.ViewModel
import com.dom.lab07.networking.responce.categories_D
import com.dom.lab07.ui.categories.repository.MealsCategoriesRepository

class MealCategoriesViewModel(private val repository: MealsCategoriesRepository= MealsCategoriesRepository()): ViewModel(){
    fun getMealCategories(successCallback: (response: categories_D?) -> Unit){
        repository.getMealCategories{response ->
            successCallback(response)
        }
    }
}