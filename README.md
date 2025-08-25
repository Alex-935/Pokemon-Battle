## Pokemon Battle Program

- Created using Object-Oriented Program
- Was created by myself without any help or external programming resources (only referenced material was the official Pokemon stats, move stats, diologue and calculations)
- Written in Java using VS Code
  
- Main Features:
  - Allows move types to affect battle (Super effective, Not very effective, Does not affect).
  - Allows 6v6 Battling.
  - Switch your active Pokemon during battle (Set switching).
  - Ability to select your Pokemon, the trainer / trainer's Pokemon, your moves each turn. (All inputs validated)
  - Checks that a user has enough PP (Power Points) to use their chosen move.
  - Advances Damage Calculation.
     - Calculations use the official damage formula.
     - Move Accuracy.
     - Speed stat determines move order. In the event of a speed tie, the order is randomly decided.
     - Move priority (such as Extreme Speed, having +2 priority, allows the user to go first regardless of speed stats).
     - STAB - Same-Type Attack Bonus.
     - Critical Hits.
     - Randomly fluctuating damage.
  - Custom victory message based on which trainer you beat (or a loss message if you fail, but hopefully not ;) ).


# Features in more detail

 - UI uses the same text as the official games. Layout is as close as I can ~~neatly~~ get it inside the terminal:
   
<img width="815" height="455" alt="pokemonBattle welcome message" src="https://github.com/user-attachments/assets/1989b7a2-32a0-4a91-853f-1ec00ea173eb" />

 - OOP used to create Pokemon, Moves and Trainers

 <img width="804" height="229" alt="pokemonBattle oop" src="https://github.com/user-attachments/assets/a9a36cf9-f90c-4356-8f78-2bf2acc0c2bf" />

 - Generates Weakness Chart for both mono and dual-type Pokemon

   <img width="1881" height="1142" alt="pokemonBattle typeChart" src="https://github.com/user-attachments/assets/ceb40b2b-16a1-4bd5-a8ea-dcd03670867c" />

 - Type charts affect move damage, including immunities
   

<img width="698" height="473" alt="pokemonBattle Super Effective" src="https://github.com/user-attachments/assets/a113a038-7e40-4ba5-b8a0-76d418e366e7" />

- Allows Full 6v6 Battles


<img width="1386" height="1234" alt="pokemonBattle Whole Team" src="https://github.com/user-attachments/assets/659b356e-2249-47c8-9812-f8b7b45dbce3" />


- Allow the user to switch Pokemon during battle. (Set switching - switching is instead of using a move).

  <img width="1234" height="806" alt="Set Switching" src="https://github.com/user-attachments/assets/a683e021-76ab-4184-8262-2c80665fa678" />


- Checks users have nough PP to use a certain move

<img width="923" height="432" alt="pokemonBattle PP chech" src="https://github.com/user-attachments/assets/10ab64b8-4bcd-4f12-8631-7de77a6b9169" />


 - Added Dynamic Battle Screen
 
<img width="816" height="538" alt="pokemonBattle dynamic battle screen" src="https://github.com/user-attachments/assets/54e21837-3892-465b-9f7e-162c6d2b1bf5" />

 - Validation on move selection
    - Choose your Pokemon
        - Choosing your pokemon changes the move pool
    - Choose the Trainer you want to face
    - Choose your move
  
<img width="944" height="574" alt="pokemonBattle Choose Pokemon" src="https://github.com/user-attachments/assets/ccc0091c-e06a-4cef-9e9d-45e154d2425c" />

 - All user inputs validated

<img width="810" height="416" alt="pokemonBattle Validation on move selection" src="https://github.com/user-attachments/assets/1a6a8096-ce4b-42de-b5b9-0f934a576295" />

  - Get a different victory message based on your opponent

<img width="1118" height="618" alt="pokemonBattle Custom Battle" src="https://github.com/user-attachments/assets/5001d540-9f26-42be-bd29-ae4c8ab1a5a5" />

 - Various features shown below:
      - Code is modular to take advantage of reusable components
      - Fastest Pokemon moves first
      - Correct Hp shown when damage is dealt (will not drop below 0)
      - Custom message based on wether you won or lost
        
<img width="1033" height="1067" alt="pokemonBattle various features" src="https://github.com/user-attachments/assets/300b0092-ce91-412d-98a3-3a831b66b511" />

 - Battle will loop until a Pokemon faints

<img width="879" height="430" alt="pokemonBattle Loops through" src="https://github.com/user-attachments/assets/26e5dc75-ab45-4cc8-acdf-957452533a5c" />

 - Uses Random to select the computer's moves and resolve speed ties (when both Pokemon have the same speed stat):
   
<img width="1105" height="730" alt="pokemonBattle Speed Ties" src="https://github.com/user-attachments/assets/46cba1d2-0686-4120-877c-7a397dd5eceb" />

 - Includes damage multipliers such as STAB and the Physical/Special Move Split:
      - STAB - Same Type Attack Bonus: Attacks deal 1.5x damage is the Pokemon and move are of the same type.
      - Phys/Spec split uses Atk & Def/ SpAtk & SpDef to calculate move damage.
      - Randomised Damage between 0.85x and 1x overall damage
      - Attacks have a chance to miss based off the attack's accuracy

   
<img width="1339" height="952" alt="pokemonBattle stab and psysSpec" src="https://github.com/user-attachments/assets/e5f7124e-ee44-45cb-ba36-12b3c78702b6" />

<img width="736" height="441" alt="pokemon randomisedDamage#" src="https://github.com/user-attachments/assets/87bde0e1-68eb-46fd-82c9-a745e0ae1d70" />

<img width="695" height="304" alt="pokemonBattle Attack accuracy" src="https://github.com/user-attachments/assets/b8fd2a53-2b4a-4fdb-b6a5-e22d5e3b9847" />

- Added move priority. Metagross is slower than Garchomp, but Bullet Punch's priority allows Metagross to attack first.

<img width="615" height="353" alt="pokemon Battle speed priority" src="https://github.com/user-attachments/assets/a22548ba-67ee-4dda-8068-a46527adbce0" />

