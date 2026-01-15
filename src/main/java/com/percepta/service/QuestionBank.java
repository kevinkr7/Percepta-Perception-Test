package com.percepta.service;

import com.percepta.model.*;

import java.util.List;

public class QuestionBank {

    public static List<Question> getQuestions() {
        return List.of(

                new Question(
                        "When learning something new, you prefer to:",
                        List.of(
                                new Option("See diagrams or visuals", PerceptionType.VISUAL),
                                new Option("Listen to explanations", PerceptionType.AUDITORY),
                                new Option("Try it hands-on", PerceptionType.KINESTHETIC),
                                new Option("Understand the logic behind it", PerceptionType.ANALYTICAL),
                                new Option("Go with intuition", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You remember things best when you:",
                        List.of(
                                new Option("Picture them in your mind", PerceptionType.VISUAL),
                                new Option("Repeat them aloud", PerceptionType.AUDITORY),
                                new Option("Physically do them", PerceptionType.KINESTHETIC),
                                new Option("Break them into steps", PerceptionType.ANALYTICAL),
                                new Option("Feel emotionally connected", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "When giving directions, you usually:",
                        List.of(
                                new Option("Draw or visualize the route", PerceptionType.VISUAL),
                                new Option("Explain verbally", PerceptionType.AUDITORY),
                                new Option("Use gestures or actions", PerceptionType.KINESTHETIC),
                                new Option("Describe step-by-step instructions", PerceptionType.ANALYTICAL),
                                new Option("Describe landmarks intuitively", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "In a classroom, you are more engaged when:",
                        List.of(
                                new Option("There are slides or visuals", PerceptionType.VISUAL),
                                new Option("The teacher explains clearly", PerceptionType.AUDITORY),
                                new Option("There are activities or demos", PerceptionType.KINESTHETIC),
                                new Option("Concepts are logically structured", PerceptionType.ANALYTICAL),
                                new Option("Ideas feel interesting or inspiring", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "When solving a problem, you first:",
                        List.of(
                                new Option("Visualize the problem", PerceptionType.VISUAL),
                                new Option("Talk it through", PerceptionType.AUDITORY),
                                new Option("Try different approaches physically", PerceptionType.KINESTHETIC),
                                new Option("Analyze all details", PerceptionType.ANALYTICAL),
                                new Option("Trust your gut feeling", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You enjoy movies more when they have:",
                        List.of(
                                new Option("Strong visuals and cinematography", PerceptionType.VISUAL),
                                new Option("Great dialogues and sound", PerceptionType.AUDITORY),
                                new Option("Action and movement", PerceptionType.KINESTHETIC),
                                new Option("Complex plotlines", PerceptionType.ANALYTICAL),
                                new Option("Emotional depth", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You prefer instructions that are:",
                        List.of(
                                new Option("Shown with images", PerceptionType.VISUAL),
                                new Option("Spoken clearly", PerceptionType.AUDITORY),
                                new Option("Demonstrated", PerceptionType.KINESTHETIC),
                                new Option("Written step-by-step", PerceptionType.ANALYTICAL),
                                new Option("Flexible and open-ended", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "When recalling a memory, you mostly remember:",
                        List.of(
                                new Option("What you saw", PerceptionType.VISUAL),
                                new Option("What was said", PerceptionType.AUDITORY),
                                new Option("What you did", PerceptionType.KINESTHETIC),
                                new Option("The sequence of events", PerceptionType.ANALYTICAL),
                                new Option("How it felt", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You learn a new skill best by:",
                        List.of(
                                new Option("Watching someone do it", PerceptionType.VISUAL),
                                new Option("Listening to instructions", PerceptionType.AUDITORY),
                                new Option("Practicing it yourself", PerceptionType.KINESTHETIC),
                                new Option("Studying the theory", PerceptionType.ANALYTICAL),
                                new Option("Exploring freely", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "In group discussions, you tend to:",
                        List.of(
                                new Option("Observe body language", PerceptionType.VISUAL),
                                new Option("Focus on what is said", PerceptionType.AUDITORY),
                                new Option("React physically or emotionally", PerceptionType.KINESTHETIC),
                                new Option("Evaluate arguments logically", PerceptionType.ANALYTICAL),
                                new Option("Sense the overall mood", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You feel most confident when:",
                        List.of(
                                new Option("You can see the outcome clearly", PerceptionType.VISUAL),
                                new Option("You can explain it verbally", PerceptionType.AUDITORY),
                                new Option("You have practiced it", PerceptionType.KINESTHETIC),
                                new Option("You understand it deeply", PerceptionType.ANALYTICAL),
                                new Option("It feels right internally", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "When reading, you focus more on:",
                        List.of(
                                new Option("Images or diagrams", PerceptionType.VISUAL),
                                new Option("The sound of the words", PerceptionType.AUDITORY),
                                new Option("Acting out scenes", PerceptionType.KINESTHETIC),
                                new Option("Meaning and structure", PerceptionType.ANALYTICAL),
                                new Option("Underlying themes", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You prefer learning environments that are:",
                        List.of(
                                new Option("Visually stimulating", PerceptionType.VISUAL),
                                new Option("Quiet with clear explanations", PerceptionType.AUDITORY),
                                new Option("Interactive", PerceptionType.KINESTHETIC),
                                new Option("Organized and systematic", PerceptionType.ANALYTICAL),
                                new Option("Creative and flexible", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "When making decisions, you rely on:",
                        List.of(
                                new Option("What you see as evidence", PerceptionType.VISUAL),
                                new Option("Advice from others", PerceptionType.AUDITORY),
                                new Option("Past experiences", PerceptionType.KINESTHETIC),
                                new Option("Data and analysis", PerceptionType.ANALYTICAL),
                                new Option("Your inner voice", PerceptionType.INTUITIVE)
                        )
                ),

                new Question(
                        "You understand concepts best when they are:",
                        List.of(
                                new Option("Illustrated visually", PerceptionType.VISUAL),
                                new Option("Explained verbally", PerceptionType.AUDITORY),
                                new Option("Experienced physically", PerceptionType.KINESTHETIC),
                                new Option("Broken into logical steps", PerceptionType.ANALYTICAL),
                                new Option("Connected intuitively", PerceptionType.INTUITIVE)
                        )
                )
        );
    }

}
