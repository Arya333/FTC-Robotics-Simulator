# FTC-Robotics-Simulator

## About the Project

Match generator and competition simulator for robotics teams. This application reads data from excel files to document the historical scores of FTC teams, which is converted into Team objects. Using these historical scores, a realistic score would be generated based on a normal distribution model. This is done for each match in the match schedule. Then, teams are ranked based on various statistical variables (RP, TBP, High Score, Average Score). Matches are created by using an external program called "Matchmaker". All of this work is done to create one simulation. Multiple simulations can be run and the overall rankings across all the simulations can be analyzed.


## Installation

1. Make sure you have installed <a href="https://www.java.com/en/download/manual.jsp">Java</a> on your system
2. Clone the repository
```
git clone https://github.com/Arya333/FTC-Robotics-Simulator.git
```

## Usage

1. Navigate to RobSim\src\ to view the source code
2. Run ```MainWindow.java``` to start the program

After following these steps, a Java Swing GUI window should pop up. To view the teams and their historical scores parsed in from the datasheet, click on the "Teams" tab. To view the matches to be run in the simulation, click on the "Matches" tab. These matches have been parsed in from a datasheet. To automatically generate randomized matches, click on the "Generate Matches from Matchmaker" button. The table of matches should update after a few seconds. 

To run the simulator, navigate to the "Simulator" tab. In the top left input box, select the number of simulations you want to run. Then, click on the "Score Matches" button to run the simulations. Wait for some time (the more simulations you run, the longer it will take). The left table should show the teams and their stats for a specific simulation. To scroll through simulations, use the input box above "Choose which simulation you want to see" and enter the number corresponding to a simulation. The left table should update to the simulation. To rank the teams based on overall stats across all the simulations, click on "Rank Teams". This will update the right table with teams ranked based on total scores from every simulation.

## Demo

https://user-images.githubusercontent.com/43790515/207995822-1f5f1134-682a-4f49-97c9-522dda1e595d.mp4


