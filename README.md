### sample-websocket-tyrus

A simple webSocket server coded using tyrus. [Tyrus is the open source JSR 356 - Java API for WebSocket reference implementation](https://tyrus-project.github.io/)

In this example we deploy a WebSocket endpoint which checks if a given word is Palindrome or not. A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward as forward.

Example: Neuquen is palindrom

How to deploy and test the server:

```{r, engine='bash', code_block_name} ...
$ git clone https://github.com/colo76/sample-websocket-tyrus.git
$ cd sample-websocket-tyrus 
$ mvn clean
$ mvn install
$ java -jar target/colo.sample.websockets.tyrus-server.jar 
```

Now open the file echo.html, in Linux you can type:

```{r, engine='bash', code_block_name} ...
$ firefox echo.html 
```

Click the connect button, if the conexion is successfully opened you can start testing the endpoint. Just enter a word in the edit text and click send button to check it.


