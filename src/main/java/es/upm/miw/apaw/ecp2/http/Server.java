package es.upm.miw.apaw.ecp2.http;

import es.upm.miw.apaw.ecp2.*;

public class Server {
    private Dispatcher dispatcher = new Dispatcher();

    public HttpResponse submit(HttpRequest request) {
        HttpResponse response = new HttpResponse();
        dispatcher.submit(request, response);
        return response;
    }

}
