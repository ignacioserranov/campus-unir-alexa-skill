package es.ignacio.serranov.campusUnir;

import java.util.Optional;

import static es.ignacio.serranov.campusUnir.CampusUnirStreamHandler.CARD_TITLE;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

public class HelloWorldIntentHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.intentName("HelloWorldIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String text = "Hola mundo Campus UNIR.";
		return input.getResponseBuilder()
				.withSpeech(text)
				.withReprompt(text)
				.withSimpleCard(CARD_TITLE, text)
				.build();
	}
}
