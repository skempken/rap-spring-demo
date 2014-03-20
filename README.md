#rap-spring-demo

Example project of how Eclipse RAP (http://eclipse.org/rap/) may be integrated with Spring into a plain Java web application (WAR packaging). 

## About 
This project shows some aspects of RAP/Spring integration. I intend to write some blog posts about this, please be patient. In the meantime, have a look at the code.

### Tapping into Spring web application context
See classes:
- com.github.skempken.rapdemo.spring.SpringEntryPointFactory
- com.github.skempken.rapdemo.RapDemoApplicationConfiguration
- com.github.skempken.rapdemo.RapDemoEntryPoint

### Using Spring beans as view controllers

See classes:
- com.github.skempken.rapdemo.view.ViewController
- com.github.skempken.rapdemo.view.GreetingViewController

### Tying Spring beans to RAP's UISession scope

See classes:
- com.github.skempken.rapdemo.spring.UISessionScope
- com.github.skempken.rapdemo.view.GreetingViewController
- File: /src/main/webapp/WEB-INF/applicationContext.xml

## Build and run

To build and run, use:

    mvn jetty:run

The application will be available at:

    http://localhost:8080/rap-spring-demo/demo
