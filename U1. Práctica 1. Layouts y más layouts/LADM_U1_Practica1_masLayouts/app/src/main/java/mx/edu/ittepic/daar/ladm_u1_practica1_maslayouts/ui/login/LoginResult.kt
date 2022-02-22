package mx.edu.ittepic.daar.ladm_u1_practica1_maslayouts.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)