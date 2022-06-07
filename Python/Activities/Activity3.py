#Activity 3

#Make a two-player Rock-Paper-Scissors game.
#Remember the rules:
#Rock beats scissors
#Scissors beats paper
#Paper beats rock


player1 = input("Player1 : Enter your input = ").lower()
player2 = input("Player2 : Enter your input = ").lower()

if(player1 == player2):
    print("Its a tie, Hence quitting the game!!!")
    raise SystemExit

if (player1 == "rock"):
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
    print("Invalid inputs, Hence quitting the game!!!")