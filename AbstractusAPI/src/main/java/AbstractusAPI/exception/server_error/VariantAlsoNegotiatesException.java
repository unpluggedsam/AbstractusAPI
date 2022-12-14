package AbstractusAPI.exception.server_error;

import AbstractusAPI.exception.AbstractusException;

/**
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/506>The server has an internal configuration error: the chosen variant resource is configured to
 * engage in transparent content negotiation itself, and is therefore not a proper end point in the negotiation process.</a>"
 */
public class VariantAlsoNegotiatesException extends AbstractusException {
    public VariantAlsoNegotiatesException(String message) {
        super(message, 506);
    }
}
