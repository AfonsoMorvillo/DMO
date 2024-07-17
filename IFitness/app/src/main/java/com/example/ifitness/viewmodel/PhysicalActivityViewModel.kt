package com.example.ifitness.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.ifitness.model.PhysicalActivity
import com.example.ifitness.repository.ActivitiesRepository


class PhysicalActivityViewModel (application: Application) : AndroidViewModel(application) {

    private val activitiesRepository = ActivitiesRepository(getApplication())

    fun createActivity(activity: PhysicalActivity) = activitiesRepository.insert(activity)

    fun updateActivity(activity: PhysicalActivity) = activitiesRepository.update(activity)

    fun allActivities(userId: String?): LiveData<List<PhysicalActivity>> {
        return activitiesRepository.getAllActivities(userId)
    }

    fun deleteActivity(activity: PhysicalActivity) {
        activitiesRepository.delete(activity)
    }

}