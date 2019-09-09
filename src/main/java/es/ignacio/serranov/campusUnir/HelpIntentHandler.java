package es.ignacio.serranov.campusUnir;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;
import static es.ignacio.serranov.campusUnir.CampusUnirStreamHandler.CARD_TITLE;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class HelpIntentHandler implements RequestHandler {

	@Override
	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.HelpIntent"));
	}

	@Override
	public Optional<Response> handle(HandlerInput input) {
		String text = "Ayuda. Estas son las opciones que puedes consultar en Campus UNIR: novedades, asignaturas, calendario de eventos, tareas pendientes.";
		return input.getResponseBuilder()
				.withSpeech(text)
				.withSimpleCard(CARD_TITLE, text)
				.withReprompt(text)
				.build();
	}
}
