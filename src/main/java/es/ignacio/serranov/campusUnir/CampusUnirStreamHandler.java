package es.ignacio.serranov.campusUnir;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class CampusUnirStreamHandler extends SkillStreamHandler {

	static final String CARD_TITLE = "Campus UNIR";

	public CampusUnirStreamHandler() {
		super(getSkill());
	}

	private static Skill getSkill() {
		return Skills.standard()
				.addRequestHandlers(
						new LaunchRequestHandler(),
						new CancelAndStopIntentHandler(),
						new NewsIntentHandler(),
						new SubjectIntentHandler(),
						new CalendarIntentHandler(),
						new AssignmentIntentHandler(),
						new HelpIntentHandler()
				).build();
	}
}
