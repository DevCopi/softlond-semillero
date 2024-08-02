package co.com.softlond.appservice;

import java.time.Duration;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import reactor.core.publisher.Mono;

@SpringBootApplication
@ComponentScan(basePackages = { "co.com.softlond" })

public class AppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppServiceApplication.class, args);

		Mono.just("Hello WebFlux!").subscribe(System.out::println);

		// Mono.just("Cartagena")
		// 		.map(String::toUpperCase)
		// 		.subscribe(System.out::println);

		// Flux.range(1, 20)
		// 		.filter(n -> n % 2 != 0)
		// 		.map(n -> n * 3)
		// 		.subscribe(System.out::println);

		// Flux.zip(
		// 		Flux.range(1, 5),
		// 		Flux.range(6, 5),
		// 		(a, b) -> a + b).subscribe(System.out::println);

		// Flux.range(1, 20)
		// 		.filter(n -> n % 3 == 0 && n % 5 == 0)
		// 		.subscribe(System.out::println);

		// Flux.range(1, 10)
		// 		.filter(n -> n > 5)
		// 		.reduce(0, Integer::sum)
		// 		.subscribe(System.out::println);

		// Flux.merge(
		// 		Flux.just(1, 2, 3, 4, 5),
		// 		Flux.just(3, 4, 5, 6, 7))
		// 		.distinct()
		// 		.subscribe(System.out::println);

		// Flux.just(
		// 		Arrays.asList(1, 2),
		// 		Arrays.asList(3, 4),
		// 		Arrays.asList(5, 6))
		// 		.flatMap(list -> Flux.fromIterable(list))
		// 		.subscribe(System.out::println);

		// Flux.concat(
		// 		Flux.range(1, 3),
		// 		Flux.range(4, 6))
		// 		.delayElements(Duration.ofSeconds(1))
		// 		.subscribe(System.out::println);

		// Flux.range(1, 10)
		// 		.buffer(3)
		// 		.flatMap(list -> Flux.just(list.stream().reduce(1, (a, b) -> a * b)))
		// 		.subscribe(System.out::println);

		// Flux.range(1, 10)
		// 		.skipWhile(n -> n <= 5)
		// 		.subscribe(System.out::println);

		// class Producto {
		// 	String nombre;
		// 	double precio;

		// 	Producto(String nombre, double precio) {
		// 		this.nombre = nombre;
		// 		this.precio = precio;
		// 	}

		// 	@Override
		// 	public String toString() {
		// 		return "Producto{nombre='" + nombre + "', precio=" + precio + "}";
		// 	}
		// }

		// Flux<String> nombres = Flux.just("Laptop", "Teléfono", "Tablet");
		// Flux<Double> precios = Flux.just(999.99, 499.99, 299.99);

		// Flux.zip(nombres, precios, Producto::new)
		// 		.subscribe(System.out::println);

		// Flux.range(0, 10)
		// 		.map(n -> 100 / n)
		// 		.onErrorResume(e -> Flux.just(-1))
		// 		.subscribe(System.out::println);

		// Flux.range(1, 20)
		// 		.window(5)
		// 		.flatMap(window -> window.reduce(0, Integer::sum))
		// 		.subscribe(System.out::println);

		// class Persona {
		// 	String nombre;
		// 	String apellido;
		// 	int edad;

		// 	Persona(String nombre, String apellido, int edad) {
		// 		this.nombre = nombre;
		// 		this.apellido = apellido;
		// 		this.edad = edad;
		// 	}
		// }

		// Flux.just(
		// 		new Persona("Juan", "Pérez", 30),
		// 		new Persona("María", "González", 25),
		// 		new Persona("Carlos", "Rodríguez", 40),
		// 		new Persona("Ana", "Martínez", 35),
		// 		new Persona("Luis", "Sánchez", 28))
		// 		.flatMap(p -> Mono.just(p.nombre + " " + p.apellido)
		// 				.delayElement(Duration.ofSeconds(p.edad / 10)))
		// 		.subscribe(System.out::println);

		// Flux.merge(Flux.range(1, 5), Flux.range(6, 5))
		// 		.filter(n -> n % 2 == 0)
		// 		.map(n -> n * 10)
		// 		.distinct()
		// 		.collectList()
		// 		.subscribe(System.out::println);

	}

}