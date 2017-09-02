package ag2.test.echoServer;

import java.io.IOException;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import ag2.test.palindrome.PalindromeChecker;

@ServerEndpoint(value = "/echo")
public class EchoServer {

	@OnOpen
	public void onOpen(Session session) {
		System.out.printf("Session opened, id: %s%n", session.getId());
		try {
			session.getBasicRemote().sendText("Hi there, we are successfully connected.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@OnMessage
	public void onMessage(String message, Session session) {
		System.out.printf("Message received. Session id: %s Message: %s%n", session.getId(), message);
		try {
			
			boolean isP = PalindromeChecker.isPalindrom(message);
			String msg =  message + " is ";
			if (isP) {
				msg = msg+ " palindrome";
			}
			else {
				msg = msg+ " NOT palindrome";
				
			}
			
			session.getBasicRemote().sendText(String.format("We received your message: %s%n", message));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	@OnError
	public void onError(Throwable e) {
		e.printStackTrace();
	}

	@OnClose
	public void onClose(Session session) {
		System.out.printf("Session closed with id: %s%n", session.getId());
	}
}
