package colo.sample.tyrus.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.websocket.Endpoint;

import org.glassfish.tyrus.server.Server;

import colo.sample.tyrus.endpoint.EchoEndpoint;;

/**
 * @author colo
 *  Levanta un Servidor incluyendo en {@link Endpoint} {@link EchoEndpoint}
 */
public class EchoServer {

	public static void main(String[] args) {
            new EchoServer().runServer();
		 
	}

	public void runServer() {
		Server server = new Server("localhost", 8025, "/websockets", null, EchoEndpoint.class);

		try {
			server.start();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please press a key to stop the server.");
			reader.readLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			server.stop();
		}
	}

}
