package com.example.ifitness.viewmodel

import android.app.Application
import android.preference.PreferenceManager
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.ifitness.model.User
import com.example.ifitness.repository.UsersRepository

class UserViewModel (application: Application) : AndroidViewModel(application) {

    private val usersRepository = UsersRepository(getApplication())

    fun createUser(user: User) = usersRepository.createUser(user)

    fun updateUser(user: User) = usersRepository.update(user)

    fun login(email: String, password: String) : LiveData<User> = usersRepository.login(email, password)

    fun logout() = PreferenceManager.getDefaultSharedPreferences(getApplication()).let {
        it.edit().remove(USER_ID).apply()
    }

    fun resetPassword(email: String) = usersRepository.resetPassword(email)

    fun isLogged(): LiveData<User> = PreferenceManager.getDefaultSharedPreferences(getApplication()).let {
        val id = it.getString(USER_ID, null)

        if(id.isNullOrEmpty())
            return MutableLiveData(null)

        return usersRepository.load(id)
    }

    companion object {
        val USER_ID = "USER_ID"
    }
}
