package ouestfrance.julien.summarize.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {

    public String getJson(String url) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        ClientResponse response = webResource.get(ClientResponse.class);
        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus() + " for url : " + url);
        }
        return response.getEntity(String.class);
    }

}
