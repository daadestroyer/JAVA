package prog4;

import org.eclipse.californium.core.CoapClient;

public class Client {
	public static void main(String[] args) {
		CoapClient client = new CoapClient("coap://localhost/getRequest");

		try {
			for (int i = 0; i < 10; i++) {
				String s = client.get().getResponseText();
				System.out.println(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
