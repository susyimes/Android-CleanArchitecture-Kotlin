package com.fernandocejas.sample.features.login

import com.fernandocejas.sample.framework.UnitTest
import org.amshove.kluent.shouldBe
import org.junit.Test

class AuthenticatorTest : UnitTest() {
    val authenticator = Authenticator()

    @Test
    fun returnsDefaultValue() {
        authenticator.userLoggedIn() shouldBe true
    }
}
