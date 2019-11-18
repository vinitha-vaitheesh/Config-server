# Config-server

we have to create a config server by using @EnableConfigServer
The config client application.properties should changed to bootstrap.properties
@value(${}) string won't get refreshed
@conditionalproperties("limits") will be get changed if i will change the property in git
