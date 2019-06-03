package com.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class StreamKafkaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(StreamKafkaClient2Application.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void recieve(String msg){
		System.out.println("instance 2 recieve msg: "+msg);
	}
}
