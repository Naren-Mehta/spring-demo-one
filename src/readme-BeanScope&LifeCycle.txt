
Bean Scope Types: Singleton, Prototype, Session, Request

1. Singleton Scope : For every request It will use the same Object

<bean id="myCoach" class="com.naren.springdemo.TrackCoach"> // default scope is singleton
or
<bean id="myCoach" class="com.naren.springdemo.TrackCoach" scope="singleton">

Coach theCoach = context.getBean("myCoach", Coach.class); // Created tow bean object from same bean type
Coach alphaCoach = context.getBean("myCoach", Coach.class); // Created tow bean object from same bean type
boolean result = (theCoach == alphaCoach); // check both object is same or not
System.out.println("==result==" + result); --> true
System.out.println(alphaCoach+"=="+theCoach); check both reference are requal or not --> true same hashcode


2. Prototype Scope: For every request it will create a  new Object

<bean id="myCoach" class="com.naren.springdemo.TrackCoach" scope="prototype">

Coach theCoach = context.getBean("myCoach", Coach.class); // Created two bean object from same bean type
Coach alphaCoach = context.getBean("myCoach", Coach.class); // Created two bean object from same bean type
boolean result = (theCoach == alphaCoach); // check both object is same or not
System.out.println("==result==" + result); --> false
System.out.println(alphaCoach+"=="+theCoach); check both reference are equal or not --> false different same hashcode


======================================Bean Lifecycle======================================>

Container Started --> Bean Instantiated --> Dependency Injected -->
--> Internal Spring Processing --> Your custom init method --> Bean is ready to use -->

Init Method configuration================================================================>

	<bean id="myCoach" class="com.naren.springdemo.TrackCoach" scope="prototype" init-method="doMyStuff">

Destroy Method configuration================================================================>'

	<bean id="myCoach" class="com.naren.springdemo.TrackCoach" init-method="doMyStuff" destroy-method="destroyMyDoStuff">

// Destroy method didn't work with scope="prototype" 






