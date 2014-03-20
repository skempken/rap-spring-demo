#rap-spring-demo

Example project of how RAP may be integrated with Spring.

## About 
It shows some aspects of Spring integration:

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
