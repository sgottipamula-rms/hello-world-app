import com.sun.jersey.api.client.Client;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

import static com.sun.tools.corba.se.idl.toJavaPortable.Arguments.Client;

/**
 * Created by sgottipamula on 3/14/17.
 */
public class RestClient {

    @Test
    public void foo() {

        System.out.println(computeNonce("7E20205E67999EDD8A63C511E569BC95E1A04AC85EE95CE2E5FCA9BF543C84F190F6C8F7DF58E90EE51AE47C1DD58DBCE068A3C9320AED9627255872388595BF"));

    }

    public static String computeNonce(final String authToken) {
        String authTokenSha = DigestUtils.shaHex(authToken);
        // just grab the second half of the sha for the nonce
        return authTokenSha.substring(authTokenSha.length()/2);
    }
}
