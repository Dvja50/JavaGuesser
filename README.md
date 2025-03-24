# JavaGuesser

Menu and Main loop Algorthm

- Start program
1. Create a scanner object to read user input
2. Create a random number generator for the game
3. Repeat until the user chooses to exit :

   a. Display menu options
   - 0) Exit
     1) Human Guesser
     2) Computer Guesser
  b. Ask for user choice (input a number)
Then process the choice
if 1, call humanGuesser().
if 2, call computerGuesser()
if 0 break the loop and exit
4. Print Goodbye then end the program

Human Guesser Algorithm
1. Generate a random number between 1 and 100
2. set attempts = 0
3. Repeat until the user guesses correctly:
   a. Increase attempts by 1
   b. Ask the user to enter a guess
   c. If the guess is too low print "Too low"
   d. if guess is too high, print "Too high"
   e. If the guess it correct print "Got it Good JOB" and end the loop
4. Return to main menu

Computer Guesser Algorithm

1. Ask the user to think of a number between 1 and 100
2. set low = 1, high = 100
3. Set attempts = 0
4. Repeat until the computer find the correct number::
   a. Calculate guess = (low + high) / 2
   b. Increase attempts by 1
   c. Print "I guess: [guess]"
   d. Ask "Too (H)igh, too (L)ow, or (C)orrect?"
   e. process user response:
   - If "H", update high = guess - 1
   - If "L", update low = guess + 1
   - If (C), print "Yay I found your number!"
   - Return to the main menu

If choice == 0 
a. print "Goodbye"
b . close the scanner (Stop taking input)
c. End the program
   
