package colo.sample.tyrus.endpoint;

import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import colo.sample.tyrus.util.PalindromeChecker;

@ServerEndpoint(value = "/echo")
public class EchoEndpoint {

	/**
	 * @param message
	 * @param session
	 * @return el resultado de chequear si el mensaje de entrada es palíndrome
  	 */
	@OnMessage
	public String onMessage(String message, Session session) {
	
		String result = "";
		if (PalindromeChecker.check(message)) {
			result = " is palindrom";
		}
		else {
			result = " is NOT palindrom";
		}
		
		return message + result;
	}
}
