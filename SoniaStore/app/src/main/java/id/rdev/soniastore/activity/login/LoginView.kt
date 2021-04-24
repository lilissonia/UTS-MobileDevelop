package id.rdev.soniastore.activity.login

import id.rdev.soniastore.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}