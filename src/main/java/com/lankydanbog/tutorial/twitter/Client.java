package com.lankydanbog.tutorial.twitter;

import org.springframework.web.reactive.function.client.WebClient;

public class Client {

  private WebClient client = WebClient.create("https://twitter.com");

  // powertrack - uses basic auth - email + pw combo
  // GET /track/:stream

  public void run() {
    client.get().uri("/track").exchange().subscribe(r -> System.out.println(r));
  }
}
