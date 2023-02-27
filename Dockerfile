FROM openjdk:11

WORKDIR /exam

COPY . /exam/

RUN javac GiveSum.java

ENTRYPOINT [ "java", "GiveSum" ]