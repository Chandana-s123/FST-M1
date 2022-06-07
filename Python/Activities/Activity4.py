#Rock-Paper-Scissors-2

#Activity 4

#Enhance the previously written Rock-Paper-Scissors code so that it asks the user if they want to play another round.
#If they say 'Yes', the game should begin again.
#If they say 'No', the game should exit.

print("Please Choose any one input : Rock, Paper, Scissors ")

while True:

    player1 = input("Player1 : Enter your input = ").lower()
    player2 = input("Player2 : Enter your input = ").lower()

    if(player1 == player2):
        print("Its a tie, Hence quitting the game!!!")
    elif (player1 == "rock"):
        if(player2 == "scissors"):
            print("player1 won the game")
        else:
            print("player2 won the game")
    elif(player1 == "scissors"):
        if (player2 == "paper"):
            print("player1 won the game")
        else:
            print("player2 won the game")

    elif(player1 == "paper"):
        if (player2 == "rock"):
            print("player1 won the game")
        else:
            print("player2 won the game")
    else:
        print("Invalid inputs")

    playAgain = input("Do you want to play again YES/NO = ").lower()

    if (playAgain == 'yes'):
        pass
    elif(playAgain == 'no'):
        raise SystemExit
    else:
        print("Invalid input, Hence quitting the game!!!")
        raise SystemExit

