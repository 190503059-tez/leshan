[Build Status](https://hudson.eclipse.org/leshan/)

![Leshan](https://eclipse.org/leshan/img/multicolor-leshan.png)

[Eclipse Leshan™](https://eclipse.org/leshan) is an OMA Lightweight M2M server and client Java implementation.

[What is OMA LWM2M ?](http://www.openmobilealliance.org/wp/overviews/lightweightm2m_overview.html)  
[The specification](http://openmobilealliance.org/release/LightweightM2M/V1_0_1-20170704-A/OMA-TS-LightweightM2M-V1_0_1-20170704-A.pdf).  
[Object and Resource Registry](http://www.openmobilealliance.org/wp/OMNA/LwM2M/LwM2MRegistry.html).  

Leshan provides libraries which help people to develop their own Lightweight M2M server and client.  
The project also provides a client, a server and a bootstrap server demonstration as an example of the Leshan API and for testing purpose.

[Here](https://github.com/eclipse/leshan/wiki/LWM2M-Supported-features) you can see which part of the specification is currently covered by Leshan.

Contact
-------

Join the project mailing list : [subscribe](https://dev.eclipse.org/mailman/listinfo/leshan-dev).  
Mail address: leshan-dev@eclipse.org.  
Access to [leshan-dev archives](https://dev.eclipse.org/mhonarc/lists/leshan-dev/).  

Test Server Sandbox
------------

You can try live our servers demos instances:

* The **lwm2m server** at http://leshan.eclipse.org/  
   _(coap://leshan.eclipse.org:5683  and coaps://leshan.eclipse.org:5684)_  
* The **bootstrap server** at http://leshan.eclipse.org/bs/  
   _(coap://leshan.eclipse.org:5783  and coaps://leshan.eclipse.org:5784)_  

(Automatic deployment of master branch)

Test Leshan Demos locally
-----------------------
Get and run the last binary of our demo **server** :
```
wget https://hudson.eclipse.org/leshan/job/leshan/lastSuccessfulBuild/artifact/leshan-server-demo.jar
java -jar ./leshan-server-demo.jar
```
Get and run the last binary of our demo **client** :
```
wget https://hudson.eclipse.org/leshan/job/leshan/lastSuccessfulBuild/artifact/leshan-client-demo.jar
java -jar ./leshan-client-demo.jar
```
Get and run the last binary of our **bootstrap** demo server :
```
wget https://hudson.eclipse.org/leshan/job/leshan/lastSuccessfulBuild/artifact/leshan-bsserver-demo.jar
java -jar ./leshan-bsserver-demo.jar
```

Compile Leshan & Run Demos
-------------
Get sources :
```bash
#using ssh
git clone git@github.com:eclipse/leshan.git
#using https
git clone https://github.com/eclipse/leshan.git

```

Compile it, by running in leshan root folder :

```
mvn clean install
```

Run demo **server**:
```
java -jar leshan-server-demo/target/leshan-server-demo-*-SNAPSHOT-jar-with-dependencies.jar 
```

Connect on Leshan demo UI: http://localhost:8080  
Leshan server Demo provides a very simple UI to get the list of connected clients and interact with clients resources.

Now you can register a LWM2M client by running our **client** demo:
```
java -jar leshan-client-demo/target/leshan-client-demo-*-SNAPSHOT-jar-with-dependencies.jar 
```
or trying the [Eclipse Wakaama](http://eclipse.org/wakaama) test client.

You can also try our **bootstrap** demo server:
```
java -jar leshan-bsserver-demo/target/leshan-bsserver-demo-*-SNAPSHOT-jar-with-dependencies.jar 
```

![Leshan](https://eclipse.org/leshan/img/capture_for_github.png)

Code with eclipse
-----------------
You need to add the M2_REPO to your java classpath variables. To do that you can execute the following command:

```
mvn -Declipse.workspace=<path-to-eclipse-workspace> eclipse:add-maven-repo
```
An eclipse restart is needed (if you already have it open).

You can also do that inside eclipse: From the menu bar, select Window > Preferences. Select the *Java > Build Path > Classpath Variables* page.

Now, you need to eclipsify leshan java projects,so run:

```
mvn eclipse:eclipse
```

Modules
-----------------
`leshan-core` : commons elements.  
`leshan-core-cf` : commons elements which depend on [californium](https://github.com/eclipse/californium).  
`leshan-server-core` : server lwm2m logic.  
`leshan-server-cf` : server implementation based on [californium](https://github.com/eclipse/californium).  
`leshan-client-core` : client lwm2m logic.  
`leshan-client-cf` : client implementation based on [californium](https://github.com/eclipse/californium).  
`leshan-all` : all previous modules in 1 jar.  
`leshan-client-demo` : a simple demo client.  
`leshan-server-demo` : a lwm2m demo server with a web UI.  
`leshan-bsserver-demo` : a bootstrap demo server with a web UI.  
`leshan-integration-tests` : integration automatic tests.  

