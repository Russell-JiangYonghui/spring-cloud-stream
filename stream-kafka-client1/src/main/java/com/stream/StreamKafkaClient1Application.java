package com.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class StreamKafkaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(StreamKafkaClient1Application.class, args);
	}

	@StreamListener(Sink.INPUT)
	public void recieve(String msg){
		System.out.println("instance 1 recieve msg: "+msg);
	}
}
