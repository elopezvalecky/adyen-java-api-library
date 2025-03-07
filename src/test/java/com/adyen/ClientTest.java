package com.adyen;

import com.adyen.enums.Environment;
import com.adyen.enums.Region;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import javax.net.ssl.SSLContext;

public class ClientTest {

    @Mock
    private SSLContext clientCertificateAuthSSLContext;

    @Mock
    private String apiKey;

    @Test
    public void testConfigTestClient() {
        Config config = new Config();
        config.setEnvironment(Environment.TEST);
        config.setApiKey(apiKey);
        Client client = new Client(config);

        Assert.assertEquals(Environment.TEST, client.getConfig().getEnvironment());
    }

    @Test
    public void testConfigLiveClient() {
        Config config = new Config();
        config.setEnvironment(Environment.LIVE);
        config.setLiveEndpointUrlPrefix("prefix");
        config.setApiKey(apiKey);
        Client client = new Client(config);
        Assert.assertEquals(Environment.LIVE, client.getConfig().getEnvironment());
    }

    @Test
    public void testClientCertificateAuth() {
        Client client = new Client(clientCertificateAuthSSLContext, apiKey);
        Assert.assertEquals(Environment.LIVE, client.getConfig().getEnvironment());
    }

    private void assertCommonEndpoints(Config config) {
        Assert.assertEquals(Client.TERMINAL_API_ENDPOINT_LIVE, config.getTerminalApiCloudEndpoint());
    }
}