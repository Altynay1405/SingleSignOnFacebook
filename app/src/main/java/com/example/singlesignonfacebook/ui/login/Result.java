package com.example.singlesignonfacebook.ui.login;

import androidx.annotation.Nullable;

/**
 * Authentication result : success (user details) or error message.
 */
class Result {
    @Nullable
    private LoggedInUserView success;
    @Nullable
    private Integer error;

    Result(@Nullable Integer error) {
        this.error = error;
    }

    Result(@Nullable LoggedInUserView success) {
        this.success = success;
    }

    @Nullable
    LoggedInUserView getSuccess() {
        return success;
    }

    @Nullable
    Integer getError() {
        return error;
    }
}
