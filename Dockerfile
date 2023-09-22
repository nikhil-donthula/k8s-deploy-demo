FROM bitnami/java:17

EXPOSE 8080

WORKDIR /app

COPY /build/libs/k8s-deploy-demo-0.0.1-SNAPSHOT.jar /app/k8s-deploy-demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "./k8s-deploy-demo-0.0.1-SNAPSHOT.jar"]
