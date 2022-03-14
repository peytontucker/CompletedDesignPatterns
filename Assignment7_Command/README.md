# CommandDesignPattern
implementing the Command Design Pattern to create a very simple hero game.

This small project will be done in teams.
Make sure that you have a github student account so that all team members can be on the repo at once, and I can view the commit history.
Each team member must be equally contributing to the project, through git.
You will be setting up your work environment to use git and java together.
Each team member must have a minimum of 2 commits.
Command Design Pattern
You will be implementing the Command Design Pattern to create a very simple hero game.

You will have 4 command classes, one for each movement type, and quitting:

JumpCommand
FireCommand
RunCommand
QuitCommand
Player:

When you call methods, different messages will display:

Player(): Our hero is born

jump(): 

Loop through the jump.txt file, display 6 lines of the file at a time,  sleep for a brief period of time, then clear the console
Continue to do this until the file is empty
This should make the player look like he is jumping on the console.
fire(): 


Loop through the fire.txt file, display 3 lines of the file at a time,  sleep for a brief period of time, then clear the console
Continue to do this until the file is empty
This should make the player look like he is firing a weapon on the console.
runForward(): 


Loop through the jump.txt file, display 3 lines of the file at a time,  sleep for a brief period of time, then clear the console
Continue to do this until the file is empty
This should make the player look like he is running on the console.

InputHandler
Holds a hashmap for the commands, and their input keys

It is initialized in the constructor

key -> value

"jump"-> JumpCommand

"run" -> RunCommand

"fire" -> FireCommand

"quit" ->QuitCommand

buttonPressed:

When this method is called you will call the appropriate command that's key matches the input button value.



Code you can use to sleep and clear the console.

import java.util.concurrent.TimeUnit;

private void sleep(int num) {
    try {
        TimeUnit.MILLISECONDS.sleep(num);
    } catch (Exception e) {
        System.out.println("Timmer error");
    }
}

private void clear() {
    System.out.print("\033[H\033[2J");
}



Attached

You will find:

UML Diagram, your program must match this diagram
Driver, your program must compile and run with the driver
Sample Output, your program must create the exact same sample output when the driver is run


Submit:


Attach a link to your project on github, this should be in your same repo as your other design patterns, and in an appropriately named folder.  You will lose 5% if your repo isn't well organized, as discussed earlier.
Run your program and create a short, under 1 minute youtube video of you running your code, put a link to your youtube video in dropbox along with your submission.  You will lose 10% for not doing this.
You will lose 10% if you submit it incorrectly, and we have to ask you to invite us or attach the correct link.
You will receive no credit if you do not put your project on github.

Grading:

You must submit on-time. A 25% per day late penalty will be applied.
If your project doesn't compile you will lose an automatic 25%
You must properly comment your code using javaDoc
You must follow the Google Java Style Guide
