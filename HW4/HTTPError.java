package HW4.task1;
//3*
//Oleksandr Bezborodov
public enum HTTPError {
    BadRequest(400),
    Unauthorized(401),
    PaymentRequired(402),
    Forbidden(403),
    NotFound(404),
    MEGASUPERBUG(13);

    HTTPError(int i) {

    }
}
