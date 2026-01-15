# 🧠 Percepta – InsightEngine

**Percepta** is a JavaFX-based psychometric assessment application that evaluates a user’s **dominant perception style** through a structured questionnaire and presents results using **animated visual feedback and explainable insights**.

The system focuses on *how people perceive, learn, and process information* rather than right-or-wrong answers.

---

## ✨ Key Features

- 🎯 **15-question perception assessment**
- 🧩 Evaluates 5 perception styles:
    - Visual
    - Auditory
    - Kinesthetic
    - Analytical
    - Intuitive
- 📊 **Animated progress bars** with percentage values
- 🧠 **Dominant perception identification** with explanation
- 🔄 **Retake test** functionality
- 🎨 **Modern card-based UI** using JavaFX + CSS
- ⚡ Smooth **micro-animations** (fade-in, scaling)
- 🧱 Clean **MVC architecture**

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 21)
- **UI Framework:** JavaFX
- **Architecture:** MVC (Model–View–Controller)
- **Styling:** JavaFX CSS
- **Build Tool:** Maven
- **IDE:** IntelliJ IDEA

---

## 🧠 Perception Types Explained

| Type | Description |
|----|----|
| **Visual** | Learns best through images, diagrams, and visual patterns |
| **Auditory** | Prefers listening, discussions, and verbal explanations |
| **Kinesthetic** | Understands through hands-on experience and movement |
| **Analytical** | Thinks logically, step-by-step, and structurally |
| **Intuitive** | Relies on instincts, patterns, and abstract connections |

---

## 📐 Application Flow

1. User starts the assessment
2. Answers 15 perception-based questions
3. Each response contributes to a perception score
4. Final results are calculated dynamically
5. Results screen displays:
    - Dominant perception
    - Explanation
    - Animated bars with percentages
6. User can retake the test

---

## 🧩 Project Structure
```bash 
Percepta/
├── src/main/java
│   ├── controller
│   │   ├── MainController.java
│   │   ├── QuestionController.java
│   │   └── ResultController.java
│   ├── model
│   │   ├── Question.java
│   │   ├── Option.java
│   │   └── PerceptionType.java
│   └── service
│       └── QuestionBank.java
│
├── src/main/resources
│   ├── fxml
│   │   ├── main.fxml
│   │   ├── question.fxml
│   │   └── result.fxml
│   └── css
│       └── styles.css
│
└── pom.xml
```
---

## 🚀 How to Run

### Prerequisites
- JDK 21+
- Maven
- JavaFX dependencies (handled via Maven)

### Run the application
```bash
mvn clean javafx:run
```

## 🎓 Academic Relevance

This project demonstrates:

- JavaFX UI development

- Event-driven programming

- Dynamic FXML loading

- Java collections & enums

- UI/UX design principles

- Modular and extensible architecture

Suitable for:

- College mini / major projects

- JavaFX learning demonstrations

- Resume & portfolio showcase


## 👨‍💻 Author

*Kevin K R*\
Computer Science & Engineering
Java | JavaFX | UI/UX | Problem Solving