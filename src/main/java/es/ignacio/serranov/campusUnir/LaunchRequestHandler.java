package es.ignacio.serranov.campusUnir;

import java.util.Optional;

import static es.ignacio.serranov.campusUnir.CampusUnirStreamHandler.CARD_TITLE;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

public class LaunchRequestHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(Predicates.requestType(LaunchRequest.class));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String text = "Bienvenido al Campus UNIR, pregunta toda la información que necesites.";
		return input.getResponseBuilder()
				.withSpeech(text)
				.withSimpleCard(CARD_TITLE, text)
				.withReprompt(text)
				.build();
	}
}