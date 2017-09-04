### sample-websocket-tyrus

A simple Web Sockets server build using tyrus. Tyrus is the open source JSR 356 - Java API for WebSocket reference implementation 

In this example we deploy a Websocket endpoint which checks if a given word is Palindrom or not.

Example: Neuquen is Palindrom

How to deploy and test the server:

$ git clone https://github.com/colo76/sample-websocket-tyrus.git
$ cd sample-websocket-tyrus 
$ mvn clean
$ mvn install
$ java -jar target/colo.sample.websockets.tyrus-server.jar 

Now open the file echo.html, in Linux you can type:

$ firefox echo.html 

Click the connect button, if the conexion is opened you can start testing the endpoint.


