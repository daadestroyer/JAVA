package prog4;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class Server extends CoapResource {

	public Server(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleGET(CoapExchange exchange) {
		// TODO Auto-generated method stub
		String s1 = "temprature";
		exchange.respond(s1);
		System.out.println(s1);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		CoapServer coapServer = new CoapServer();
		coapServer.add(new Server("getRequest"));
		coapServer.start();
	}

}
