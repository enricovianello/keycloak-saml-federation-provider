package it.redhat.saml.provider;

import javax.ws.rs.core.Response;

import org.keycloak.broker.provider.AbstractIdentityProvider;
import org.keycloak.models.FederatedIdentityModel;
import org.keycloak.models.KeycloakSession;

public class SamlFederationIdentityProvider
    extends AbstractIdentityProvider<SamlFederationIdentityProviderConfig> {

  public SamlFederationIdentityProvider(KeycloakSession session,
      SamlFederationIdentityProviderConfig config) {
    super(session, config);
    // TODO Auto-generated constructor stub
  }

  @Override
  public Response retrieveToken(KeycloakSession session, FederatedIdentityModel identity) {
    // TODO Auto-generated method stub
    return null;
  }

}
