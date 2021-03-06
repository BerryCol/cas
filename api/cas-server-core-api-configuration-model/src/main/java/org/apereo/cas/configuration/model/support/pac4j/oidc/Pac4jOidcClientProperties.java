package org.apereo.cas.configuration.model.support.pac4j.oidc;

import lombok.Getter;
import lombok.Setter;
import org.apereo.cas.configuration.support.RequiresModule;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

/**
 * This is {@link Pac4jOidcClientProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.2.0
 */
@RequiresModule(name = "cas-server-support-pac4j-webflow")
@Getter
@Setter
public class Pac4jOidcClientProperties implements Serializable {

    private static final long serialVersionUID = 3359382317533639638L;

    /**
     * Settings specific to delegating authentication to azure.
     */
    @NestedConfigurationProperty
    private Pac4jAzureOidcClientProperties azure = new Pac4jAzureOidcClientProperties();

    /**
     * Settings specific to delegating authentication to google.
     */
    @NestedConfigurationProperty
    private Pac4jGoogleOidcClientProperties google = new Pac4jGoogleOidcClientProperties();

    /**
     * Settings specific to delegating authentication to keycloak.
     */
    @NestedConfigurationProperty
    private Pac4jKeyCloakOidcClientProperties keycloak = new Pac4jKeyCloakOidcClientProperties();

    /**
     * Settings specific to delegating authentication to keycloak.
     */
    @NestedConfigurationProperty
    private Pac4jKeyCloakOidcClientProperties generic = new Pac4jKeyCloakOidcClientProperties();

}
