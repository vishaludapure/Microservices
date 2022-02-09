# 2 way SSL/TLS with spring boot

Example client (nt-gateway) and service (nt-ms) code to show how to get 2 way SSL/TLS setup with self signed certificate.

steps to run the program.

1) Download  nt-gateway and nt-ms projects . 
2) open nt-gateway project . go inside nt-gateway folder. then right click on blank space and select open with intellij. then right click onNtGatewayApplication.java and select run.
3) open nt-ms project . go inside nt-ms folder. then right click on blank space and select open with intellij. then right click NtMsApplication.java and select run.
4) upload nt-ms.p12 file(person information exchange file with p12 extension )  into browser(password: nt-service) for identifying client into browser.
5) Then hit https://localhost:9001/requester/nt-msservice on your browser





### Prerequisites

* Java 1.8
* Spring boot 2.1.2
* Java keytool utility
* IntelliJ



