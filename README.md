# BluestaqFirstRoundProject
🏙️ Bluestaq Take-Home Challenge: Elevator Simulation
📘 Overview

This repository contains my solution for the Bluestaq Software/UI Internship — “The Elevator” (Back-End Code Challenge).
The program simulates a single elevator moving between floors based on user requests.

It demonstrates:

Object-Oriented Programming (OOP) principles

Queue-based request management

Sequential state updates with realistic timing

Readable console output for easy discussion during the interview

Language used: Java 21
Platform: Tested with VS Code and Java JDK 21

🚀 How to Run
1. Clone or download this repository
git clone https://github.com/<yourusername>/Bluestaq-Elevator-Challenge.git
cd Bluestaq-Elevator-Challenge

2. Compile the files
javac Elevator.java Main.java

3. Run the program
java Main


You should see the elevator log output step-by-step in your terminal.

🧩 Project Structure
Bluestaq-Elevator-Challenge/
│
├── Elevator.java     # Core logic class defining elevator behavior and queue system
├── Main.java         # Driver class (entry point) that runs the simulation
└── README.md         # Documentation (this file)

🧠 Design Explanation
🏗️ Class Design
Elevator.java

Responsible for maintaining elevator state and logic:

Tracks current floor, direction, and pending requests.

Uses a Queue<Integer> (FIFO) to manage incoming floor requests.

Moves one floor per “step” to simulate real elevator travel.

Opens doors upon arrival and removes the completed request.

Main.java

Acts as the main driver:

Initializes an elevator instance.

Adds sample requests (e.g., 5, 2, 8).

Calls elevator.step() repeatedly until all requests are served.

Introduces a 1-second delay between moves using Thread.sleep(1000) to mimic realistic timing.

🧮 Why Use a Queue

An elevator naturally processes requests in the order received — the First-In-First-Out (FIFO) property makes a Queue the best choice.
Each request is enqueued, and when the elevator reaches that floor, it dequeues the task.
This also simplifies direction and target management.

🧱 Why Use Separate Files

Separating logic (Elevator.java) and execution (Main.java) improves readability, reusability, and testing — a standard OOP best practice.

🧩 Assumptions

The building has 10 floors (1–10).

The elevator always starts on floor 1 and initially moves upward.

Only one elevator is simulated.

Each move between floors takes 1 second.

Requests are processed in order received (FIFO).

Invalid floors (below 1 or above 10) are ignored.

Simulated movement only — no GUI or concurrency.

The program ends once all requests are completed.

🛠️ Implemented Features
Feature	Description
Elevator Movement	Moves floor-by-floor, updating direction dynamically
Queue Management	Stores and processes floor requests using FIFO
Door Simulation	Prints a message when arriving at a floor
Realistic Timing	Uses Thread.sleep(1000) to simulate travel delay
Logging	Console messages clearly show progress and current floor
Error Handling	Ignores invalid inputs and handles thread interruptions
Idle Detection	Detects when the elevator is finished and stops simulation
🚫 Unimplemented / Future Features

These features were considered but intentionally not implemented due to time, scope, or challenge focus:

Feature	Description	Reason Not Implemented
Multiple Elevators	Coordinated scheduling between multiple cars	Out of scope for a single-class simulation
Optimized Scheduling	Direction-aware prioritization (nearest-car logic)	Would require more complex request sorting
Interactive Input	Real-time user entry for floor requests	Requires threading and non-blocking I/O
Door Timers	Open/close animations and delays	Cosmetic feature, not core logic
Emergency Stops & Maintenance	System override logic	Not required by challenge specification
Graphical Interface (GUI)	Visual representation of movement	Challenge focused on back-end behavior
Persistent Data Storage	Saving request history or logs	Out of scope for initial challenge
Unit Tests	Automated JUnit tests for edge cases	Optional; can be added later for QA discussion
💡 Future Enhancements

If extended, this project could easily grow into a more advanced simulation:

Support multi-elevator dispatch algorithms (e.g., nearest-car, SCAN, LOOK).

Implement interactive console or GUI where users can request floors in real-time.

Add logging or telemetry output to file or database.

Introduce unit tests and configurable simulation parameters.

Add error recovery for invalid or duplicate requests.

📄 Example Console Output
Request added: 5
Request added: 2
Request added: 8
Elevator at floor: 2 (going up)
Elevator at floor: 3 (going up)
Elevator at floor: 4 (going up)
Elevator at floor: 5 (going up)
Arrived at floor 5. Doors opening...
Elevator at floor: 4 (going down)
Elevator at floor: 3 (going down)
Elevator at floor: 2 (going down)
Arrived at floor 2. Doors opening...
Elevator at floor: 3 (going up)
Elevator at floor: 4 (going up)
Elevator at floor: 5 (going up)
Elevator at floor: 6 (going up)
Elevator at floor: 7 (going up)
Elevator at floor: 8 (going up)
Arrived at floor 8. Doors opening...
All requests completed. Elevator is idle.

🧭 Interview Discussion Points

If asked during the interview, here’s how to discuss your approach:

Design Rationale:

I used OOP to model real-world entities — the elevator as a class with clear responsibilities.

Queue Choice:

I used a FIFO queue to process requests predictably and efficiently.

Trade-offs:

I prioritized clarity and correctness over over-engineering (multi-elevator coordination not required here).

Scalability:

The program can easily evolve to support multiple elevators or real-time user input.

Testing:

It can be unit-tested by mocking floor requests and verifying final states.

🧾 License

This project was created for the Bluestaq 2026 Summer Internship Take-Home Challenge.
All code and documentation are authored by Miheer Dharwadkar.

Would you like me to generate this as a downloadable .md file (so you can drag-drop it into your repo immediately)?
