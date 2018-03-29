/*
 * Copyright (c) 2018. RedEye Corp.
 * Class created by Ckpe4
 */

package lesson4.homework;

public enum HttpError {
    BadRequest("Bad Request"), Unauthorized("Unauthorized"), PaymentRequired("Payment Required"), Forbidden("Forbidden"),
    NotFound("Not Found"), MethodNotAllowed("Method Not Allowed"), NotAcceptable("Not Acceptable"),
    RequestTimeout("Request Timeout"), ProxyAuthenticationRequired("Proxy Authentication Required");

    String error;

    HttpError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
