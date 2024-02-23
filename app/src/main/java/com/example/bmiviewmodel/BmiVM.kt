package com.example.bmiviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiVM: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    val height: Float
        get() = heightInput.toFloatOrNull() ?: 0.0f
    val weight: Int
        get() = weightInput.toIntOrNull() ?: 0
    val bmi: Float
        get() = if (weight > 0 && height > 0) weight / (height * height) else 0.0f
    fun updateHeightInput(newHeight: String) {
            heightInput = newHeight
    }
    fun updateWeightInput(newWeight: String) {
            weightInput = newWeight
    }
}