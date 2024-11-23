package jlin2.examples.localtesting

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun validEmail_correctFormat() {
        // Test for correct email format
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }

    @Test
    fun validEmail_correctSubdomainFormat() {
        // Test for email with subdomain
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun invalidEmail_incorrectDomain() {
        // Test for missing domain
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun invalidEmail_doubleDots() {
        // Test for email with double dots
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun invalidEmail_missingUsername() {
        // Test for email without username
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun invalidEmail_missingDomain() {
        // Test for email without domain
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun invalidEmail_emptyString() {
        // Test for empty string
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun invalidEmail_null() {
        // Test for null input
        assertFalse(EmailValidator.isValidEmail(null))
    }
}