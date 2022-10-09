package AbstractusAPI.exception.client_error;

import AbstractusAPI.exception.AbstractusException;

/**
 * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Status/426>The server refuses to perform the request using the current
 * protocol but might be willing to do so after the client upgrades to a different protocol. The server sends an Upgrade
 * header in a 426 response to indicate the required protocol(s).</a>"
 */
public class UpgradeRequiredException extends AbstractusException {
    public UpgradeRequiredException(String message) {
        super(message, 426);
    }
}
