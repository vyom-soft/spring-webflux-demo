package de.vm.webflux.demo;

import de.vm.webflux.demo.model.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebClientTest {
    @LocalServerPort
    private int port;
    @Autowired
    @Test
    public void getEmptyEmployeeForGiveId() throws Exception {
        WebClient client = WebClient.create("http://localhost:" + port);

        Mono<ClientResponse> result = client.get()
                .uri("/97")
                .accept(MediaType.TEXT_PLAIN)
                .exchange();
        Employee empResult = result.flatMap(res -> res.bodyToMono(Employee.class)).block();
        result.subscribe(System.out::println);
    }
}
