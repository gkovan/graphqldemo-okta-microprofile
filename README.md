# MicroProfile generated Application

## Introduction

MicroProfile Starter has generated this MicroProfile application for you.

The generation of the executable jar file can be performed by issuing the following command

    mvn clean package

This will create an executable jar file **graphqldemo-okta-microprofile.jar** within the _target_ maven folder. This can be started by executing the following command

    java -jar target/graphqldemo-okta-microprofile.jar


### Liberty Dev Mode

During development, you can use Liberty's development mode (dev mode) to code while observing and testing your changes on the fly.
With the dev mode, you can code along and watch the change reflected in the running server right away; 
unit and integration tests are run on pressing Enter in the command terminal; you can attach a debugger to the running server at any time to step through your code.

    mvn liberty:dev


To launch the test page, open your browser at the following URL

    http://localhost:9080/index.html  



## Specification examples

By default, there is always the creation of a JAX-RS application class to define the path on which the JAX-RS endpoints are available.

Also, a simple Hello world endpoint is created, have a look at the class **HelloController**.

More information on MicroProfile can be found [here](https://microprofile.io/)


### Okta GraphQL microprofile tutorial

The tutorial is located:  https://developer.okta.com/blog/2021/01/11/microprofile-graphql

To start the server:

```
mvn liberty:run
```

GraphQL query passing in a valid JWT Bearer token
```
http POST :9080/graphql query='{ surfReport(location:"Texas") {location,chanceOfRainPercent,windKnots,windDirection,swellHeight,swellPeriodSeconds} }' \
"Authorization: Bearer $TOKEN"
```

Note: Tot get a JWT token:

Step 1:  Get an authorization code:
```
https://oidcdebugger.com/ 
```

Step 2:  Get a JWT access token:
```
http -f https://dev-4163315.okta.com/oauth2/default/v1/token \
grant_type=authorization_code \
code=6O5C3XUSmtbVDAj0-v9mpCgF5ttaH2t1pMqT7s2HvTQ \
client_id=0oa5dbwp1CFdaXOZI5d6 \
client_secret=kNbciyJs9hOgC4t88mG0_V15EKPa7_dfrXiEk9wz \
redirect_uri=https://oidcdebugger.com/debug
```

Note: replace value for code with the value you got in Step 1

















